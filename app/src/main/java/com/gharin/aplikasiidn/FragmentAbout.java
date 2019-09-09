package com.gharin.aplikasiidn;


import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentAbout extends Fragment implements View.OnClickListener {

    LinearLayout imgGharin, imgHarits, imgMiqdad;


    public FragmentAbout() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_about, container, false);

        imgGharin = view.findViewById(R.id.imgGharin);
        imgHarits = view.findViewById(R.id.imgHarits);
        imgMiqdad = view.findViewById(R.id.imgMiqdad);

        imgMiqdad.setOnClickListener(this);
        imgHarits.setOnClickListener(this);
        imgGharin.setOnClickListener(this);

        return view;
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imgGharin:
                startActivity(new Intent(getActivity(), Gharyn.class));
                break;
            case R.id.imgHarits:
                startActivity(new Intent(getActivity(), Harits.class));
                break;
            case R.id.imgMiqdad:
                startActivity(new Intent(getActivity(), Miqdad.class));
                break;
        }

    }
}
