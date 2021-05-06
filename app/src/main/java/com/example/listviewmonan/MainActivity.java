package com.example.listviewmonan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView lvMonAn;
    ArrayList<MonAn> mangMonAn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lvMonAn = (ListView) findViewById(R.id.listViewMonAn);
        mangMonAn = new ArrayList<MonAn>();
        mangMonAn.add(new MonAn("Chân giò hầm", 50000, R.drawable.changio));
        mangMonAn.add(new MonAn("Xiên nướng BBQ", 50000, R.drawable.xienbbq));
        mangMonAn.add(new MonAn("Mỳ ống", 50000, R.drawable.miong));
        mangMonAn.add(new MonAn("Phở Đà Nẵng", 50000, R.drawable.pho));

        MonAnAdapter adapter = new MonAnAdapter(this, R.layout.dong_mon_an, mangMonAn);

        lvMonAn.setAdapter(adapter);



    }
}