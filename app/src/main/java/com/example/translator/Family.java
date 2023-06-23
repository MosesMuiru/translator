package com.example.translator;

import static com.example.translator.R.id.numberslistview;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Family extends AppCompatActivity {

    WordModal wordModal;
    ListView familiesList;
    CustomAdapter customAdapter;

    List <WordModal> families;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_family);




        families = new ArrayList  <WordModal> ();
        familiesList = findViewById(R.id.numberslistview);

//        method for adding members the list
        addFamiles();
        customAdapter = new CustomAdapter(getApplicationContext(), (ArrayList<WordModal>) families);

        familiesList.setAdapter(customAdapter);

        listview.setonItemSelectedListener()

    }

    public void addFamiles(){

        families.add(new WordModal("Mother","mokoro",R.drawable.filepapers));
        families.add(new WordModal("father","Motheee",R.drawable.filepapers));
        families.add(new WordModal("grandmother","kukhu",R.drawable.filepapers));
        families.add(new WordModal("grandfather","kuka",R.drawable.filepapers));
        families.add(new WordModal("Uncle","m-a-m-a",R.drawable.filepapers));
        families.add(new WordModal("Brother in law","mukhwasi",R.drawable.filepapers));
        families.add(new WordModal("goat","mbori",R.drawable.filepapers));





    }
}