package com.example.Pacasian.pacy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by sumith on 16-10-2017.
 */

public class about extends AppCompatActivity {

CheckBox checkbox;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        checkbox=(CheckBox)findViewById(R.id.cb);
        // add a button onclick for making it more functional
        
        if (checkbox.isChecked()==true)
        {
        
        //Add your operation here...
        
        }
    }
}
