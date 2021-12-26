package com.example.videocall;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;

public class signupActivity extends AppCompatActivity {
    EditText fullname,emailsign,passsign;
    Button createsignup,back;
    FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        fullname = findViewById(R.id.fullname);
        emailsign = findViewById(R.id.Emailsign);
        passsign = findViewById(R.id.passsignup);
        createsignup = findViewById(R.id.createsignup);
        back = findViewById(R.id.back);
        auth = FirebaseAuth.getInstance();
        FirebaseFirestore db = FirebaseFirestore.getInstance();
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(signupActivity.this,MainActivity.class));
            }
        });
        createsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = fullname.getText().toString();
                String email = emailsign.getText().toString();
                String pass = passsign.getText().toString();
                auth.createUserWithEmailAndPassword(email,pass).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){
                            HashMap<String,Object> map = new HashMap<>();
                            map.put("Name",name);
                            map.put("email",email);
                            map.put("pass",pass);
                            db.collection("users").document().set(map);
                            startActivity(new Intent(signupActivity.this,MainActivity.class));
                        }else {
                            Toast.makeText(signupActivity.this, task.getException().getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        }
                    }
                });
            }
        });
    }
}