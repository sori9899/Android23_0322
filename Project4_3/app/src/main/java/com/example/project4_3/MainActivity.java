package com.example.project4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edit1,edit2;
    Button btnAdd, btnSub, btnMul, btnDiv, btnRest;
    TextView textResult;
    String num1, num2;
    double result;

    String re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setTitle("초간단 계산기");

        edit1 = (EditText) findViewById(R.id.Edit1);
        edit2 = (EditText) findViewById(R.id.Edit2);

        btnAdd = (Button) findViewById(R.id.BtnAdd);
        btnSub = (Button) findViewById(R.id.BtnSub);
        btnDiv = (Button) findViewById(R.id.BtnDiv);
        btnMul = (Button) findViewById(R.id.BtnMul);
        btnRest = (Button) findViewById(R.id.BtnRest);

        textResult = (TextView) findViewById(R.id.TextResult);


        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "TextArea is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                result = Double.parseDouble(num1)+Double.parseDouble(num2);
                re = ""+result;
                textResult.setText("계산 결과 : "+ re);
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "TextArea is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                if(Double.parseDouble(num2) == 0){
                    Toast.makeText(MainActivity.this, "Divide with Zero", Toast.LENGTH_SHORT).show();
                    return;
                }
                
                result = Double.parseDouble(num1)/Double.parseDouble(num2);
                re = ""+result;
                textResult.setText("계산 결과 : "+ re);
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "TextArea is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                result = Double.parseDouble(num1)*Double.parseDouble(num2);
                re = ""+result;
                textResult.setText("계산 결과 : "+re);
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "TextArea is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                result = Double.parseDouble(num1)-Double.parseDouble(num2);
                re = ""+result;
                textResult.setText("계산 결과 : "+re);
            }
        });

        btnRest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = edit1.getText().toString();
                num2 = edit2.getText().toString();

                if(num1.isEmpty() || num2.isEmpty()){
                    Toast.makeText(MainActivity.this, "TextArea is Empty", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(Double.parseDouble(num2) == 0){
                    Toast.makeText(MainActivity.this, "Divide with Zero", Toast.LENGTH_SHORT).show();
                    return;
                }

                result = Double.parseDouble(num1)%Double.parseDouble(num2);
                re = ""+result;
                textResult.setText("계산 결과 : "+re);
            }
        });


    }
}