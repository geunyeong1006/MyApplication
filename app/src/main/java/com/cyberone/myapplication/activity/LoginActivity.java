package com.cyberone.myapplication.activity;

import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.cyberone.myapplication.R;
//import com.cyberone.myapplication.repository.MySQLConnectionManager;

import java.sql.Connection;

public class LoginActivity extends AppCompatActivity {

    private TextView viewUserName;
    private TextView viewPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        viewUserName = (EditText) findViewById(R.id.editTextUsername);
        viewPassword = (EditText) findViewById(R.id.editTextPassword);

//        try {
//            Connection connection = MySQLConnectionManager.getConnection();
//
//            // 연결된 데이터베이스를 사용하여 작업 수행
//
//            connection.close(); // 작업 완료 후 연결 닫기
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (java.sql.SQLException e) {
//            throw new RuntimeException(e);
//        }

        Button loginButton = findViewById(R.id.buttonLogin);

        loginButton.setOnClickListener(new View.OnClickListener() {
            //php url 입력
            String URL = "http://10.0.2.2/login.php";
            @Override
            public void onClick(View view) {

               String userName = viewUserName.getText().toString().trim();
               String password = viewPassword.getText().toString().trim();

               if(userName.equals("") || password.equals("")){
                   Toast.makeText(LoginActivity.this, "정보를 입력해주세요", Toast.LENGTH_SHORT).show();
               }else{

               }
            }
        });

        Button signUpButton = findViewById(R.id.buttonSignUp);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 회원가입 버튼을 눌렀을 때 회원가입 화면으로 이동
                Intent intent = new Intent(LoginActivity.this, SignUpActivity.class);
                startActivity(intent);
            }
        });
    }
}