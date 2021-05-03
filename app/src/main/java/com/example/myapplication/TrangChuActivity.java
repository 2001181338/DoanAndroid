package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TrangChuActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    BottomNavigationView bottomNavigationView;
    Fragment currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Ánh xạ
        frameLayout = findViewById(R.id.frameLayout);
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
                        currentFragment = new LichSuChuyenDi_Fragment();
                        break;
                    case R.id.taiKhoan:
                        currentFragment = new FragmentThongTinKhachHang();
                        break;
                    case R.id.nganHang:
                        currentFragment = new TaiKhoanNganHangFragment();
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