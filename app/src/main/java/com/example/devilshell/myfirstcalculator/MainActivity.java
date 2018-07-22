package com.example.devilshell.myfirstcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnc, btnac, btn00, btnhash, btnadd, btnsub, btnmul, btndiv, btneq, btncent;
    TextView tvresult;
    double var1, var2;
    boolean add, sub, mul, div,cent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btn00 = findViewById(R.id.btn00);
        btnhash = findViewById(R.id.btnhash);
        btnc = findViewById(R.id.btnc);
        btnac = findViewById(R.id.btnac);
        btnadd = findViewById(R.id.btna);
        btnsub = findViewById(R.id.btns);
        btnmul = findViewById(R.id.btnm);
        btndiv = findViewById(R.id.btnd);
        btneq = findViewById(R.id.buttoneq);
        btncent = findViewById(R.id.btncent);
        tvresult = findViewById(R.id.textView);

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText().toString() + "0");
            }

        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "9");
            }
        });

        btn00.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(tvresult.getText() + "00");
            }
        });

        btnadd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tvresult.getText()+"");
                add=true;
                tvresult.setText(null);
            }
        });

        btnsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tvresult.getText()+"");
                sub=true;
                tvresult.setText(null);
            }
        });

        btnmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tvresult.getText()+"");
                mul=true;
                tvresult.setText(null);
            }
        });

        btndiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tvresult.getText()+"");
                div=true;
                tvresult.setText(null);
            }
        });

        btncent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var1=Double.parseDouble(tvresult.getText()+"");
                cent=true;
                tvresult.setText(null);
            }
        });

        btneq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                var2=Double.parseDouble(tvresult.getText()+"");
                if(add==true)
                {
                    tvresult.setText(var1+var2+"");
                    add=false;
                }
                if(sub==true)
                {
                    tvresult.setText(var1-var2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    tvresult.setText(var1*var2+"");
                    mul=false;
                }
                if(div==true)
                {
                    tvresult.setText(var1/var2+"");
                    div=false;
                }
                if(cent==true)
                {
                    tvresult.setText((var1/var2)*100+"");
                    cent=true;
                }
            }
        });

        btnc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tvresult.setText(null);
            }
        });

    }
}