package com.gharin.aplikasiidn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class AsramaAct extends AppCompatActivity {

//9A Asrama
    String[] menuItem9A = {
            "Abdullah", "Ali", "Furqon", "afiq", "azhar",
            "said", "zein", "Sidqi", "Thalhah", "Ziljidan"};
    Integer[] menuImage9A = {
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
    String[] menuLagi9A = {"1. Abdullah sulam",
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
    String[] menuItem8d = {
            "wafi", "miqdad", "gharyn", "harits", "hilmi",
            "Misbah", "abiyyu", "adil", "akmal", "Aqsha", "fadhlan", "Rifqi"};
    Integer[] menuImage8d = {
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
    String[] menuLagi8d = {"1. Abdurrahman wafi",
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
    String[] menuItem8c = {
            "Arinal", "Azka", "Darrel", "Haekal", "Ikhsan",
            "daffa a", "daffa d", "ahsan", "syauqi", "Rafi", "Saami", "Safaraz"};
    Integer[] menuImage8c = {
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
    String[] menuLagi8c = {"1. Arinal kian r",
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
    String[] menuItem8b = {
            "awan", "Ali", "Hugo", "Hafidz", "ficrie",
            "Reyhan", "Rizaldi", "tyo", "Sulaiman"};
    Integer[] menuImage8b = {
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,
            R.drawable.ind,};
    String[] menuLagi8b = {"1. Agbi awan asyifa",
            "2. Ali akbar al amin",
            "3. Hugo kayana PR",
            "4. Muhammad Attar Hafidz",
            "5. Muhammad ficrie",
            "6. Reyhan mohhamad",
            "7. Rizaldi kurnia",
            "8. Satria hanestyo",
            "9. Sulaiman al hisyam"};

    //8A asrama
    String[] menuItem8a = {
            "ihsan", "Althaaf", "arya", "dzaki", "Farrel",
            "Irsyad", "Khairiansyah", "Lalhuda", "aca", "Nabiih", "Wildan"};
    Integer[] menuImage8a = {
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
    String[] menuLagi8a = {"1. Ahmad ihsan maulana",
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
    String[] menuItem7d = {
            " Murtaza ahsan", " Musthafa dzaki nugraha", " Naufal daffa alaika", " Nawfal althaf budiman", " Nayaka arvin difandi",
            " Noah alif sjamhudi", " Panggih bagaskoro", " Rafa satya rabbani", " Raffa zahran arraziq", " Rafi zaki al rizqi",
            " Raiyan abizar", " Rakha sapta fabian", " Raqin aladar syarief hakim", " Ronald edsa pratama", " Taufik ilhami", " Thoriq izzuddin ramadhan",
            " Wildan hanif ihfazhirrahman", " Wildan sabiq abdurrahman", " Yahya abdurrahman", " Zirjy zakwan fayyadhiya"};
    Integer[] menuImage7d = {
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
    String[] menuLagi7d = {"1. Murtaza ahsan",
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
    String[] menuItem7c = {
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
    Integer[] menuImage7c = {
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
    String[] menuLagi7c = {"1. M umar alfatih",
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
    String[] menuItem7b = {
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
    Integer[] menuImage7b = {
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
    String[] menuLagi7b = {"1. M umar alfatih",
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
    String[] menuItem7a = {
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
    Integer[] menuImage7a = {
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
    String[] menuLagi7a = {"1. Abdullah agna alfayad",
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





    String[] url = {"www.youtube.com", "www.youtube.com", "www.youtube.com",
            "www.youtube.com","www.youtube.com","www.youtube.com",
            "www.youtube.com","www.youtube.com","www.youtube.com"};

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
    String idAsrama;
    CostumListAdapter adapter;
    TextView isinamamus, isiasalmus, isiemailmus, isitelpmus;
    ImageView ivMusyrif;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asrama2);

        isinamamus = findViewById(R.id.isinamamus);
        isiasalmus = findViewById(R.id.isiasalmus);
        isiemailmus = findViewById(R.id.isiemailmus);
        isitelpmus = findViewById(R.id.isitelpmus);

        ivMusyrif = findViewById(R.id.ivMusyrif);

        idAsrama = getIntent().getStringExtra("ID_KEY");


        if (idAsrama.equals("a9A")){
            isinamamus.setText(getString(R.string.namamusyrif9));
            isiasalmus.setText(getString(R.string.asalmusyrif9));
            isiemailmus.setText(getString(R.string.emailmusyrif9));
            isitelpmus.setText(getString(R.string.teleponmusyrif9));
            ivMusyrif.setImageResource(R.drawable.yudi);
            adapter = new CostumListAdapter(this, menuItem9A, menuImage9A, menuLagi9A);
        }else if (idAsrama.equals("a8D")){
            isinamamus.setText(getString(R.string.namamusyrifali));
            isiasalmus.setText(getString(R.string.asalmusyrifali));
            isiemailmus.setText(getString(R.string.emailmusyrifali));
            isitelpmus.setText(getString(R.string.teleponmusyrifali));
            ivMusyrif.setImageResource(R.drawable.agus);
            adapter = new CostumListAdapter(this, menuItem8d, menuImage8d, menuLagi8d);
        }else if (idAsrama.equals("a8C")){
            isinamamus.setText(getString(R.string.namamusyrifutsman));
            isiasalmus.setText(getString(R.string.asalmusyrifutsman));
            isiemailmus.setText(getString(R.string.emailmusyrifutsman));
            isitelpmus.setText(getString(R.string.teleponmusyrifutsman));
            ivMusyrif.setImageResource(R.drawable.inod);
            adapter = new CostumListAdapter(this, menuItem8c, menuImage8c, menuLagi8c);
        }else if (idAsrama.equals("a8B")){
            isinamamus.setText(getString(R.string.namamusyrifkhalid));
            isiasalmus.setText(getString(R.string.asalmusyrifkhalid));
            isiemailmus.setText(getString(R.string.emailmusyrifkhalid));
            isitelpmus.setText(getString(R.string.teleponmusyrifkhalid));
            ivMusyrif.setImageResource(R.drawable.pk);
            adapter = new CostumListAdapter(this, menuItem8b, menuImage8b, menuLagi8b);
        }else if (idAsrama.equals("a8A")){
            isinamamus.setText(getString(R.string.namamusyrifumar));
            isiasalmus.setText(getString(R.string.asalmusyrifumar));
            isiemailmus.setText(getString(R.string.emailmusyrifumar));
            isitelpmus.setText(getString(R.string.teleponmusyrifumar));
            ivMusyrif.setImageResource(R.drawable.pkiqball);
            adapter = new CostumListAdapter(this, menuItem8a, menuImage8a, menuLagi8a);
        }else if (idAsrama.equals("a7D")){
            isinamamus.setText(getString(R.string.namamusyrifali));
            isiasalmus.setText(getString(R.string.asalmusyrifali));
            isiemailmus.setText(getString(R.string.emailmusyrifali));
            isitelpmus.setText(getString(R.string.teleponmusyrifali));
            ivMusyrif.setImageResource(R.drawable.agus);
            adapter = new CostumListAdapter(this, menuItem7d, menuImage7d, menuLagi7d);
        }else if (idAsrama.equals("a7C")){
            isinamamus.setText(getString(R.string.namamusyrifutsman));
            isiasalmus.setText(getString(R.string.asalmusyrifutsman));
            isiemailmus.setText(getString(R.string.emailmusyrifutsman));
            isitelpmus.setText(getString(R.string.teleponmusyrifutsman));
            ivMusyrif.setImageResource(R.drawable.inod);
            adapter = new CostumListAdapter(this, menuItem7c, menuImage7c, menuLagi7c);
        }else if (idAsrama.equals("a7B")){
            isinamamus.setText(getString(R.string.namamusyrifkhalid));
            isiasalmus.setText(getString(R.string.asalmusyrifkhalid));
            isiemailmus.setText(getString(R.string.emailmusyrifkhalid));
            isitelpmus.setText(getString(R.string.teleponmusyrifkhalid));
            ivMusyrif.setImageResource(R.drawable.pk);
            adapter = new CostumListAdapter(this, menuItem7b, menuImage7b, menuLagi7b);
        }else if (idAsrama.equals("a7A")) {
            isinamamus.setText(getString(R.string.namamusyrifumar));
            isiasalmus.setText(getString(R.string.asalmusyrifumar));
            isiemailmus.setText(getString(R.string.emailmusyrifumar));
            isitelpmus.setText(getString(R.string.teleponmusyrifumar));
            ivMusyrif.setImageResource(R.drawable.pkiqball);
            adapter = new CostumListAdapter(this, menuItem7a, menuImage7a, menuLagi7a);
        }

        listView = (ListView)findViewById(R.id.mobilelist);
        listView.setAdapter(adapter);




    }


}

