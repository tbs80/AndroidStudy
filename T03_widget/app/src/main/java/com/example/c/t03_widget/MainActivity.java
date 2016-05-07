package com.example.c.t03_widget;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTest = (Button) findViewById(R.id.btnTest);
        btnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "버튼이 클릭되었습니다", Toast.LENGTH_LONG).show();
            }
        });

        CheckBox chkCola = (CheckBox) findViewById(R.id.chkCola);
        chkCola.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "콜라 : " + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        CheckBox chkSida = (CheckBox) findViewById(R.id.chkSida);
        chkSida.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                Toast.makeText(MainActivity.this, "사이다 : " + isChecked, Toast.LENGTH_SHORT).show();
            }
        });

        RadioGroup rgShop = (RadioGroup) findViewById(R.id.rgShop);
        rgShop.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                switch (checkedId) {
                    case R.id.rbMc :
                        Toast.makeText(MainActivity.this, ((RadioButton)findViewById(checkedId)).getText(), Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.rbBk :
                        Toast.makeText(MainActivity.this, "버거킹", Toast.LENGTH_SHORT).show();
                        break;
                }
            }
        });

        Button btnOk = (Button)findViewById(R.id.btnOk);
        btnOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText)findViewById(R.id.editTextResult);
                Toast.makeText(MainActivity.this, editText.getText(), Toast.LENGTH_SHORT).show();
                editText.setText("");
            }
        });
    }
}
