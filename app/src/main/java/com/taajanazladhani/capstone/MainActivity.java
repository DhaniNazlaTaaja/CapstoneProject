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

        nama.add("01");
        foto.add("https://makananoleholeh.com/wp-content/uploads/2018/10/Gulai-belacan-riau.jpg");
        info.add("trayek: Simpang - Sadang PP" +
                "lintasan: Sadang - Jl. Ipik Gandamanah (Munjul) - Pasar Jumat - Pasar Rebo - Simpang");

        nama.add("02");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/02.png");
        info.add("trayek: Simpang - Sadang PP" +
                "lintasan: Simpang - Pasar Rebo - Jl. RE. Martadinata (jalan Tengah) - Pasar Jumat - Jl. Veteran (Kebon Kolot) - Sadang");

        nama.add("03");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/03.png");
        info.add("trayek: Ciganea - Simpang PP" +
                "lintasan: Ciganea - Sindangkasih (Parcom) - Pasar Rebo - Pasar Jumat - Koncara");

        nama.add("04");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/04.png");
        info.add("trayek: Ciganea - Simpang PP" +
                "lintasan: Ciganea - Sindangkasih (Parcom) - Jl. Ahmad Yani (Cipaisan) - Koncara (Pasar Hayam) - Pasar Jumat - Pasar Rebo");

        nama.add("05");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/05.png");
        info.add("trayek: Sadang - Ciganea PP" +
                "lintasan: Sadang - Kebon Kolot - Koncara - Cipaisan - Sindangkasih - Ciganea");

        nama.add("06");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/06.png");
        info.add("trayek: Sadang - Ciganea PP" +
                "lintasan: Kebon Kolot - Pasar Jumat - Sindangkasih - Cipaisan - Koncara - Ciganea");

        nama.add("07");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/07.png");
        info.add("trayek: Cilangkap - Simpang" +
                "lintasan: Maracang (Taman pahlawan) - Pasar Jumat - Pasar Rebo - Sindangkasih - Cipaisan - Koncara - Maracang");

        nama.add("08");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/08.png");
        info.add("trayek: Babakan Cikao - Pasawahan" +
                "lintasan: Maracang - Jl Baru (Taman Pembaharuan) - Jl Ipik Gandamanah (Cikolotok) - Citalang - Pasawahan");

        nama.add("09");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/09.png");
        info.add("trayek: Ciganea - Service PP" +
                "lintasan: Terminal Ciganea - Indorama - Ubrug");

        nama.add("10");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/010.png");
        info.add("trayek: Ciganea - Babakan Cikao" +
                "lintasan: Ciganea - Kembang Kuning - Babakan Cikao (Pertigaan Indorama dan Jatiluhur)");

        nama.add("11");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/011.PNG");
        info.add("trayek: Ciganea - Jatiluhur" +
                "lintasan: Ciganea - Jatiluhur");

        nama.add("12");
        foto.add("https://dev.farizdotid.com/api/halopwk/gambar/angkot/43.png");
        info.add("trayek: Purwakarta - Cikampek (Pasar Cikampek" +
                "lintasan: Purwakarta (Pasar Hayam) - Koncara - Sadang - Bungursari - Pasar Cikampek");


        prosesRecyclerViewAdapter();

    }
}