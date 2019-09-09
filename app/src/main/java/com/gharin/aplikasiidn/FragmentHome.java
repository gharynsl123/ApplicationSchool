package com.gharin.aplikasiidn;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.Toast;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageClickListener;
import com.synnapps.carouselview.ImageListener;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentHome extends Fragment implements View.OnClickListener {
    private int[] mImages = new int[]{
            R.drawable.bahan10,
            R.drawable.bh1,
            R.drawable.bh2,
            R.drawable.bh4,
            R.drawable.bh5,
            R.drawable.bh6,
            R.drawable.bh7,
            R.drawable.bh8,
            R.drawable.bh9,
            R.drawable.bh11,
    };

    private String[] mImageTitle = new String[]{
            "IDN", "IDN",
            "IDN", "IDN",
            "IDN", "IDN",
            "IDN", "IDN",
            "IDN", "IDN",
    };

    CardView kelas, asrama, pelajaran, Eskul;


    public FragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);


        kelas = view.findViewById(R.id.cvkelas);
        asrama = view.findViewById(R.id.cvAsrama);
        pelajaran = view.findViewById(R.id.cvPelajaran);
        Eskul = view.findViewById(R.id.cvEskul);

        kelas.setOnClickListener(this);
        asrama.setOnClickListener(this);
        pelajaran.setOnClickListener(this);
        Eskul.setOnClickListener(this);


        CarouselView carouselView = view.findViewById(R.id.carousel);
        carouselView.setPageCount(mImages.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageResource(mImages[position]);

            }
        });
        carouselView.setImageClickListener(new ImageClickListener() {
            @Override
            public void onClick(int position) {
                Toast.makeText(getActivity(), mImageTitle[position], Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cvkelas:
                startActivity(new Intent(getActivity(), Kelas.class));
                break;
            case R.id.cvAsrama:
                startActivity(new Intent(getActivity(), Asrama.class));
                break;
            case R.id.cvPelajaran:
                startActivity(new Intent(getActivity(), Pelajaran.class));
                break;
            case R.id.cvEskul:
                startActivity(new Intent(getActivity(), JDeskul.class));
                break;

        }

    }
}
