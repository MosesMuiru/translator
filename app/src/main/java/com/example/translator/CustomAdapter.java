package com.example.translator;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    private Context context;
    private ArrayList<WordModal> families;



    public CustomAdapter(Context context, ArrayList<WordModal> families) {
        this.context = context;
        this.families = families;
    }

    @Override
    public int getCount() {
        return families.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
//        i == for inflating the index of various



        view = LayoutInflater.from(context).inflate(R.layout.listitem,viewGroup,false);
        TextView english = view.findViewById(R.id.english);
       TextView image =  view.findViewById(R.id.theimage);
        TextView kisii = view.findViewById(R.id.kisii);


        english.setText(families.get(i).getEnglishWord());
        kisii.setText(families.get(i).getKiswahiliWord());
        image.setText(families.get(i).getImage());



        return view;

            }
}
