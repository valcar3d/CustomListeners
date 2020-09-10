package com.example.customlisteners;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MyParentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnLong = findViewById(R.id.btnLong);


        btnLong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                downloadData();
            }
        });
    }

    private void downloadData() {

        DoSomeTask object = new DoSomeTask();
        object.setCustomObjectListener(new DataInterface() {
            @Override
            public void onObjectReady(String messageReady) {
                Toast.makeText(getApplicationContext(), messageReady, Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onDataLoaded(String dataLoaded) {
                Toast.makeText(getApplicationContext(), dataLoaded, Toast.LENGTH_SHORT).show();
            }
        });
    }


}