package com.nabadeep.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        height=findViewById(R.id.height);
        weight=findViewById(R.id.weight);
        calculate=findViewById(R.id.calculate);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float h=Float.valueOf(height.getText().toString().trim());
                float w=Float.valueOf(weight.getText().toString().trim());
                float bmi=w/((h/100)*(h/100));
                Intent intent;
                intent=new Intent(MainActivity.this,ResultActivity.class);
                intent.putExtra("bmi",bmi);
                startActivity(intent);

            }
        });
    }
}
