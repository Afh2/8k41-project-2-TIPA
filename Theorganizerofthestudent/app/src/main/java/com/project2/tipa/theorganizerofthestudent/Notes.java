/*
* Copyright © 2016 TIPA.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Apache License Version 2.0,
* with full text available at http://www.apache.org/licenses/LICENSE-2.0.html
* This software is provided "as is". Use at your own risk.
* Version = 0.0.1
* Notes.java
*/
package com.project2.tipa.theorganizerofthestudent;

import android.os.*;
import android.os.Process;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.RelativeLayout;

import static android.R.layout.simple_list_item_1;

public class Notes extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView ListW = (ListView)findViewById(R.id.listView);
        if (!ListW.isDirty()){
            final String[] sEmpty = new String[] {"Empty Here!"};
            ArrayAdapter<String> emptyAdapter = new ArrayAdapter<String>(this, simple_list_item_1, sEmpty);
            ListW.setAdapter(emptyAdapter);
        }

    }
    public void onClickTimeTableButton(View view) {
        Intent intentForTimeTable = new Intent(Notes.this, TimeTable.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);

        startActivity(intentForTimeTable);
    }
    public void onClickMapButton(View view) {
        Intent intentForMap = new Intent(Notes.this, Map.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intentForMap);

    }
    public void onClickNewNote(View view) {
        Intent intentForEditor = new Intent(Notes.this, TextEditor.class).addFlags(Intent.FLAG_ACTIVITY_REORDER_TO_FRONT);
        startActivity(intentForEditor);

    }



}

