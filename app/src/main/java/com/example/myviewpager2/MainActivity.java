package com.example.myviewpager2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private ViewPager2 viewPager2;
    private ViewPageAdapter viewPageAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //元件綁定
        viewPager2 = findViewById(R.id.viewPage2);
        //設定ViewPage的Adapter
        viewPageAdapter = new ViewPageAdapter(this);
        viewPager2.setAdapter(viewPageAdapter);
    }
}