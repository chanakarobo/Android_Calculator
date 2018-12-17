package com.example.chanaka.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button one;
    private Button two;
    private Button three;
    private Button four;
    private Button five;
    private Button six;
    private Button seven;
    private Button eight;
    private Button nine;
    private Button zero;
    private Button div;
    private Button multi;
    private Button sub;
    private Button add;
    private Button equal;
    private Button clr;
    private TextView control;
    private TextView result;
    private final char addtion ='+';
    private final char subtract ='-';
    private final char divition ='/';
    private final char multification ='*';
    private final char eqe=0;
    private Double val_1=Double.NaN;
    private Double val_2;
    private char act;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        SetupUIViews();

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               control.setText(control.getText().toString() +"0");

            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"1");

            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"2");

            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"3");

            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"4");

            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"5");

            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"6");

            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"7");

            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"8");

            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                control.setText(control.getText().toString() +"9");

            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                act=addtion;
                result.setText(String.valueOf(val_1) + "+");
                control.setText(null);

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                act=subtract;
                result.setText(String.valueOf(val_1) + "-");
                control.setText(null);

            }
        });

        multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                act=multification;
                result.setText(String.valueOf(val_1) + "*");
                control.setText(null);

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                act=divition;
                result.setText(String.valueOf(val_1) + "/");
                control.setText(null);

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                compute();
                act=eqe;
                result.setText(result.getText().toString() + String.valueOf(val_2) + "="+ String.valueOf(val_1));
                control.setText(null);
            }
        });

        clr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(control.getText().length()>0){

                  CharSequence name =control.getText().toString();
                  control.setText(name.subSequence(0,name.length()-1));
              }
              else {

                  val_1=Double.NaN;
                  val_2=Double.NaN;

                  control.setText(null);
                  result.setText(null);

              }

            }
        });





    }

    private void SetupUIViews(){

        one=(Button)findViewById(R.id.btn1);
        zero=(Button)findViewById(R.id.btn0);
        two=(Button)findViewById(R.id.btn2);
        three=(Button)findViewById(R.id.btn3);
        four=(Button)findViewById(R.id.btn4);
        five=(Button)findViewById(R.id.btn5);
        six=(Button)findViewById(R.id.btn6);
        seven=(Button)findViewById(R.id.btn7);
        eight=(Button)findViewById(R.id.btn8);
        nine=(Button)findViewById(R.id.btn9);
        div=(Button)findViewById(R.id.btn_div);
        multi=(Button)findViewById(R.id.btn_mult);
        sub=(Button)findViewById(R.id.btn_sub);
        add=(Button)findViewById(R.id.btn_add);
        equal=(Button)findViewById(R.id.btn_eqe);
        clr=(Button)findViewById(R.id.btn_clr);
        control=(TextView)findViewById(R.id.text_con);
        result=(TextView)findViewById(R.id.text_result);



    }

    private void compute(){

        if(!Double.isNaN(val_1)){

            val_2=Double.parseDouble(control.getText().toString());

         switch (act){

             case addtion:
                 val_1=val_1+val_2;
                 break;

             case subtract:
                 val_1=val_1-val_2;
                 break;

             case multification:
                 val_1=val_1*val_2;
                 break;

             case divition:
                 val_1=val_1/val_2;
                 break;

             case eqe:
                 break;




         }
        }
        else{

            val_1=Double.parseDouble(control.getText().toString());

        }

    }

}
