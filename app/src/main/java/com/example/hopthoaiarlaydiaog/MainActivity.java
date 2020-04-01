 package com.example.hopthoaiarlaydiaog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

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

                builder.setPositiveButton("CO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this,"Cam on ban",Toast.LENGTH_LONG).show();

                    }
                });
                builder.setNegativeButton("khong", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(MainActivity.this, "ban khong dong y", Toast.LENGTH_LONG).show();
                    }
                });
                        builder.setNegativeButton("Huy", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                     Toast.makeText(MainActivity.this,"ban thoat ra",Toast.LENGTH_SHORT).show();
                            }
                        });
                        builder.setNeutralButton("Thoat", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this,"ban da thoat",Toast.LENGTH_SHORT).show();
                            }
                        });
                        builder.show();
            }
        });


    }
}
