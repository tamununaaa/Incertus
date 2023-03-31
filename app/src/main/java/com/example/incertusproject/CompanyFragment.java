package com.example.incertusproject;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.google.common.net.InternetDomainName;
import com.google.firebase.firestore.auth.User;


public class CompanyFragment extends Fragment {

    CardView cv1, cv2, cv3, cv4, cv5, cv6, cv7, cv8, cv9, cv10,
            cv11, cv12, cv13, cv14, cv15, cv16, cv17, cv18, cv19, cv20,
            cv21, cv22, cv23, cv24, cv25, cv26, cv27, cv28, cv29, cv30;




    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public CompanyFragment() {
        // Required empty public constructor
    }


    // TODO: Rename and change types and number of parameters
    public static CompanyFragment newInstance(String param1, String param2) {
        CompanyFragment fragment = new CompanyFragment();
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


        ((AppCompatActivity) getActivity()).getSupportActionBar().hide();
        View view =  inflater.inflate(R.layout.fragment_company, container, false);

        cv1 = view.findViewById(R.id.cv1);
        cv2 = view.findViewById(R.id.cv2);
        cv3 = view.findViewById(R.id.cv3);
        cv4 = view.findViewById(R.id.cv4);
        cv5 = view.findViewById(R.id.cv5);
        cv6 = view.findViewById(R.id.cv6);
        cv7 = view.findViewById(R.id.cv7);
        cv8 = view.findViewById(R.id.cv8);
        cv9 = view.findViewById(R.id.cv9);
        cv10 = view.findViewById(R.id.cv10);
        cv11 = view.findViewById(R.id.cv11);
        cv12 = view.findViewById(R.id.cv12);
        cv13 = view.findViewById(R.id.cv13);
        cv14 = view.findViewById(R.id.cv14);
        cv15 = view.findViewById(R.id.cv15);
        cv16 = view.findViewById(R.id.cv16);
        cv17 = view.findViewById(R.id.cv17);
        cv18 = view.findViewById(R.id.cv18);
        cv19 = view.findViewById(R.id.cv19);
        cv20 = view.findViewById(R.id.cv20);
        cv21 = view.findViewById(R.id.cv21);
        cv22 = view.findViewById(R.id.cv22);
        cv23 = view.findViewById(R.id.cv23);
        cv24 = view.findViewById(R.id.cv24);
        cv25 = view.findViewById(R.id.cv25);
        cv26 = view.findViewById(R.id.cv26);
        cv27 = view.findViewById(R.id.cv27);
        cv28 = view.findViewById(R.id.cv28);
        cv29 = view.findViewById(R.id.cv29);
        cv30 = view.findViewById(R.id.cv30);



        cv1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Amadeus-Labs-7318f829104c4dcfbd6ca8278756d6f5?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Amazon-e089d37f60db41c990d7ae6d6dca4057?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Amdocs-2f5989dcadf44cee9ca67b43033a7a1f?pvs=4"));
                startActivity(urlIntent);
            }
        });


        cv4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Bank-of-America-7f2def2be2864a64a4e146331c708e88?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Citi-984c85f39f9a460c804b101d9909eb0c?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Cogoport-a9bf2a8a2994484c83de2e392d0b815d?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Eli-Lilly-f0df1860f84c4baaa407b7a12252d511?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Ericsson-80fe731d6b754553b2fbdf94470054cc?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Fractal-Analytics-a7c4d5828bd04871bf60da014e22f3f6?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Havells-140a768f115b47b999c619355224e02f?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/IBM-f66bdc684c794c9b877a3b5fcecde7df?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/iDrive-293e24cbf43d47348ec27c65469ed391?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Mercedes-Benz-R-D-fce75b82c50e49b6840ad5ed79185224?pvs=4"));
                startActivity(urlIntent);
            }
        });


        cv14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Microchip-ab7f7a5bdaac41debb34d0cca3be7110?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Pepsico-e765fd2b791d4f098e5d9ea309235225?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/PWC-0d5cc0d6cc8e464896eec1831074631e?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Sapiens-d54cf27a3bf74aeea54b612ce86df40e?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Societe-Generale-096570081684486b964d7a1b27ae76ed?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Tata-Digital-b2eb6ad36d564aa69089842b8c9a1b81?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Wolters-Kluwer-7982f82777384ace906ba0e52c308cff?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Air-Asia-170775e08c254ffa8be31c364fa9e4dd?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/JP-Morgan-fb7a74a74ed143c6b309d030f4b82998?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Natwest-816f4cffb1e440fe920b34251234528a?pvs=4"));
                startActivity(urlIntent);
            }
        });


        cv24.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Verizon-c175e3246c5e46d2b14467fb0a502da8?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/UBS-42d9943b70e24956b51c47292d48a621?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv26.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/JLL-Technologies-c47eab45d7ee45e79dbd822ab7768f8a?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv27.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Hewlett-Packard-Enterprise-fca3d1c9c3a741929a3a35db5676bae5?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv28.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Genpact-91a489fd60bf48e09b4cba4522d60308?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv29.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Expedia-970fb5e11a76489c998df649d9cc7101?pvs=4"));
                startActivity(urlIntent);
            }
        });

        cv30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent urlIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.notion.so/Barclays-17e56d6631dd43028c117a8c9a574672?pvs=4"));
                startActivity(urlIntent);
            }
        });


        return view;
    }
}