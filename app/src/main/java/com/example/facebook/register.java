package com.example.facebook;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class register extends AppCompatActivity {
    EditText email,fname,phone,pass;
    String Email,Fname,Phone,Pass;
    Button register,button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        register=findViewById(R.id.register);
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                init();
                valdate();

            }
        });
    }


public void init() {

    email = findViewById(R.id.email);
    fname = findViewById(R.id.fname);
    phone = findViewById(R.id.phone);
    pass = findViewById(R.id.pass);
    Email = email.getText().toString().trim();
    Fname = fname.getText().toString().trim();
    Phone = phone.getText().toString().trim();
    Pass = pass.getText().toString().trim();

}
public void valdate(){
    if (Email.isEmpty()) {
        email.setError("email can't be empty");
    }
    else if (Pass.isEmpty()){
        pass.setError("invalid password");
    }else {
        if (!Email.contains("@")){

        }else {
            Toast.makeText(this,"login successful",Toast.LENGTH_LONG).show();
        }
    }
}
}


