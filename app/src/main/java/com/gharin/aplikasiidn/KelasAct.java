package com.gharin.aplikasiidn;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class KelasAct extends AppCompatActivity {
    //9A kelas
    String[] menuItemk9A = {
            "Abdullah", "Ali", "Furqon", "afiq", "azhar",
            "said", "zein", "Sidqi", "Thalhah", "Ziljidan"};
    Integer[] menuImagek9A = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik9A = {"1. Abdullah sulam",
            "2. Ali zainal abidin",
            "3. Furqon afuwwu h",
            "4. Muhammad afiq a",
            "5. Muhammad azhar n",
            "6. Muhammad said",
            "7. Muhammad zein",
            "8. Sidqi athallah a",
            "9. Thalhah s",
            "10.Ziljidan ramadhan s"};

    //8D asrama
    String[] menuItemk8d = {
            "wafi", "miqdad", "gharyn", "harits", "hilmi",
            "Misbah", "abiyyu", "adil", "akmal", "Aqsha", "fadhlan", "Rifqi"};
    Integer[] menuImagek8d = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik8d = {"1. Abdurrahman wafi",
            "2. Ahmad miqdad",
            "3. Ananda gharyn s",
            "4. HARITS",
            "5. Hilmi raditya r",
            "6. Misbah bagaskara",
            "7. Muhammad abiyyu r",
            "8. Muhammad adil mutaqin",
            "9. Muhammad akmal ahsan",
            "10.Muhammad Aqsha Munggaran",
            "11.Muhammad fadhlan wahyudi",
            "12.Rifqi hafidh suryana"};

    //8C asrama
    String[] menuItemk8c = {
            "Arinal", "Azka", "Darrel", "Haekal", "Ikhsan",
            "daffa a", "daffa d", "ahsan", "syauqi", "Rafi", "Saami", "Safaraz"};
    Integer[] menuImagek8c = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik8c = {"1. Arinal kian r",
            "2. Azka maulana zikri",
            "3. Darrel rafa alamsyah",
            "4. Haekal syahefiran",
            "5. Ikhsan aydin zahid",
            "6. Muhammad daffa a",
            "7. Muhammad daffa d",
            "8. M nur ahsan r",
            "9. M syauqi darvastama",
            "10. Rafi nazwan m",
            "11. Saami sualaiman",
            "12. Safaraz afma affandi"};

    //8B asrama
    String[] menuItemk8b = {
            "awan", "Ali", "Hugo", "Hafidz", "ficrie",
            "Reyhan", "Rizaldi", "tyo", "Sulaiman"};
    Integer[] menuImagek8b = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik8b = {"1. Agbi awan asyifa",
            "2. Ali akbar al amin",
            "3. Hugo kayana PR",
            "4. Muhammad Attar Hafidz",
            "5. Muhammad ficrie",
            "6. Reyhan mohhamad",
            "7. Rizaldi kurnia",
            "8. Satria hanestyo",
            "9. Sulaiman al hisyam"};

    //8A asrama
    String[] menuItemk8a = {
            "ihsan", "Althaaf", "arya", "dzaki", "Farrel",
            "Irsyad", "Khairiansyah", "Lalhuda", "aca", "Nabiih", "Wildan"};
    Integer[] menuImagek8a = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik8a = {"1. Ahmad ihsan maulana",
            "2. Althaaf ridha muhammad zaydaan batubara",
            "3. Daffa arya sofwan",
            "4. Faaris dzaki candra",
            "5. Farrel fathin nugraha",
            "6. Irsyad sholahuddin",
            "7. Khairiansyah hafidz",
            "8. Lalhuda fathin jafsyada",
            "9. Muhammad rasya hamdi syahkuan za",
            "10. Nabiih firdaus alauddin",
            "11. Wildan artha sheehan"};

    //7D asrama
    String[] menuItemk7d = {
            " Murtaza ahsan", " Musthafa dzaki nugraha", " Naufal daffa alaika", " Nawfal althaf budiman", " Nayaka arvin difandi",
            " Noah alif sjamhudi", " Panggih bagaskoro", " Rafa satya rabbani", " Raffa zahran arraziq", " Rafi zaki al rizqi",
            " Raiyan abizar", " Rakha sapta fabian", " Raqin aladar syarief hakim", " Ronald edsa pratama", " Taufik ilhami", " Thoriq izzuddin ramadhan",
            " Wildan hanif ihfazhirrahman", " Wildan sabiq abdurrahman", " Yahya abdurrahman", " Zirjy zakwan fayyadhiya"};
    Integer[] menuImagek7d = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik7d = {"1. Murtaza ahsan",
            "2. Musthafa dzaki nugraha",
            "3. Naufal daffa alaika",
            "4. Nawfal althaf budiman",
            "5. Nayaka arvin difandi",
            "6. Noah alif sjamhudi",
            "7. Panggih bagaskoro",
            "8. Rafa satya rabbani",
            "9. Raffa zahran arraziq",
            "10. Rafi zaki al rizqi",
            "11. Raiyan abizar",
            "12. Rakha sapta fabian",
            "13. Raqin aladar syarief hakim",
            "14. Ronald edsa pratama",
            "15. Taufik ilhami",
            "16. Thoriq izzuddin ramadhan",
            "17. Wildan hanif ihfazhirrahman",
            "18. Wildan sabiq abdurrahman",
            "19. Yahya abdurrahman",
            "20. Zirjy zakwan fayyadhiya"};
    //7C asrama
    String[] menuItemk7c = {
            " M umar alfatih",
            " M aaubindaffa arya y",
            " M dzakiyy aliyy kanz",
            " M fajri lazuardi",
            " M naufal suyja kurniawan",
            " Mohamad alif",
            " Muhamad azka",
            " Muhammad abqari nasution",
            " Muhammad fachri razali",
            " Muhammad fajri anwar",
            " Muhammad faris f",
            " Muhammad hanif sulyanto",
            " Muhammad myko adityo",
            " Muhammad naufal ilham",
            " Muhammad putra raditya",
            " Muhammad rafi al zakwan",
            " Muhammad yazid nur r",
            " Muhammad zaidan firrizq",
            " Munawar zaki ramadhan"};
    Integer[] menuImagek7c = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik7c = {"1. M umar alfatih",
            "2. M aaubindaffa arya y",
            "3. M dzakiyy aliyy kanz",
            "4. M fajri lazuardi",
            "5. M naufal suyja kurniawan",
            "6. Mohamad alif",
            "7. Muhamad azka",
            "8. Muhammad abqari nasution",
            "9. Muhammad fachri razali",
            "10. Muhammad fajri anwar",
            "11. Muhammad faris f",
            "12. Muhammad hanif sulyanto",
            "13. Muhammad myko adityo",
            "14. Muhammad naufal ilham",
            "15. Muhammad putra raditya",
            "16. Muhammad rafi al zakwan",
            "17. Muhammad yazid nur r",
            "18. Muhammad zaidan firrizq",
            "19. Munawar zaki ramadhan"};

    //7B asrama
    String[] menuItemk7b = {
            " M umar alfatih",
            " M aaubindaffa arya y",
            " M dzakiyy aliyy kanz",
            " M fajri lazuardi",
            " M naufal suyja kurniawan",
            " Mohamad alif",
            " Muhamad azka",
            " Muhammad abqari nasution",
            " Muhammad fachri razali",
            " Muhammad fajri anwar",
            " Muhammad faris f",
            " Muhammad hanif sulyanto",
            " Muhammad myko adityo",
            " Muhammad naufal ilham",
            " Muhammad putra raditya",
            " Muhammad rafi al zakwan",
            " Muhammad yazid nur r",
            " Muhammad zaidan firrizq",
            " Munawar zaki ramadhan"};
    Integer[] menuImagek7b = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik7b = {"1. M umar alfatih",
            "2. M aaubindaffa arya y",
            "3. M dzakiyy aliyy kanz",
            "4. M fajri lazuardi",
            "5. M naufal suyja kurniawan",
            "6. Mohamad alif",
            "7. Muhamad azka",
            "8. Muhammad abqari nasution",
            "9. Muhammad fachri razali",
            "10. Muhammad fajri anwar",
            "11. Muhammad faris f",
            "12. Muhammad hanif sulyanto",
            "13. Muhammad myko adityo",
            "14. Muhammad naufal ilham",
            "15. Muhammad putra raditya",
            "16. Muhammad rafi al zakwan",
            "17. Muhammad yazid nur r",
            "18. Muhammad zaidan firrizq",
            "19. Munawar zaki ramadhan"};

    //7A asrama
    String[] menuItemk7a = {
            " M umar alfatih",
            " M aaubindaffa arya y",
            " M dzakiyy aliyy kanz",
            " M fajri lazuardi",
            " M naufal suyja kurniawan",
            " Mohamad alif",
            " Muhamad azka",
            " Muhammad abqari nasution",
            " Muhammad fachri razali",
            " Muhammad fajri anwar",
            " Muhammad faris f",
            " Muhammad hanif sulyanto",
            " Muhammad myko adityo",
            " Muhammad naufal ilham",
            " Muhammad putra raditya",
            " Muhammad rafi al zakwan",
            " Muhammad yazid nur r",
            " Muhammad zaidan firrizq",
            " Munawar zaki ramadhan"};
    Integer[] menuImagek7a = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagik7a = {"1. Abdullah agna alfayad",
            "2. Abdullah zidane",
            "3. Abdurrahman raqi",
            "4. Abdurrazzaq",
            "5. Abiyyu adiyarto sulaeman",
            "6. Ahmad dzakki",
            "7. Ahmad fachry saputro",
            "8. Ahmad fathir",
            "9. Aiyyub al anshori",
            "10. Ajriel rizqy maulana",
            "11. Akma zaki alfari",
            "12. Akmal pratama irsyad n",
            "13. Allvin angga putra",
            "14. Aly zakki yaza",
            "15. Banyureksa ghaisan",
            "16. Bryan pradika",
            "17. Daffa fathur rahman",
            "18. Daffa muhammad r",
            "19. Danish olfan alif d",
            "20. Fachry fauzan f"};

    String[] nama7a = {"1. Abdullah agna alfayad",
            "2. Abdullah zidane",
            "3. Abdurrahman raqi",
            "4. Abdurrazzaq",
            "5. Abiyyu adiyarto sulaeman",
            "6. Ahmad dzakki",
            "7. Ahmad fachry saputro",
            "8. Ahmad fathir",
            "9. Aiyyub al anshori",
            "10. Ajriel rizqy maulana",
            "11. Akma zaki alfari",
            "12. Akmal pratama irsyad n",
            "13. Allvin angga putra",
            "14. Aly zakki yaza",
            "15. Banyureksa ghaisan",
            "16. Bryan pradika",
            "17. Daffa fathur rahman",
            "18. Daffa muhammad r",
            "19. Danish olfan alif d",
            "20. Fachry fauzan f"};

    String[] nama7b = {
            "1. Fadhil zaki",
            "2. Farrel muhammad hafidz e",
            "3. Farrel ahmad ghazali",
            "4. Fatih ahmad muzakki",
            "5. Fatih rizki akbar",
            "6. Fawwaz abdul ghani",
            "7. Fihryal faqiy",
            "8. Ghatan naufarrel a",
            "9. Ghaisan raziq syams",
            "10. Giats thamami",
            "11. Habibie muhaymin ihsan",
            "12. Hauzan nabil musyafa",
            "13. Ichwan ahmadi thoriq",
            "14. Ikhsan alfharizi",
            "15. Irham abdirrohman a",
            "16. Jagat alif katulistiwa",
            "17. Khairi azzam rieffant",
            "18. M nabil",
            "19. M rasya nur bayhaqqi"};

    String[] nama7c = {"1. M umar alfatih",
            "2. M aaubindaffa arya y",
            "3. M dzakiyy aliyy kanz",
            "4. M fajri lazuardi",
            "5. M naufal suyja kurniawan",
            "6. Mohamad alif",
            "7. Muhamad azka",
            "8. Muhammad abqari nasution",
            "9. Muhammad fachri razali",
            "10. Muhammad fajri anwar",
            "11. Muhammad faris f",
            "12. Muhammad hanif sulyanto",
            "13. Muhammad myko adityo",
            "14. Muhammad naufal ilham",
            "15. Muhammad putra raditya",
            "16. Muhammad rafi al zakwan",
            "17. Muhammad yazid nur r",
            "18. Muhammad zaidan firrizq",
            "19. Munawar zaki ramadhan"};

    String[] nama7d = {"1. Murtaza ahsan",
            "2. Musthafa dzaki nugraha",
            "3. Naufal daffa alaika",
            "4. Nawfal althaf budiman",
            "5. Nayaka arvin difandi",
            "6. Noah alif sjamhudi",
            "7. Panggih bagaskoro",
            "8. Rafa satya rabbani",
            "9. Raffa zahran arraziq",
            "10. Rafi zaki al rizqi",
            "11. Raiyan abizar",
            "12. Rakha sapta fabian",
            "13. Raqin aladar syarief hakim",
            "14. Ronald edsa pratama",
            "15. Taufik ilhami",
            "16. Thoriq izzuddin ramadhan",
            "17. Wildan hanif ihfazhirrahman",
            "18. Wildan sabiq abdurrahman",
            "19. Yahya abdurrahman",
            "20. Zirjy zakwan fayyadhiya"};

    String[] nama8a = {"1. Ahmad ihsan maulana",
            "2. Althaaf ridha muhammad zaydaan batubara",
            "3. Daffa arya sofwan",
            "4. Faaris dzaki candra",
            "5. Farrel fathin nugraha",
            "6. Irsyad sholahuddin",
            "7. Khairiansyah hafidz",
            "8. Lalhuda fathin jafsyada",
            "9. Muhammad rasya hamdi syahkuan za",
            "10. Nabiih firdaus alauddin",
            "11. Wildan artha sheehan"};

    String[] nama8b = {"1. Agbi awan asyifa",
            "2. Ali akbar al amin",
            "3. Hugo kayana PR",
            "4. Muhammad Attar Hafidz",
            "5. Muhammad ficrie",
            "6. Reyhan mohhamad",
            "7. Rizaldi kurnia",
            "8. Satria hanestyo",
            "9. Sulaiman al hisyam"};

    String[] nama8c = {"1. Arinal kian r",
            "2. Azka maulana zikri",
            "3. Darrel rafa alamsyah",
            "4. Haekal syahefiran",
            "5. Ikhsan aydin zahid",
            "6. Muhammad daffa a",
            "7. Muhammad daffa d",
            "8. M nur ahsan r",
            "9. M syauqi darvastama",
            "10. Rafi nazwan m",
            "11. Saami sualaiman",
            "12. Safaraz afma affandi"};

    String[] nama8d = {"1. Abdurrahman wafi",
            "2. Ahmad miqdad",
            "3. Ananda gharyn s",
            "4. HARITS",
            "5. Hilmi raditya r",
            "6. Misbah bagaskara",
            "7. Muhammad abiyyu r",
            "8. Muhammad adil mutaqin",
            "9. Muhammad akmal ahsan",
            "10.Muhammad Aqsha Munggaran",
            "11.Muhammad fadhlan wahyudi",
            "12.Rifqi hafidh suryana"};

    String[] nama9 = {"1. Abdullah sulam",
            "2. Ali zainal abidin",
            "3. Furqon afuwwu h",
            "4. Muhammad afiq a",
            "5. Muhammad azhar n",
            "6. Muhammad said",
            "7. Muhammad zein",
            "8. Sidqi athallah a",
            "9. Thalhah s",
            "10.Ziljidan ramadhan s"};

    ListView listView;
    String idKelas;
    CostumListAdapter adapter;
    TextView isinamakel, isiasalkel, isiemailkel, isitelpkel;
    ImageView ivkelas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelas_act);

        isinamakel = findViewById(R.id.isinamakel);
        isiasalkel = findViewById(R.id.isiasalkel);
        isiemailkel = findViewById(R.id.isiemailkel);
        isitelpkel = findViewById(R.id.isitelpkel);

        ivkelas = findViewById(R.id.ivkelas);
        idKelas = getIntent().getStringExtra("ID_KEY");

        if (idKelas.equals("k9A")){
            isinamakel.setText(getString(R.string.namaguru9));
            isiasalkel.setText(getString(R.string.asalguru9));
            isiemailkel.setText(getString(R.string.emailguru9));
            isitelpkel.setText(getString(R.string.teleponguru9));
            ivkelas.setImageResource(R.drawable.pkaji);
            adapter = new CostumListAdapter(this, menuItemk9A, menuImagek9A, menuLagik9A);
        }else if (idKelas.equals("8D")){
            isinamakel.setText(getString(R.string.namaguru8d));
            isiasalkel.setText(getString(R.string.asalguru8d));
            isiemailkel.setText(getString(R.string.emailguru8d));
            isitelpkel.setText(getString(R.string.teleponguru8d));
            ivkelas.setImageResource(R.drawable.sad);
            adapter = new CostumListAdapter(this, menuItemk8d, menuImagek8d, menuLagik8d);
        }else if (idKelas.equals("k8C")){
            isinamakel.setText(getString(R.string.namaguru8c));
            isiasalkel.setText(getString(R.string.asalguru8c));
            isiemailkel.setText(getString(R.string.emailguru8c));
            isitelpkel.setText(getString(R.string.teleponguru8c));
            ivkelas.setImageResource(R.drawable.pkjafran);
            adapter = new CostumListAdapter(this, menuItemk8c, menuImagek8c, menuLagik8c);
        }else if (idKelas.equals("k8B")){
            isinamakel.setText(getString(R.string.namaguru8b));
            isiasalkel.setText(getString(R.string.asalguru8b));
            isiemailkel.setText(getString(R.string.emailguru8b));
            isitelpkel.setText(getString(R.string.teleponguru8b));
            ivkelas.setImageResource(R.drawable.pkhaidar);
            adapter = new CostumListAdapter(this, menuItemk8b, menuImagek8b, menuLagik8b);
        }else if (idKelas.equals("k8A")){
            isinamakel.setText(getString(R.string.namaguru8a));
            isiasalkel.setText(getString(R.string.asalguru8a));
            isiemailkel.setText(getString(R.string.emailguru8a));
            isitelpkel.setText(getString(R.string.teleponguru8a));
            ivkelas.setImageResource(R.drawable.bangdaffa);
            adapter = new CostumListAdapter(this, menuItemk8a, menuImagek8a, menuLagik8a);
        }else if (idKelas.equals("k7D")){
            isinamakel.setText(getString(R.string.namaguru7d));
            isiasalkel.setText(getString(R.string.asalguru7d));
            isiemailkel.setText(getString(R.string.emailguru7d));
            isitelpkel.setText(getString(R.string.teleponguru7d));
            ivkelas.setImageResource(R.drawable.pklucas);
            adapter = new CostumListAdapter(this, menuItemk7d, menuImagek7d, menuLagik7d);
        }else if (idKelas.equals("k7C")){
            isinamakel.setText(getString(R.string.namaguru7c));
            isiasalkel.setText(getString(R.string.asalguru7c));
            isiemailkel.setText(getString(R.string.emailguru7c));
            isitelpkel.setText(getString(R.string.teleponguru7c));
            ivkelas.setImageResource(R.drawable.pkulum);
            adapter = new CostumListAdapter(this, menuItemk7c, menuImagek7c, menuLagik7c);
        }else if (idKelas.equals("k7B")){
            isinamakel.setText(getString(R.string.namaguru7b));
            isiasalkel.setText(getString(R.string.asalguru7b));
            isiemailkel.setText(getString(R.string.emailguru7b));
            isitelpkel.setText(getString(R.string.teleponguru7b));
            ivkelas.setImageResource(R.drawable.oksuut);
            adapter = new CostumListAdapter(this, menuItemk7b, menuImagek7b, menuLagik7b);
        }else if (idKelas.equals("k7A")){
            isinamakel.setText(getString(R.string.namaguru7a));
            isiasalkel.setText(getString(R.string.asalguru7a));
            isiemailkel.setText(getString(R.string.emailguru7a));
            isitelpkel.setText(getString(R.string.teleponguru7a));
            ivkelas.setImageResource(R.drawable.pkaziss);
            adapter = new CostumListAdapter(this, menuItemk7a, menuImagek7a, menuLagik7a);
        }

        listView = (ListView)findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);



    }
}
