package com.example.konversibiner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView hasil;
    EditText input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        hasil = (TextView)findViewById(R.id.textView4);
        input = (EditText)findViewById(R.id.editText3);
    }

    public void konversiBiner (View view) {
            int bin = Integer.parseInt(input.getText().toString());
            String binary = Integer.toBinaryString(bin);
            hasil.setText(binary);
    }
}
