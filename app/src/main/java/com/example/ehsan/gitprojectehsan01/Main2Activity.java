package com.example.ehsan.gitprojectehsan01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class Main2Activity extends AppCompatActivity {
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        textView= (TextView) findViewById(R.id.act2_txt);
        textView.setText("code ok");
        textView.setTextColor(getResources().getColor(R.color.colorPrimary));
        Toast.makeText(this, "ffffffffff", Toast.LENGTH_SHORT).show();
    }
}
