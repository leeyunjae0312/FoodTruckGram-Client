package org.androidtown.foodtruckgram.Activity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Message;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.androidtown.foodtruckgram.R;

public class LoadingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            getSupportActionBar().setDisplayOptions(ActionBar.DISPLAY_SHOW_CUSTOM);
            getSupportActionBar().setCustomView(R.layout.custom_action_bar);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        setContentView(R.layout.activity_loading);

        Handler handler = new Handler(){
            @Override
            public void handleMessage(Message msg){
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent);
                finish();
            }
        };

        handler.sendEmptyMessageDelayed(0,1000);

    }

}
