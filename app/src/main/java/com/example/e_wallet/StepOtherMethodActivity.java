package com.example.e_wallet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class StepOtherMethodActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.step_other_method);
        getSupportActionBar().hide();
    }

    public void toTopupMenu(View v) {
        Intent intent = new Intent(this, topup_menu.class);
        startActivity(intent);
    }
}