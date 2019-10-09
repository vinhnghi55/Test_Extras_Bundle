package com.example.test_extras_bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Trace;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AActivity extends AppCompatActivity {
    private EditText etTittle, etDescription;
    private Button btnSendData;

    public static final String tITTLE = "TITTLE";
    public static final String dESCRIPTION = "DESXRIPTION";
    public static final String bUNDLE = "BUNDLE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        etTittle = (EditText) findViewById(R.id.et_tittle);
        etDescription = (EditText) findViewById(R.id.et_description);
        btnSendData = (Button) findViewById(R.id.btn_send_data);

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tittle = etTittle.getText().toString();
                String description = etDescription.getText().toString();

//                byExtras(tittle, description);
                byBundle(tittle, description);
            }
        });
    }

    public void byExtras(String tittle, String description) {
        Intent intent = new Intent(AActivity.this, BActivity.class);
        intent.putExtra(tITTLE, tittle);
        intent.putExtra(dESCRIPTION, description);
        startActivity(intent);
    }

    public void byBundle(String tittle, String description){
        Intent intent = new Intent(AActivity.this, BActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString(tITTLE, tittle);
        bundle.putString(dESCRIPTION, description);
        intent.putExtra(bUNDLE, bundle);
        startActivity(intent);
    }
}
