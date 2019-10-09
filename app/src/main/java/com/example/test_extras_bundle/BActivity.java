package com.example.test_extras_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {

    private TextView tvTittle, tvDescription;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        tvTittle = (TextView) findViewById(R.id.tv_tittle);
        tvDescription = (TextView) findViewById(R.id.tv_description);

//        setDataByExtras();
        setDataByBundle();
    }

    public void setDataByExtras(){
        Intent intent = getIntent();

        String tittle = intent.getStringExtra(AActivity.tITTLE);
        String description = intent.getStringExtra(AActivity.dESCRIPTION);

        tvTittle.setText(tittle);
        tvDescription.setText(description);
    }

    public void setDataByBundle(){
        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra(AActivity.bUNDLE);
        String tittle = bundle.getString(AActivity.tITTLE);
        String description = bundle.getString(AActivity.dESCRIPTION);

        tvTittle.setText(tittle);
        tvDescription.setText(description);
    }
}
