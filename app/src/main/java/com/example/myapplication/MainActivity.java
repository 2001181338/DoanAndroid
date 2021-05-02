package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    EditText timKiem;
    BottomNavigationView bottomNavigationView;
    Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        frameLayout = findViewById(R.id.frameLayout);
        timKiem = findViewById(R.id.timKiem);
        bottomNavigationView = findViewById(R.id.menuBottom);

        //Load fragment main
        LoadFragment(new Fragment_TrangChu());

        //Event Selection Item Menu
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();
                switch (id){
                    case R.id.trangChu:
                        currentFragment = new Fragment_TrangChu();
                        break;
                    case R.id.lichSu:
                        break;
                    case R.id.taiKhoan:
                        break;
                    case R.id.nganHang:
                        break;
                }
                LoadFragment(currentFragment);
                return true;
            }
        });

    }


    protected void LoadFragment(Fragment fragment)
    {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, fragment);
        transaction.commit();
    }
}