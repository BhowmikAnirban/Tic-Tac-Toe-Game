package com.AnirbanBhowmik;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class first extends AppCompatActivity implements View.OnClickListener {
    EditText p1;
    EditText p2;
    Button start1;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        p1 = (EditText)findViewById(R.id.p1);
        p2 = (EditText)findViewById(R.id.p2);
        start1=findViewById(R.id.start);
    }

    @Override
    public void onClick(View v) {
        String p11=p1.getText().toString();
        String p22=p2.getText().toString();
        if(p11.length()!=0 && p22.length()!=0) {
            p1.setText(p11);
            p2.setText(p22);
            Intent intent=new Intent(first.this,MainActivity.class);
            startActivity(intent);

        }
        else
        {
            p1.setText("Player 1");
            p2.setText("Player 2");
            Intent intent=new Intent(first.this,MainActivity.class);
            startActivity(intent);
        }
    }
}
