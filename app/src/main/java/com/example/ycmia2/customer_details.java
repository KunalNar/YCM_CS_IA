package com.example.ycmia2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class customer_details extends AppCompatActivity {

    DatabaseReference databaseReference;
    FirebaseDatabase database;

    TextView nameview;

    Button searchbtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer_details);


        EditText searchtxt= (EditText) findViewById(R.id.searchtxt);
        Button searchbtn = (Button)findViewById(R.id.searchtxt);

        searchbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String search = searchtxt.getText().toString();
                Toast.makeText(customer_details.this, search, Toast.LENGTH_LONG).show();

            }
        });


    }
}
// databaseReference = FirebaseDatabase.getInstance().getReference().child("Clientdetails").child(search);
//
//            databaseReference.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(@NonNull @NotNull DataSnapshot snapshot) {
//                    String name=snapshot.child("phone").getValue().toString();
//                    nameview.setText(name);
//
//                }
//
//                @Override
//                public void onCancelled(@NonNull @NotNull DatabaseError error) {
//
//                }
//            });