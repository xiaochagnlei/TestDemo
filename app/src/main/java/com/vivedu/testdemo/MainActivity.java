package com.vivedu.testdemo;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.vivedu.networkutil.NetworkUtil;

import java.util.HashSet;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /*new Thread(){
            @Override
            public void run() {
                while(true){
                    long bytes = NetworkUtil.getBytes(MainActivity.this);
                    Log.i("MainActivity", "bytes = " + bytes);
                }
            }
        }.start();
        String path = "http://192.168.4.171/vivedu_focus__.apk";
        new NetUtil().httpDown(path);*/
        HashSet<String> set = new HashSet<>();
        set.add("1");
        set.add("2");
        set.add("3");
        set.add("4");
        set.hashCode();
        Collections.map.put("test", set);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        }, 2000);
    }


}
