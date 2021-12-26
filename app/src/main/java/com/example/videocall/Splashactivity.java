package com.example.videocall;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Splashactivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        new Handler().postDelayed(new Runnable() {
            FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
            @Override
            public void run() {
                if(user==null) {
                    startActivity(new Intent(Splashactivity.this, MainActivity.class));
                }else{
                    startActivity(new Intent(Splashactivity.this,dashboardActivity.class).addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK));
                }
            }
        },2000);
    }
}