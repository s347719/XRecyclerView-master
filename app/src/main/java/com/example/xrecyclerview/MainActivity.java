package com.example.xrecyclerview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.IdRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.widget.RadioGroup;

public class MainActivity extends FragmentActivity implements RadioGroup.OnCheckedChangeListener {

    private FragmentTransaction fragmentTransaction;
    private TestFragment testFragment;
    private TestFragment2 testFragment2;
    private TestFragment3 testFragment3;
    private FragmentManager supportFragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         testFragment = new TestFragment();
         testFragment2 = new TestFragment2();
         testFragment3 = new TestFragment3();
        supportFragmentManager = getSupportFragmentManager();
        fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.conta,testFragment,"0").add(R.id.conta,testFragment2,"2").add(R.id.conta,testFragment3,"3").commit();
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radio);
        radioGroup.setOnCheckedChangeListener(this);
        radioGroup.check(R.id.radioButton);

    }
    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {

        switch (checkedId)
        {
            case R.id.radioButton:
                supportFragmentManager.beginTransaction().hide(testFragment3).hide(testFragment2).show(testFragment).commit();
                break;
            case R.id.radioButton2:
                supportFragmentManager.beginTransaction().hide(testFragment).hide(testFragment3).show(testFragment2).commit();
                break;
            case R.id.radioButton3:
                supportFragmentManager.beginTransaction().hide(testFragment).hide(testFragment2).show(testFragment3).commit();
                break;
        }

    }
    public void gotoLinearActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this,LinearActivity.class);
        startActivity(intent);
    }
    public void gotoGridActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this,GridActivity.class);
        startActivity(intent);
    }
    public void gotoStaggeredGridActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this,StaggeredGridActivity.class);
        startActivity(intent);
    }

    public void gotoEmptyViewActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this, EmptyViewActivity.class);
        startActivity(intent);
    }

    public void gotoCollapsingToolbarLayoutActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this, CollapsingToolbarLayoutActivity.class);
        startActivity(intent);
    }

    public void gotoDisableExampleActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this, DisableExampleActivity.class);
        startActivity(intent);
    }

    public void gotoMultiHeaderActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this, MultiHeaderActivity.class);
        startActivity(intent);
    }
    public void gotoItemDecorationActivity(View v) {
        Intent intent = new Intent();
        intent.setClass(this, ItemDecorationActivity.class);
        startActivity(intent);
    }



}
