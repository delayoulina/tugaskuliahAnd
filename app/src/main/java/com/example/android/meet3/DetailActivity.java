package com.example.android.meet3;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

/**
 * Created by DYP on 18/02/2017.
 */

public class DetailActivity extends AppCompatActivity {

    private static final String tag = "MyDetailActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Log.d(tag, "ini event onCreate()!!! ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(tag, "ini event onPause()!!! ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(tag, "ini event onStop()!!! ");
//        System.exit(0);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
    }
}
