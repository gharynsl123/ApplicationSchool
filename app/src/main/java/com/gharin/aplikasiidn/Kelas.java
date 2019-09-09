package com.gharin.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Kelas extends AppCompatActivity {
    String[] menuItem = {"Kelas 9A", "Kelas 8D", "Kelas 8C", "Kelas 8B", "Kelas 8A", "Kelas 7D", "Kelas 7C", "Kelas 7B", "Kelas 7A"};
    Integer[] menuImage = {
            R.drawable.pkaji,
            R.drawable.sad,
            R.drawable.pkjafran,
            R.drawable.pkhaidar,
            R.drawable.bangdaffa,
            R.drawable.pklucas,
            R.drawable.pkulum,
            R.drawable.oksuut,
            R.drawable.pkaziss};
    String[] menuLagi = {".", ".", ".", ".",
            ".", ".", ".", ".",
            "."};

    String[] url = {"https://www.fimela.com/lifestyle-relationship/read/3896475/resep-nasi-goreng-telur-sederhana-enak-banget", "https://www.fimela.com/lifestyle-relationship/read/3757240/resep-nasi-ayam-sederhana-pakai-rice-cooker", "https://www.happyfresh.id/blog/resep-rendang-padang-asli-minang/",
            "https://review.bukalapak.com/food/resep-mie-ayam-yang-enak-rahasianya-ada-di-minyak-ayam-ini-22510", "https://www.fimela.com/lifestyle-relationship/read/3773915/resep-cara-membuat-roti-canai-sederhana", "https://id.theasianparent.com/resep-telur-gulung",
            "https://www.masakapahariini.com/resep/resep-ikan-gurame-bakar-kecap-bango/", "https://www.masakapahariini.com/resep/resep-martabak-mie-telur/", "https://www.liputan6.com/citizen6/read/3625984/cara-membuat-martabak-manis-serta-martabak-manis-kekinian-dengan-berbagai-ide-adonan-dan-topping"};

    String[] idKelas = {"k9A", "8D", "k8C", "k8B", "k8A", "k7D", "k7C", "k7B", "k7A"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas);
        CostumListAdapter adapter = new CostumListAdapter(this, menuItem, menuImage, menuLagi);
        listView = (ListView) findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                startActivity(new Intent(Kelas.this, KelasAct.class)
                        .putExtra("url", url[position])
                        .putExtra("ID_KEY", idKelas[position]));
            }
        });


        getSupportActionBar().setDisplayShowHomeEnabled(true);
    }
}
