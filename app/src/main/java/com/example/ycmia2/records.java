package com.example.ycmia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class records extends AppCompatActivity {

    Button customerdetailsbtn, financebtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_records);

        customerdetailsbtn = (Button) findViewById(R.id.customerdetailsbtn);
        financebtn = (Button) findViewById(R.id.financebtn);

        customerdetailsbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {open_customer_details_activty(); }

            private void open_customer_details_activty() {

                Intent intent = new Intent(records.this, customer_details.class);
                startActivity(intent);
            }
        });
    
        financebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {open_finance_details();}

            private void open_finance_details() {
                Intent intent = new Intent(records.this, finance_details.class);
                startActivity(intent);
            }
        });


    }
}
