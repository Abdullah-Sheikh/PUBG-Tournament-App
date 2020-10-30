package com.comptech.login.pubgtournament;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class signin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);
    }
    public void goto_signin (View view)
    {
        startActivity(  new Intent(signin.this, Signup.class));
    }
    public void goto_home (View view)
    {
        startActivity(  new Intent(signin.this, Home.class));
    }
}
