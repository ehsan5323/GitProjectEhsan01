package com.example.ehsan.gitprojectehsan01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnok;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnok= (Button) findViewById(R.id.act_main_btnok);
        btnok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "toast", Toast.LENGTH_SHORT).show();
            }
        });
        


    }
//    public void clickToast(){
//        Toast.makeText(this, "okkk", Toast.LENGTH_SHORT).show();
//    }
}
