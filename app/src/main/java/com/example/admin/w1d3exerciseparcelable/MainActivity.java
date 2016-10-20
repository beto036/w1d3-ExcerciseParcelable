package com.example.admin.w1d3exerciseparcelable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    public static final String MY_KEY = "users";
    private ArrayList<User> users;
    private User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        users = new ArrayList<User>();
    }

    public void createUser(View view) {
        EditText editText = (EditText) findViewById(R.id.editTextMain);
        user = new User(editText.getText().toString());
        users.add(user);
        Toast.makeText(this,"You added " + user.getName() + " Total Users: " + users.size(),Toast.LENGTH_LONG).show();
    }

    public void showUsers(View view) {
        Intent intent = new Intent(this, ResultActivity.class);
        intent.putParcelableArrayListExtra(MY_KEY,users);
        startActivity(intent);
    }
}
