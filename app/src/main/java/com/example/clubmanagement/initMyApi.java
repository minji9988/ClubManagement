package com.example.clubmanagement;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;


//통신을 정의해주는 interface를 만들어 통신을 위한 함수를 만들어줍니다.

// getLoginResponse 함수로 LoginRequest.java에 정의해준 데이터들을
// 서버 Body에 보낸 후 LoginResponse로 데이터를 받겠다는 의미를 가집니다.

public interface initMyApi {
        //@통신 방식("통신 API명")
        @POST("/api_init_session")
        Call<LoginResponse> getLoginResponse( @Body LoginRequest loginRequest);
    }
