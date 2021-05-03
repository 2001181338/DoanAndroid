package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    EditText taiKhoan;
    EditText matKhau;
    Button btnDangNhap, btnDangKy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dangnhap);

        //Ánh xạ
        taiKhoan = findViewById(R.id.edtName);
        matKhau = findViewById(R.id.edtPass);
        btnDangNhap = findViewById(R.id.btnDangNhap);
        btnDangKy = findViewById(R.id.btnDangKy);

        btnDangNhap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String tk = taiKhoan.getText().toString().toLowerCase();
                String mk = matKhau.getText().toString().toLowerCase();

                Intent intent = new Intent(MainActivity.this, TrangChuActivity.class);

                startActivity(intent);
                if( tk == "thin" && mk == "thin"){
//                    Intent intent = new Intent(MainActivity.this, TrangChuActivity.class);
//
//                    startActivity(intent);
                }
                else{
                    Toast.makeText(MainActivity.this, "Tài khoản hoặc mật khẩu không đúng", Toast.LENGTH_LONG).show();
                }
            }
        });

        btnDangKy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, DangKyActivity.class);

                startActivity(intent);
            }
        });

    }


}