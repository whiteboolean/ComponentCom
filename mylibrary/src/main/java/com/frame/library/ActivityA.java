package com.frame.library;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

import com.billy.cc.core.component.CC;
import com.billy.cc.core.component.CCResult;
import com.frame.myapplication.component.R;


public class ActivityA extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //同步调用，直接返回结果
                CCResult result = CC.obtainBuilder("lifecycleComponent")
                        .setActionName("MainActivity")
                        .setTimeout(3000)
                        .build()
                        .call();
            }
        });
    }
}
