package com.gharin.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Asrama extends AppCompatActivity {
    String[] menuItem = {"Asrama 9A", "Asrama 8D", "Asrama 8C", "Asrama 8B", "Asrama 8A", "Asrama 7D", "Asrama 7C", "Asrama 7B", "Asrama 7A"};
    Integer[] menuImage = {
            R.drawable.idn,
            R.drawable.agus,
            R.drawable.inod,
            R.drawable.pk,
            R.drawable.pkiqball,
            R.drawable.agus,
            R.drawable.inod,
            R.drawable.pk,
            R.drawable.pkiqball};
    String[] menuLagi = {".", ".", ".", ".",
            ".", ".", ".", ".",
            "."};

    String[] url = {"https://www.fimela.com/lifestyle-relationship/read/3896475/resep-nasi-goreng-telur-sederhana-enak-banget", "https://www.fimela.com/lifestyle-relationship/read/3757240/resep-nasi-ayam-sederhana-pakai-rice-cooker", "https://www.happyfresh.id/blog/resep-rendang-padang-asli-minang/",
            "https://review.bukalapak.com/food/resep-mie-ayam-yang-enak-rahasianya-ada-di-minyak-ayam-ini-22510", "https://www.fimela.com/lifestyle-relationship/read/3773915/resep-cara-membuat-roti-canai-sederhana", "https://id.theasianparent.com/resep-telur-gulung",
            "https://www.masakapahariini.com/resep/resep-ikan-gurame-bakar-kecap-bango/", "https://www.masakapahariini.com/resep/resep-martabak-mie-telur/", "https://www.liputan6.com/citizen6/read/3625984/cara-membuat-martabak-manis-serta-martabak-manis-kekinian-dengan-berbagai-ide-adonan-dan-topping"};

    String[] idAsrama = {"a9A", "a8D", "a8C", "a8B", "a8A", "a7D", "a7C", "a7B", "a7A"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrama);
        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView) findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Asrama.this, AsramaAct.class)
                        .putExtra("url", url[position])
                        .putExtra("ID_KEY", idAsrama[position]));
            }
        });


        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
