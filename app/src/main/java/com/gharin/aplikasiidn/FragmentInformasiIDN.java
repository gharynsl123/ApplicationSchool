package com.gharin.aplikasiidn;


import android.content.Intent;
import android.os.Bundle;
import android.sax.StartElementListener;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentInformasiIDN extends Fragment implements View.OnClickListener{

    CardView Struktur, Presentasi, Lokasi;


    public FragmentInformasiIDN() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_informasi_idn, container, false);

        Struktur = view.findViewById(R.id.Struktur);
        Struktur.setOnClickListener(this);
        Presentasi = view.findViewById(R.id.Presentasi);
        Presentasi.setOnClickListener(this);
        Lokasi = view.findViewById(R.id.Lokasi);
        Lokasi.setOnClickListener(this);




        return view;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.Struktur:
                startActivity(new Intent(getActivity(), Struktur.class));
                break;
            case R.id.Presentasi:
                startActivity(new Intent(getActivity(), Prestasi.class));
                break;
            case R.id.Lokasi:
                startActivity(new Intent(getActivity(),LokasiIDN.class));
                break;

        }

    }
}
