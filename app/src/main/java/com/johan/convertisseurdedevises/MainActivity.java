package com.johan.convertisseurdedevises;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public void convert(View view){
        EditText dollarAmoutEditText = findViewById(R.id.dollarAmoutEditText);

        Log.i("amount", dollarAmoutEditText.getText().toString());

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
