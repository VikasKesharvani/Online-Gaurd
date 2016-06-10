package com.eighteentechnology.onlinegaurd.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.eighteentechnology.onlinegaurd.R;
import com.eighteentechnology.onlinegaurd.util.Redirections;


public class LoginActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButtomLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        findIdSetListners();


    }

    private void findIdSetListners() {
        mButtomLogin=(Button)findViewById(R.id.login_button);
        mButtomLogin.setOnClickListener(this);
    }



    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.login_button:
               // startActivity(new Intent(this, VisitorActivity.class));
                Redirections.redirectToVisitorFormActivity(this);
                finish();
                break;
            default:
                break;
        }

    }
}
