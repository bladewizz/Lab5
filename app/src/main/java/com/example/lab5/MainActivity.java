package com.example.lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView open;
    Button trigger;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        open = (TextView)findViewById(R.id.dev_droid);
        initView();



    }

    private void initView(){
        trigger = (Button)findViewById(R.id.trigger_intent);
        trigger.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v == trigger){
                    Toast.makeText(getApplicationContext(), "working", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }


}
