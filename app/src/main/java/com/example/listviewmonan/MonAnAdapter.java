package com.example.listviewmonan;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class MonAnAdapter extends BaseAdapter {

    Context myContext;
    int mylayout;
    List<MonAn> arrayMonAn;

    public MonAnAdapter (Context context, int layout, List<MonAn> monAnList) {
        myContext = context;
        mylayout = layout;
        arrayMonAn = monAnList;
    }

    @Override
    public int getCount() {
        return arrayMonAn.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) myContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        convertView = inflater.inflate(mylayout, null);

        // Ánh xạ
        TextView textTen = (TextView) convertView.findViewById(R.id.textViewTen);
        textTen.setText(arrayMonAn.get(position).Ten);

        TextView textGia = (TextView) convertView.findViewById(R.id.textViewMoTa);
        textGia.setText(arrayMonAn.get(position).Gia + "");

        ImageView imgHinh = (ImageView) convertView.findViewById(R.id.imgviewHinh);
        imgHinh.setImageResource(arrayMonAn.get(position).Hinh);



        return convertView;
    }
}
