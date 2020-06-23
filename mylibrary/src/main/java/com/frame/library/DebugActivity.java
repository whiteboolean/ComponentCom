package com.frame.library;

import android.os.Bundle;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class DebugActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this, "hello CC", Toast.LENGTH_SHORT).show();
        //需要单独安装运行，但不需要入口页面（只需要从主app中调用此组件）时，
        // 可直接finish当前activity
        finish();
    }
}