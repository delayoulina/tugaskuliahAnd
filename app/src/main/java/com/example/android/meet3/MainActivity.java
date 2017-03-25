package com.example.android.meet3;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    boolean wrongPass = false;
    boolean callDetail = false;
    EditText txtPass;
    EditText txtUser;
    private static final String tag = "MyMainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag, "ini event onCreate()!!! ");

        txtUser = (EditText) findViewById(R.id.txtUser);
        txtPass = (EditText) findViewById(R.id.txtPass);
        Button btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!(txtPass.getText().toString().equals("dela") && txtUser.getText().toString().equals("dela"))){
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setTitle("Password Salah");
                    builder.create().show();
                    wrongPass = true;
                }else{
                    Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                    startActivity(intent);
                    callDetail = true;
                }
            }
        });

        if(savedInstanceState != null){
            wrongPass = savedInstanceState.getBoolean("wrong_pass");
        }

        if(wrongPass){
            AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
            builder.setTitle("Password Salah");
            builder.create().show();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(tag, "ini event onStart()!!! ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(tag, "ini event onRestart()!!! ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(tag, "ini event onResume()!!! ");
        if(callDetail){
            finish();
        }
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(tag, "ini event onDestroy()!!! ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "ini event onStop()!!! ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "ini event onPause()!!! ");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putBoolean("wrong_pass",wrongPass);
        super.onSaveInstanceState(outState);
    }
}
