package com.hocruxx.adi.adinugrohokel4;

/**
 * Created by nugie on 10/22/2017.
 */
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class KontakAdapter extends ArrayAdapter <String>{
    //deklarasi kan komponen seperti target activity, nama dan foto
    private final Activity activity;
    private final String[] nama;
    private final Integer[] foto;
    //konstruktor
    public KontakAdapter(Activity activity, String[] nama, Integer[] foto) {
        super(activity, R.layout.content_kontak, nama);
        this.activity = activity;
        this.nama = nama;
        this.foto = foto;
    }
    //method untuk menampilkan kontent di listView
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater layoutInflater = activity.getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.list_kontak, null, true);
        TextView textView = (TextView) view.findViewById(R.id.text_contact);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_contact);

        textView.setText(nama[position]);
        imageView.setImageResource(foto[position]);

        return view;
    }
}
