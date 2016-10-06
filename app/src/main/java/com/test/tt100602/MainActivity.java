package com.test.tt100602;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CheckBox chk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        chk = (CheckBox) findViewById(R.id.checkBox);
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
}
