package com.example.asus.makanan;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Resep> dataResep;
    private RecyclerView listResep;
    private ResepAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateData();
        listResep   = (RecyclerView) findViewById(R.id.list_resep);

        adapter     = new ResepAdapter(this, dataResep);
        listResep.setAdapter(adapter);
        listResep.setLayoutManager(new LinearLayoutManager(this));
    }

    private void generateData() {
        dataResep = new ArrayList<>();

        dataResep.add(new Resep("Rujak Cingur", "Rujak Cingur Surabaya dengan petisnya khas. Berasa pulang kampung!!!",
                "<b>Bahan yang dibutuhkan :</b><br>" +
                        "250 gram potongan mulu sapi, tulang rawan hidung atau mungkin anda dapat menambahkan kikil sapi<br>" +
                        "50 gram tauge<br>" +
                        "100 gram kacang panjang yang sudah anda potong -+ 3cm<br>" +
                        "1 ikat kangkung, ambil daunnya saja<br>" +
                        "100 gram tempe yang sudah di goreng dan dipotong dadu<br>" +
                        "100 gram tahu yang sudah digoreng dan dipotong dadu<br>"+
                        "<br>" +

                        "<b> Bahan Bumbu Kacang:</b><br>" +
                        "200 gram petis udang<br>"+
                        "100 gram kacang tanah yang sudah di goreng<br>"+
                        "50 gram gula merah sisi kasar<br>"+
                        "cabai sesuai selera<br>"+
                        "1 siung bawang putih<br>"+
                        "1 buah pisang klutuk<br>"+
                        "garam secukupnya<br>"+
                        "1 sendok air asam jawa<br>"+
                        "terasi secukupnya<br>"+
                        "air matang<br>"+
                                "<br>" +

                        "<b>Langkah Pembuatan :</b><br>" +
                                "1. Cuci bersih cingur kemudian anda rebus hingga empuk. Potong sesuai dengan selera.<br>\n" +
                                "2. Rebus kacang panjang dan kangkung dalam tempat terpisah sampai matang tetapi jangan terlalu lama.<br>\n" +
                                "3. Haluskan semua bumbu hingga diperoleh bumbu kacang.<br>\n" +
                                "4. Tata rapi semua bahan rujak cingur yaitu tempe, tahu, cingur, kangkung dan taugedi atas piring saji.<br>\n" +
                                "5. Sajikan bersama dengan bumbu kacang.<br>","rujakcingursurabaya"));

        dataResep.add(new Resep("Tahu Campur Surabaya","Tahu Campur Spesial Surabaya dan Lamongan",
                        "<b>Bahan-bahan : </b><br>\n" +
                                "1 1/2 liter air, untuk merebus daging<br>\n" +
                                "250 gram tetelan daging sapi, potong-potong<br>\n" +
                                "3 batang serai, memarkan<br>\n" +
                                "2 cm jahe, memarkan<br>\n" +
                                "2 sendok makan minyak goreng, untuk menumis<br>"+
                "<br>"+

                        "<b>Bahan Bumbu Halus :</b><br>" +
                                "5 butir bawang merah<br>\n" +
                                "3 siung bawang putih<br>\n" +
                                "1/2 sendok teh merica<br>\n" +
                                "2 cm kunyit<br>\n" +
                                "1 sendok teh ketumbar sangrai<br>\n" +
                                "1 sendok teh garam<br>\n" +
                                "1 sendok makan gula pasir<br>"+
                        "<br>"+


                                "<b>Bahan Pelengkap : </b><br>\n" +
                                "100 gram mie basah, seduh dengan air panas, tiriskan<br>\n" +
                                "50 gram taoge, seduh sebentar<br>\n" +
                                "5 buah tahu bandung, belah dua, goreng matang<br>\n" +
                                "1 ikat daun selada, potong-potong<br>\n" +
                                "5 buah lentho (perkedel singkong)<br>\n" +
                                "5 buah kerupuk udang/mie<br>"+
                                "<br>"+

                        "<b>Langkah Pembuatan :</b><br>" +
                                "1. Rebus air, masukkan tetelan daging, masak sampai empuk.<br>\n"+
                                "2. Panaskan minyak goreng, tumis bumbu halus, jahe, dan serai sampai harum, angkat. Masukkan ke dalam air rebusan daging, aduk rata. Kecilkan apinya dan masak terus selama 15 menit sampai bumbu meresap.<br>\n"+
                                "3. Cara Membuat Sambal Petis : haluskan bawang putih goreng bersama cabai rawit, lalu campur dengan petis udang dan air matang. Aduk rata, sisihkan.<br>\n"+
                                "4. Saran penyajian : Siapkan piring hidang, ambil 1 sdm sambal petis, daun selada, potongan tahu, mi, taoge, irisan lentho, dan kerupuk. Siram dengan kuah panas.<br>\n"


                ,"tahucampursurabaya"));



    }


}
