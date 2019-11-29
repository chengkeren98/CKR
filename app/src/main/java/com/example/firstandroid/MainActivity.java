package com.example.firstandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button mBtnTestView;
    private Button mBtnTestView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnTestView = findViewById(R.id.btn_testView1);
        mBtnTestView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Jump to SignUp Interface
                Intent intent = new Intent(MainActivity.this, SignInActivity.class);
                startActivity(intent);
            }
        });

        mBtnTestView2 = findViewById(R.id.btn_testView2);
        mBtnTestView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Jump to SignUp Interface
                Intent intent = new Intent(MainActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}
