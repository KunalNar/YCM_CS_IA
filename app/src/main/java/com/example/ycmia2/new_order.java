package com.example.ycmia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class new_order extends AppCompatActivity {

    TextView itemtxt, messagetxt, timetxt, amounttxt;
    Button savebtn,nextbtn;



    FirebaseDatabase rootnode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_order);


        itemtxt = (TextView) findViewById(R.id.itemtxt);
        messagetxt = (TextView) findViewById(R.id.messagetxt);
        timetxt = (TextView) findViewById(R.id.timetxt);
        amounttxt = (TextView) findViewById(R.id.amounttxt);
        nextbtn = (Button) findViewById(R.id.nextbtn);
        savebtn = (Button) findViewById(R.id.btnsave);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                rootnode = FirebaseDatabase.getInstance();
                reference = rootnode.getReference("Customerdetails");


                String item = itemtxt.getText().toString();
                String message = messagetxt.getText().toString();
                String time = timetxt.getText().toString();
                String amount = amounttxt.getText().toString();



                HelperClass helperClass = new HelperClass(item,message,time,amount);
                reference.child(item).setValue(helperClass);


            }
        });
        nextbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                openNewActivity2();
            }

            private void openNewActivity2() {
                Intent intent = new Intent(new_order.this, ExistingOrders.class);
                startActivity(intent);
            }

        });

    }

}