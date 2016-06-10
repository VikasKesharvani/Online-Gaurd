package com.eighteentechnology.onlinegaurd.activity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.eighteentechnology.onlinegaurd.R;
import com.eighteentechnology.onlinegaurd.util.Redirections;

public class VisitorActivity extends AppCompatActivity implements View.OnClickListener {
private Button mButtonSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vistor);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        findIdSetListner();

    }

    private void findIdSetListner() {
        mButtonSubmit=(Button)findViewById(R.id.button_submit_vistor_activity);
        mButtonSubmit.setOnClickListener(this);
    }

    private void opendialuge(){
        final Dialog dialog = new Dialog(this, R.style.DialogSlideAnim);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.getWindow().setBackgroundDrawable(
                new ColorDrawable(
                        android.graphics.Color.TRANSPARENT));
        dialog.setContentView(R.layout.visitor_chekin_dialogue);
        WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
        lp.copyFrom(dialog.getWindow().getAttributes());
        lp.width = WindowManager.LayoutParams.MATCH_PARENT;
        lp.height = WindowManager.LayoutParams.MATCH_PARENT;
        lp.dimAmount = 0.8f;
        Button btn=(Button) dialog.findViewById(R.id.button_check_in);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //startActivity(new Intent(VisitorActivity.this,VisitorDetailActivity.class));
                Redirections.redirectToVisitorDetail(VisitorActivity.this);
                finish();
            }
        });
        dialog.show();
        dialog.getWindow().setAttributes(lp);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button_submit_vistor_activity:
                opendialuge();
                break;
            default:
                break;
        }
    }
}
