package com.example.clubmanagement;

// 서버로부터 받을 데이터들을 정의해줌

import com.google.gson.annotations.SerializedName;

public
class LoginResponse {

        @SerializedName("result") // 200이나 404
        public String resultCode;

        @SerializedName("access_token")
        public String token;

        @SerializedName("staff")
        public String staff;

        public String getResultCode() {
            return resultCode;
        }

        public void setResultCode(String resultCode) {
            this.resultCode = resultCode;
        }

        public String getToken() {
            return token;
        }

        public void setToken(String token) {
            this.token = token;
        }

        public String getStaff() {
            return staff;
        }

        public void setStaff(String staff) {
            this.staff = staff;
        }
    }

