package com.taajanazladhani.capstone;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView imageViewFoto;
    TextView textViewNama, textViewInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageViewFoto = findViewById(R.id.imageViewFoto);
        textViewNama = findViewById(R.id.textViewNama);
        textViewInfo = findViewById(R.id.textViewInfo);


        getIncomingExtra();
    }

    private void getIncomingExtra(){

        if(getIntent().hasExtra("foto") && getIntent().hasExtra("nama") && getIntent().hasExtra("info")){

            String foto = getIntent().getStringExtra("foto");
            String nama = getIntent().getStringExtra("nama");
            String info = getIntent().getStringExtra("info");

            setDataActivity(foto, nama, info);
        }
    }

    private void setDataActivity(String foto, String nama, String info){

        Glide.with(this).asBitmap().load(foto).into(imageViewFoto);

        textViewNama.setText(nama);
        textViewInfo.setText(info);

    }
}