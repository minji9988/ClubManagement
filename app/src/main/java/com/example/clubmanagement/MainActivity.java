package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

public
class MainActivity extends AppCompatActivity {

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 로그인 페이지에 있는 '회원가입' 텍스트 클릭 시
        // EmailRegisterActivity(회원가입 페이지)로 이동
        TextView txtRegister = (TextView) findViewById(R.id.registerTextButton);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick( View view) {
                Intent intent = new Intent(MainActivity.this , EmailRegisterActivity.class);
                startActivity(intent);

            }
        });

    }


}