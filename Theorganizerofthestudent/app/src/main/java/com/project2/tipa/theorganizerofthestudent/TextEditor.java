package com.project2.tipa.theorganizerofthestudent;

import android.support.v7.app.ActionBarActivity;
import android.os.*;
import android.os.Process;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.os.Bundle;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;


public class TextEditor extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_editor);

    }
    public void onClickOKButton (View view) throws IOException {
        EditText ET = (EditText)findViewById(R.id.editText2);
        EditText ET2 = (EditText)findViewById(R.id.editText);
        File sdPathCatalog = Environment.getExternalStorageDirectory();
        sdPathCatalog = new File(sdPathCatalog.getAbsolutePath() + "/" + "Organaizer");
        sdPathCatalog.mkdirs();
        final String FileName = ET.getText().toString();
        final String TextFromBox = ET2.getText().toString();
        File sdFile = new File(sdPathCatalog, FileName);
        BufferedWriter bw = new BufferedWriter(new FileWriter(sdFile));
        bw.write(TextFromBox);
        bw.close();
        finish();
    }
    public void onClickXButton (View view){
        finish();
    }
}
