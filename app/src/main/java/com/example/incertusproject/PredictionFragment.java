package com.example.incertusproject;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;
import androidx.appcompat.app.AlertDialog;
import android.widget.ToggleButton;
public class PredictionFragment extends Fragment implements AdapterView.OnItemSelectedListener {

    EditText et_age, et_hsc, et_ssc, et_cgpa, et_back, et_intern;
    Button btn;
    TextView op, pred;
    ToggleButton tb;
    ImageView img, profile;
    String chosen_gender, chosen_stream, data;
    PredictionFragment predictionFragment;
    String url = "https://placement-data-analysis.onrender.com/predict";


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    private String mParam1;
    private String mParam2;

    public PredictionFragment() {
        // Required empty public constructor
    }

    public static PredictionFragment newInstance(String param1, String param2) {
        PredictionFragment fragment = new PredictionFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_prediction, container, false);
        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();

        String[] stream_options = {"Civil Engineering", "Computer Science Engineering", "Electrical Engineering", "Electronics And Communication Engineering", "Information Technology Engineering", "Mechanical Engineering"};

        et_age = view.findViewById(R.id.ip_age);
        et_hsc = view.findViewById(R.id.ip_hsc);
        et_ssc = view.findViewById(R.id.ip_ssc);
        et_cgpa = view.findViewById(R.id.ip_cgpa);
        et_back = view.findViewById(R.id.ip_backlogs);
        et_intern = view.findViewById(R.id.ip_internships);
        btn = view.findViewById(R.id.btn_pred);
        op = view.findViewById(R.id.output);
        pred = view.findViewById(R.id.predTV1);
        tb = view.findViewById(R.id.tb_gender);
        img = view.findViewById(R.id.imageView2);
        profile = view.findViewById(R.id.profile_img);

        Spinner spin = view.findViewById(R.id.gender_spinner);
        spin.setOnItemSelectedListener(this);

        ArrayAdapter aa = new ArrayAdapter(this.getActivity(),android.R.layout.simple_spinner_item,stream_options);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        String gender = tb.getText().toString();
        if(gender.equals("Male")){
            chosen_gender = "1";
        }
        else
        {
            chosen_gender = "2";
        }


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(et_age.getText().toString().equals(""))
                {
                    et_age.setError("Enter Age!");
                }
                else if(et_hsc.getText().toString().equals(""))
                {
                    et_hsc.setError("Enter HSC Percentage!");
                }
                else if(et_ssc.getText().toString().equals(""))
                {
                    et_hsc.setError("Enter SSC Percentage!");
                }
                else if(et_cgpa.getText().toString().equals(""))
                {
                    et_cgpa.setError("Enter CGPA!");
                }
                else if(et_intern.getText().toString().equals(""))
                {
                    et_intern.setError("Enter No. of Internships!");
                }
                else if(et_back.getText().toString().equals(""))
                {
                    et_back.setError("Enter No. of Backlogs!");
                }
                else{
                    StringRequest stringRequest = new StringRequest(Request.Method.POST, url,
                            new Response.Listener<String>() {
                                @Override
                                public void onResponse(String response) {
                                    try {
                                        JSONObject jsonObject = new JSONObject(response);
                                        data = jsonObject.getString("Placed");
                                        op.setText(" " + data + " %");

                                    } catch (JSONException e) {
                                        e.printStackTrace();
                                    }
                                }
                            },
                            new Response.ErrorListener() {
                                @Override
                                public void onErrorResponse(VolleyError error) {
                                    op.setError(error.getMessage());
                                }
                            }){
                        @Override
                        protected Map getParams(){
                            Map params = new HashMap();
                            params.put("Age",et_age.getText().toString());
                            params.put("HSC_P",et_hsc.getText().toString());
                            params.put("SSC_P",et_ssc.getText().toString());
                            params.put("Gender",chosen_gender);
                            params.put("Stream",chosen_stream);
                            params.put("Internships",et_intern.getText().toString());
                            params.put("CGPA",et_cgpa.getText().toString());
                            params.put("HistoryOfBacklogs",et_back.getText().toString());

                            return params;

                        }
                    };

                    RequestQueue queue = Volley.newRequestQueue(getActivity());
                    queue.add(stringRequest);
                }
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), UserProfile.class);
                intent.putExtra("key", data);
                startActivity(intent);
            }
        });




        return view;
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (position){
            case 0 : chosen_stream = "0"; break;
            case 1 : chosen_stream = "1"; break;
            case 2 : chosen_stream = "2"; break;
            case 3 : chosen_stream = "3"; break;
            case 4 : chosen_stream = "4"; break;
            case 5 : chosen_stream = "5"; break;

        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}