package com.tutorials180.funapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button infoBtn;
    int counter=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        infoBtn=findViewById(R.id.infoBtn);
    }

    public void showMeYouThenWhyOkay(View objectView)
    {
        if(objectView.getId()==R.id.avatarIV)
        {
            Toast.makeText(this, "Avatar clicked", Toast.LENGTH_SHORT).show();
        }
        else if(objectView.getId()==R.id.infoBtn)
        {
            counter++;
            Toast.makeText(this,"Value is:"+ Integer.toString(counter), Toast.LENGTH_SHORT).show();
        }

    }

}
