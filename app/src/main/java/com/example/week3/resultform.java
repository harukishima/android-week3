package com.example.week3;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Arrays;

public class resultform extends Activity {
    TextView tUser, tPass, tBirth, tGender, tHobby;

    @SuppressLint("SetTextI18n")
    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultform);
        tUser = (TextView)findViewById(R.id.txtuser);
        tPass = (TextView)findViewById(R.id.txtpass);
        tBirth = (TextView)findViewById(R.id.txtbirth);
        tGender = (TextView)findViewById(R.id.txtgender);
        tHobby = (TextView)findViewById(R.id.txthobby);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        if(bundle != null)
        {
            String user = bundle.getString("username", "");
            String pass = bundle.getString("password", "");
            String birth = bundle.getString("birthdate", "");
            String gender = bundle.getString("gender", "");
            ArrayList<String> hobby = bundle.getStringArrayList("hobby");
            tUser.setText(tUser.getText() + ": " + user);
            int p = pass.length();
            String[] pp = new String[p];
            Arrays.fill(pp, "*");
            tPass.setText(tPass.getText() + ": " + String.join("", pp));
            tGender.setText(tGender.getText() + ": " + gender);
            tBirth.setText(tBirth.getText() + ": " + birth);
            assert hobby != null;
            String hobbiesStr = String.join(", ",hobby);
            tHobby.setText(tHobby.getText() + ": " + hobbiesStr);


        }


    }
}