package com.nabadeep.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {
   private TextView tbmi;
   private TextView advice;
   private ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        imageView=findViewById(R.id.imageView);
        tbmi=findViewById(R.id.bmi);
        advice=findViewById(R.id.restext);
        Intent intent;
        intent=getIntent();
float bmi=intent.getFloatExtra("bmi",-1);
tbmi.setText("Your BMI is : "+String.valueOf(bmi).substring(0,4));
String res;
if(bmi<18.5)
{ res="Tumi  Under weight,Khowa koriba olop";
imageView.setImageDrawable(getDrawable(R.drawable.red));}
else if(bmi>=18.5 && bmi<25){
    res="Tumi pura healthy asa,fuli najaba aru";}
else if( bmi<30){
    res="Tumi olop besi healthy mane xokot category t pora";
    imageView.setImageDrawable(getDrawable(R.drawable.yellow));
}
else{
    res="Tumi bohut xokot category t pora ";
    imageView.setImageDrawable(getDrawable(R.drawable.red));}
advice.setText(res);



    }
}
