
package com.example.report.myapplication2;

import android.support.v4.view.LayoutInflaterCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cb1;
    RadioButton rb1,rb2,rb3;
    ImageView iv1;
    Button btn1;
    LinearLayout l1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("애완동물 사진보기");

        cb1 = (CheckBox)findViewById(R.id.checkBox);
        rb1 = (RadioButton)findViewById(R.id.radioButton);
        rb2 = (RadioButton)findViewById(R.id.radioButton2);
        rb3 = (RadioButton)findViewById(R.id.radioButton3);
        iv1 = (ImageView)findViewById(R.id.imageView);
        btn1 = (Button)findViewById(R.id.button);
        l1 = (LinearLayout)findViewById(R.id.l1);

    cb1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
            if (isChecked)
                l1.setVisibility(View.VISIBLE);
            else
                l1.setVisibility(View.INVISIBLE);
        }
    });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(rb1.isChecked())
                   iv1.setImageResource(R.drawable.dog1);
                else if(rb2.isChecked())
                   iv1.setImageResource(R.drawable.dog2);
                else if(rb3.isChecked())
                    iv1.setImageResource(R.drawable.cat);
            }
        });
    }
    }

