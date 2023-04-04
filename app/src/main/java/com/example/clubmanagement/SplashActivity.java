package com.example.clubmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import androidx.appcompat.app.AppCompatActivity;

//splash 화면이다.
// 3초동안 splash 화면이 뜨고, MainActivity로 이동한다.

public
class SplashActivity extends AppCompatActivity {

    protected  void onCreate( Bundle savedInstance) {
        super.onCreate(savedInstance);
        setContentView(R.layout.splash);

        //splash 3초 동안 뜨게 한다.
        Handler hd = new Handler();
        hd.postDelayed(new splashHandler(), 3000);
    }

    //SplashHandler 클래스를 만들고 그 안에 실행하고자 하는 스레드를 작성 후
//onCreate에 핸들러 선언과 postDelayed 매소드를 이용하여 3초후에 SplashHandler가 작동하도록 해줍니다.
//      (ex 1초 : 1000)
    private class splashHandler implements Runnable {
        public  void run() {
            startActivity(new Intent(getApplication(), MainActivity.class));
            SplashActivity.this.finish();
        }
    }

}

