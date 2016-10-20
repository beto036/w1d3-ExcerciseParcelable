package com.example.admin.w1d3exerciseparcelable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Iterator;

public class ResultActivity extends AppCompatActivity {

    private static final String TAG = "TAG_";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        ArrayList<User> users = getIntent().getParcelableArrayListExtra(MainActivity.MY_KEY);
        Iterator<User> userIterator = users.iterator();
        Log.d(TAG, "Users");
        while (userIterator.hasNext()){
            Log.d(TAG, userIterator.next().toString());
        }
    }
}
