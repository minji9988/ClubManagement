// 서버에 보내거나 받을 때 Json 형식으로 보내거나 받아야하기 때문에 데이터를 정렬해줄 DTO 클래스를 만들어 줍니다.
// ※ DTO란 ? Data Transfer Object의 줄임말로 데이터를 오브젝트로 변환하는 객체입니다.

//@SerializedName은 서버에서 정의한 변수명과 Android에서 정의할 변수를 연결해주는 역할을 합니다.
// 서버에 보낼 데이터이며 입력한 id 와 password를 서버에 보내줍니다.

package com.example.clubmanagement;
import com.google.gson.annotations.SerializedName;

public
class LoginRequest {

        @SerializedName("input_id")
        public String inputId;

        @SerializedName("input_pw")
        public String inputPw;

        public String getInputId() {
            return inputId;
        }

        public String getInputPw() {
            return inputPw;
        }

        public void setInputId(String inputId) {
            this.inputId = inputId;
        }

        public void setInputPw(String inputPw) {
            this.inputPw = inputPw;
        }

        public LoginRequest(String inputId, String inputPw) {
            this.inputId = inputId;
            this.inputPw = inputPw;
        }
    }

