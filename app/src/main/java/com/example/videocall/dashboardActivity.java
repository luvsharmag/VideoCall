package com.example.videocall;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import org.jetbrains.annotations.NotNull;

public class dashboardActivity extends AppCompatActivity {
FrameLayout frameLayout;
BottomNavigationView bottonbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
       frameLayout  = findViewById(R.id.frame);
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame,new homeFragment());
        transaction.commit();
        bottonbar = findViewById(R.id.bottomBar);
        bottonbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull @NotNull MenuItem item) {
                FragmentTransaction transaction1 = getSupportFragmentManager().beginTransaction();
                switch (item.getItemId()){
                    case R.id.Home:
                        transaction1.replace(R.id.frame,new homeFragment());
                        item.setChecked(true);
                        break;
                    case R.id.Profile:
                        transaction1.replace(R.id.frame,new ProfileFragment());
                        item.setChecked(true);
                        break;
                }
                try{
                    transaction1.commit();
                }catch (Exception e){
                    e.printStackTrace();
                }
                return false;
            }
        });

    }
}