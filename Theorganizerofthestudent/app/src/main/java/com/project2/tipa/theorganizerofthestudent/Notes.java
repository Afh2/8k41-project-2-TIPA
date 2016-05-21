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

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.app.Activity;
import android.content.Intent;
import android.widget.RelativeLayout;

public class Notes extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onClickTimeTableButton(View view) {
        Intent intentForTimeTable = new Intent(Notes.this, TimeTable.class);
        startActivity(intentForTimeTable);
    }
    public void onClickMapButton(View view) {
        Intent intentForMap = new Intent(Notes.this, Map.class);
        startActivity(intentForMap);

    }
    @Override
    public void onBackPressed() {
        System.exit(0);
    }


}

