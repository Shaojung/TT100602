package com.test.tt100602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
    implements View.OnClickListener
{
    CheckBox chk;
    RadioButton rb1, rb2, rb3;
    RadioButton rb[];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rb = new RadioButton[3];
        chk = (CheckBox) findViewById(R.id.checkBox);
        rb1 = (RadioButton) findViewById(R.id.radioButton3);
        rb2 = (RadioButton) findViewById(R.id.radioButton4);
        rb3 = (RadioButton) findViewById(R.id.radioButton5);
        rb[0] = rb1;
        rb[1] = rb2;
        rb[2] = rb3;
        rb1.setOnClickListener(this);
        rb2.setOnClickListener(this);
        rb3.setOnClickListener(this);

        chk.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true)
                {
                    Toast.makeText(MainActivity.this, "有勾", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this, "沒有勾", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public void onClick(View v) {
        TextView tv = (TextView) v;
        Toast.makeText(MainActivity.this, tv.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
