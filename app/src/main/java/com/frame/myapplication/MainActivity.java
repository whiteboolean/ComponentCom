package com.frame.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //同步调用，直接返回结果
                CCResult result = CC.obtainBuilder("com.frame.library.component.ComponentA")
                        .setActionName("ActivityA")
                        .setTimeout(3000)
                        .build()
                        .call();


            }
        });
    }
}