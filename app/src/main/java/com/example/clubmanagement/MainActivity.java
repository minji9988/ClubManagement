package com.example.clubmanagement;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public
class MainActivity extends AppCompatActivity {

// retrofit test하면서 만든 example
//    Call<data_model> call;
//    TextView textView;

    @Override
    protected
    void onCreate ( Bundle savedInstanceState ) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // 로그인 페이지에 있는 '회원가입' 텍스트 클릭 시
        // RegisterActivity(회원가입 페이지)로 이동
        TextView txtRegister = (TextView) findViewById(R.id.registerTextButton);
        txtRegister.setOnClickListener(new View.OnClickListener() {
            public void onClick( View view) {
                Intent intent = new Intent(MainActivity.this , RegisterActivity.class);
                startActivity(intent);

            }
        });

    }

}


//
//        textView =findViewById(R.id.text_view);
//
//        call = Retrofit_Client.getApiService().test_api_get("5");
//        call.enqueue(new Callback<data_model>(){
//            //콜백 받는 부분
//                    //콜백 받는 부분
//                    @Override
//                    public void onResponse( Call<data_model> call, Response<data_model> response) {
//                        data_model result = response.body();
//                        String str;
//                        str= result.getUserId() +"\n"+
//                                result.getID()+"\n"+
//                                result.getTitle()+"\n"+
//                                result.getBody();
//                        textView.setText(str);
//                    }
//
//                    @Override
//                    public void onFailure(Call<data_model> call, Throwable t) {
//
//                    }
//                });
//
//
//            }
//        }
