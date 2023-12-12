package com.example.buttons22;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn;
    int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btn(View view) {
        counter++;
        btn = findViewById(R.id.btn);
        btn.setText("This is a click number:" + counter);
        if (counter == 7) {
            btn.setText("Enough to click. Go to new start!");
            counter = 0;
        }
    }
}