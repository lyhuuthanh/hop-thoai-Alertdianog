 package com.example.hopthoaiarlaydiaog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

 public class MainActivity extends AppCompatActivity {

    Button mhopthoai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mhopthoai = findViewById(R.id.hopthoai);

        mhopthoai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("hop thong bao khan");
                builder.setMessage("ban co chac chan muon vay khong?");
                builder.setIcon(R.mipmap.ic_launcher);

            }
        });


    }
}
