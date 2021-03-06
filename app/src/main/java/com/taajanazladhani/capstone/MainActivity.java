package com.taajanazladhani.capstone;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> foto = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDataFromInternet();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(foto, nama, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDataFromInternet(){

        nama.add("01\nSimpang - Sadang PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/01.png");
        info.add("Lintasan:\nSadang - Jl. Ipik Gandamanah (Munjul) - Pasar Jumat - Pasar Rebo - Simpang");

        nama.add("02\nSimpang - Sadang PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/02.png");
        info.add("Lintasan:\nSimpang - Pasar Rebo - Jl. RE. Martadinata (jalan Tengah) - Pasar Jumat - Jl. Veteran (Kebon Kolot) - Sadang");

        nama.add("03\nCiganea - Simpang PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/03.png");
        info.add("Lintasan:\nCiganea - Sindangkasih (Parcom) - Pasar Rebo - Pasar Jumat - Koncara");

        nama.add("04\nCiganea - Simpang PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/04.png");
        info.add("Lintasan:\nCiganea - Sindangkasih (Parcom) - Jl. Ahmad Yani (Cipaisan) - Koncara (Pasar Hayam) - Pasar Jumat - Pasar Rebo");

        nama.add("05\nSadang - Ciganea PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/05.png");
        info.add("Lintasan:\nSadang - Kebon Kolot - Koncara - Cipaisan - Sindangkasih - Ciganea");

        nama.add("06\nSadang - Ciganea PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/06.png");
        info.add("Lintasan:\nKebon Kolot - Pasar Jumat - Sindangkasih - Cipaisan - Koncara - Ciganea");

        nama.add("07\nCilangkap - Simpang");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/07.png");
        info.add("Lintasan:\nMaracang (Taman pahlawan) - Pasar Jumat - Pasar Rebo - Sindangkasih - Cipaisan - Koncara - Maracang");

        nama.add("08\nBabakan Cikao - Pasawahan");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/08.png");
        info.add("Lintasan:\nMaracang - Jl Baru (Taman Pembaharuan) - Jl Ipik Gandamanah (Cikolotok) - Citalang - Pasawahan");

        nama.add("09\nCiganea - Service PP");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/09.png");
        info.add("Lintasan:\nTerminal Ciganea - Indorama - Ubrug");

        nama.add("10\nCiganea - Babakan Cikao");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/010.png");
        info.add("Lintasan:\nCiganea - Kembang Kuning - Babakan Cikao (Pertigaan Indorama dan Jatiluhur)");

        prosesRecyclerViewAdapter();

    }
}