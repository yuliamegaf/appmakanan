package com.example.asus.makanan;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.widget.ImageView;
import android.widget.TextView;

public class ResepDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resep_detail);

        ActionBar menu = getSupportActionBar();
        menu.setDisplayHomeAsUpEnabled(true);
        menu.setDisplayShowHomeEnabled(true);

        TextView txtResep = (TextView) findViewById(R.id.txt_resep);
        TextView txtJudul = (TextView) findViewById(R.id.txt_judul);
        ImageView img_resep = (ImageView) findViewById(R.id.img_resep);

        Intent intent = getIntent();
        //txtResep.setText(intent.getStringExtra("txt_resep"));
        txtJudul.setText(intent.getStringExtra("txt_judul"));
        txtResep.setText(Html.fromHtml(intent.getStringExtra("txt_resep")));
        int resId = getResources().getIdentifier(intent.getStringExtra("txt_gambar"), "drawable", getPackageName());
        img_resep.setImageResource(resId);

        //img_resep.setImageResource(R.drawable.+"txt_gambar");
    }

}
