package com.hocruxx.adi.adinugrohokel4;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ListView;


public class KontakActivity extends AppCompatActivity {

    //dekalarasi data yang akan di tampilkan serta list view
    String nama [] = {"Adinugroho","Faris","Mukhlis"};
    Integer[] foto = {R.drawable.male, R.drawable.male,R.drawable.male};
    ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kontak);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //disini kita atur tampilan list view nya
        KontakAdapter contactlist = new KontakAdapter(KontakActivity.this, nama, foto);
        listView = (ListView) findViewById(R.id.lv_contact);
        listView.setAdapter(contactlist);

    }
}
