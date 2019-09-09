package com.gharin.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class JDeskul extends AppCompatActivity {
    String[] menuItem = {"Memanah", "Berkuda", "Berenang", "Futsall", "Beladiri"};
    Integer[] menuImage = {
            R.drawable.memanah,
            R.drawable.berkuda,
            R.drawable.berenang,
            R.drawable.futsal,
            R.drawable.karate,
            };
    String[] menuLagi = {"Masing-masing memiliki PJ(penangung jawab)", "Masing-masing memiliki PJ(penangung jawab)", "Masing-masing memiliki PJ(penangung jawab)", "Masing-masing memiliki PJ(penangung jawab)", "Masing-masing memiliki PJ(penangung jawab)"};

    String[] url = {"https://www.fimela.com/lifestyle-relationship/read/3896475/resep-nasi-goreng-telur-sederhana-enak-banget", "https://www.fimela.com/lifestyle-relationship/read/3757240/resep-nasi-ayam-sederhana-pakai-rice-cooker", "https://www.happyfresh.id/blog/resep-rendang-padang-asli-minang/",
            "https://review.bukalapak.com/food/resep-mie-ayam-yang-enak-rahasianya-ada-di-minyak-ayam-ini-22510", "https://www.fimela.com/lifestyle-relationship/read/3773915/resep-cara-membuat-roti-canai-sederhana", "https://id.theasianparent.com/resep-telur-gulung",
            "https://www.masakapahariini.com/resep/resep-ikan-gurame-bakar-kecap-bango/", "https://www.masakapahariini.com/resep/resep-martabak-mie-telur/", "https://www.liputan6.com/citizen6/read/3625984/cara-membuat-martabak-manis-serta-martabak-manis-kekinian-dengan-berbagai-ide-adonan-dan-topping"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jdeskul);
        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView) findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);


        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
