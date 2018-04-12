package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        createNumArrayList();
    }

    private void createNumArrayList(){
        ArrayList<String> words = new ArrayList<String>();
        words.add(0, "One");
        words.add(1, "Two");
        words.add(2, "Three");
        words.add(3, "Four");
        words.add(4, "Five");
        words.add(5, "Six");
        words.add(6, "Seven");
        words.add(7, "Eight");
        words.add(8, "Nine");
        words.add(9, "Ten");
    }
}
