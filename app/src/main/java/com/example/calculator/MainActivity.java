package com.example.calculator;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText t1;
    TextView t2;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,bX,bC,bD,bDot,bM,bA,bS,bE,bAc,bP;
    float val,val2;
    int flagA=0,flagS=0,flagD=0,flagM=0,flagP=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b0=findViewById(R.id.bt0);
        b1=findViewById(R.id.bt1);
        b2=findViewById(R.id.bt2);
        b3=findViewById(R.id.bt3);
        b4=findViewById(R.id.bt4);
        b5=findViewById(R.id.bt5);
        b6=findViewById(R.id.bt6);
        b7=findViewById(R.id.bt7);
        b8=findViewById(R.id.bt8);
        b9=findViewById(R.id.bt9);
        bM=findViewById(R.id.btm);
        bA=findViewById(R.id.bta);
        bS=findViewById(R.id.bts);
        bD=findViewById(R.id.btd);
        t1=findViewById(R.id.txt1);
        t2=findViewById(R.id.txt2);
        bX=findViewById(R.id.btx);
        bC=findViewById(R.id.btc);
        bDot=findViewById(R.id.btDot);
        bE=findViewById(R.id.bte);
        bAc=findViewById(R.id.btac);
        bP=findViewById(R.id.btp);

        // Initialization
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"0");
            }
        });
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+"9");
            }
        });
        bDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t1.setText(t1.getText()+".");
            }
        });

        //Perform
        bA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1==null){
                    Toast.makeText(MainActivity.this, "Input Something", Toast.LENGTH_SHORT).show();
                }else{
                    val=Float.parseFloat(t1.getText()+ "");
                    flagA=1;
                    t1.setText(null);
                }
            }
        });
        bS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1==null){
                    Toast.makeText(MainActivity.this, "Input Something", Toast.LENGTH_SHORT).show();
                }else{
                    val=Float.parseFloat(t1.getText()+ "");
                    flagS=1;
                    t1.setText(null);
                }
            }
        });
        bM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1==null){
                    Toast.makeText(MainActivity.this, "Input Something", Toast.LENGTH_SHORT).show();
                }else{
                    val=Float.parseFloat(t1.getText()+ "");
                    flagM=1;
                    t1.setText(null);
                }
            }
        });
        bD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1==null){
                    Toast.makeText(MainActivity.this, "Input Something", Toast.LENGTH_SHORT).show();
                }else{
                    val=Float.parseFloat(t1.getText()+ "");
                    flagD=1;
                    t1.setText(null);
                }
            }
        });
        bP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t1.getText()==null){
                    Toast.makeText(MainActivity.this, "Input Something", Toast.LENGTH_SHORT).show();
                }else{
                    val=Float.parseFloat(t1.getText()+"");
                    flagP=1;
                    t1.setText(null);
                }

            }
        });
        bC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               t1.setText(null);
            }
        });
        bAc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                t2.setText(null);
                t1.setText(null);
            }
        });


        bE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               val2=Float.parseFloat(t1.getText()+"");
               if (flagA==1){
                   t2.setText(val+val2+"");
                   flagA=0;
               }
               if (flagS==1){
                   t2.setText(val-val2+"");
                   flagS=0;
               }
               if (flagM==1){
                   t2.setText(val*val2+"");
                   flagM=0;
               }
               if (flagD==1){
                   t2.setText(val/val2+"");
                   flagD=0;
               }
               if (flagP==1){
                   t2.setText(val%val2+"");
                   flagP=0;
               }
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int t=item.getItemId();
        switch (t){
            case R.id.abtUs:
                Intent i=new Intent(this,AboutUs.class);
                startActivity(i);
        }
        return true;
    }
}
