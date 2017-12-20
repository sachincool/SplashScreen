package com.example.root.splashscreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
LinearLayout l1,l2;
Button btn;
Animation uptodown,downtoup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    l1=findViewById(R.id.l1);
    l2=findViewById(R.id.l2);
    btn=findViewById(R.id.btn);
    uptodown= AnimationUtils.loadAnimation(this,R.anim.uptodown);
    downtoup=AnimationUtils.loadAnimation(this,R.anim.downtoup);
    l2.setAnimation(downtoup);
    l1.setAnimation(uptodown);
    }
}
