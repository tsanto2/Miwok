/*
 * Copyright (C) 2016 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.android.miwok;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        setupListeners();
    }

    private void setupListeners(){
        createListeners(R.id.numbers, NumbersActivity.class);
        createListeners(R.id.family, FamilyActivity.class);
        createListeners(R.id.colors, ColorsActivity.class);
        createListeners(R.id.phrases, PhrasesActivity.class);
    }

    private void createListeners(int id, final Class activityClass) {
        final TextView textView = (TextView) findViewById(id);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Opening: " + textView.getText(), Toast.LENGTH_SHORT).show();
                startNewActivity(activityClass);
            }
        });
    }

    public void startNewActivity(Class thisClass){
        Intent intent = new Intent(this, thisClass);
        startActivity(intent);
    }
}
