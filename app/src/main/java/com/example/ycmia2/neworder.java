package com.example.ycmia2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class neworder extends AppCompatActivity {

    Button btnsave,nextbtn;
    TextView nametext,addresstext, phonetext, itemtext, quantitytext, amounttext, datetext;


    FirebaseDatabase rootnode;
    DatabaseReference reference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_neworder);



        nametext = (TextView) findViewById(R.id.nametext);
        addresstext = (TextView) findViewById(R.id.addresstxt);
        phonetext = (TextView) findViewById(R.id.phonetext);


        btnsave =(Button)findViewById(R.id.btnsave);
        nextbtn = (Button)findViewById(R.id.nextbtn);

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                rootnode = FirebaseDatabase.getInstance();
                reference = rootnode.getReference("Clientdetails");


                String name = nametext.getText().toString();
                String address = addresstext.getText().toString();
                String phone = phonetext.getText().toString();

                UserHelperClass helperClass = new UserHelperClass(name,address,phone);
                reference.child(name).setValue(helperClass);


            }
        });

        nextbtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v){
                openNewActivity();
            }

        });

    }
    public void openNewActivity(){
        Intent intent = new Intent(neworder.this, new_order.class);
        startActivity(intent);
    }
}
