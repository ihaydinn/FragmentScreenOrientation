package com.ismailhakkiaydin.fragmentscreenorientation;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {

    TextView text;
    Button buton;
    int sayi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_a, container, false);

        sayi= 0;
        text = view.findViewById(R.id.tvDegistir);
        buton = view.findViewById(R.id.btnGiris);

        if (savedInstanceState != null){
            text.setText(savedInstanceState.getString("tvIcerik"));
            buton.setText(savedInstanceState.getString("btnIcerik"));
        }

        buton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText("Butona tıkladınız");
                buton.setText("tıklandı");
                sayi = 55;
              
            }
        });

        return view;
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {

        outState.putString("tvIcerik", text.getText().toString());
        outState.putString("btnIcerik", buton.getText().toString());

        super.onSaveInstanceState(outState);
    }
}