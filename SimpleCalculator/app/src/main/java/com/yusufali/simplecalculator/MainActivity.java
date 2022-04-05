package com.yusufali.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText Number1;
    EditText Number2;
    TextView resultText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         Number1=findViewById(R.id.Number1);
         Number2=findViewById(R.id.Number2);
         resultText=findViewById(R.id.resultText);



    }
    public void topla(View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText(" sayi girin ! ");
        }else{

        int Numara1 =Integer.parseInt(Number1.getText().toString());
        int Numara2 =Integer.parseInt(Number2.getText().toString());
        int result =Numara1+Numara2;
        resultText.setText("Sonuc: "+result);

            }
        }

    public void cikar(View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText(" sayi girin ! ");
        }else{
        int Numara1 =Integer.parseInt(Number1.getText().toString());
        int Numara2 =Integer.parseInt(Number2.getText().toString());
        int result =Numara1-Numara2;
        resultText.setText("Sonuc: "+result);


        }
    }

    public void carp(View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText(" sayi girin ! ");
        }else{
        int Numara1 =Integer.parseInt(Number1.getText().toString());
        int Numara2 =Integer.parseInt(Number2.getText().toString());
        int result =Numara1*Numara2;
        resultText.setText("Sonuc: "+result);


        }
    }

    public void bol(View view){
        if(Number1.getText().toString().matches("")||Number2.getText().toString().matches("")){
            resultText.setText(" sayi girin ! ");
        }else{
        int Numara1 =Integer.parseInt(Number1.getText().toString());
        int Numara2 =Integer.parseInt(Number2.getText().toString());
        int result =Numara1/Numara2;
        resultText.setText("Sonuc: "+result);


        }
    }


}