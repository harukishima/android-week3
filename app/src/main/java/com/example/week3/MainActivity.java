package com.example.week3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends Activity {
    Button btnReset, btnSignup;
    EditText edtUser;
    EditText edtPass;
    EditText edtRetype;
    EditText edtBirth;
    RadioButton rdMale;
    RadioButton rdFemale;
    CheckBox ckTennis;
    CheckBox ckFutbal;
    CheckBox ckOthers;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnReset = (Button)findViewById(R.id.reset);
        btnSignup = (Button)findViewById(R.id.signup);
        edtUser = (EditText)findViewById(R.id.inputUser);
        edtPass = (EditText)findViewById(R.id.inputPass);
        edtRetype = (EditText)findViewById(R.id.inputRetype);
        edtBirth = (EditText)findViewById(R.id.inputBirth);
        rdMale = (RadioButton)findViewById(R.id.inputMale);
        rdFemale= (RadioButton)findViewById(R.id.inputFemale);
        ckTennis = (CheckBox)findViewById(R.id.inputTennis);
        ckFutbal = (CheckBox)findViewById(R.id.inputFutbal);
        ckOthers = (CheckBox)findViewById(R.id.inputOtherSport);
        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtUser.setText("");
                edtPass.setText("");
                edtRetype.setText("");
                edtBirth.setText("");
                ckFutbal.setChecked(false);
                ckTennis.setChecked(false);
                ckOthers.setChecked(false);
                rdFemale.setChecked(false);
                rdMale.setChecked(false);

            }
        });
    }
}