package com.cyberone.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.TextView;

import com.cyberone.myapplication.R;
import com.cyberone.myapplication.repository.MySQLConnectionManager;

import java.sql.SQLException;

public class MainActivity extends AppCompatActivity {
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            MySQLConnectionManager.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        resultTextView = findViewById(R.id.resultTextView);

        // AsyncTask를 사용하여 백그라운드에서 쿼리 실행 및 결과 처리
        new QueryTask().execute();
    }

    private class QueryTask extends AsyncTask<Void, Void, String> {
        @Override
        protected String doInBackground(Void... voids) {
            String query = "SELECT * FROM users";
            return MySQLConnectionManager.executeQuery(query);
        }

        @Override
        protected void onPostExecute(String result) {
            resultTextView.setText(result);
        }
    }
}