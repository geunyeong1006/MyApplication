package com.cyberone.myapplication.activity;

import android.content.Intent;
import android.database.SQLException;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.cyberone.myapplication.R;
import com.cyberone.myapplication.repository.MySQLConnectionManager;

import java.sql.Connection;

public class LoginActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

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