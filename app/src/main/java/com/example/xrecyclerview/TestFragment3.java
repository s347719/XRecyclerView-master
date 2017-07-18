package com.example.xrecyclerview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/18.
 */

public class TestFragment3 extends Fragment {

    public TestFragment3() {
    }

    private TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view =  inflater.inflate(R.layout.item3, container, false);
        text = (TextView) view.findViewById(R.id.text);

        text.setText("zheshi 33333333333");

        Log.e("testFratment3","333333333");
        return  view;
    }

    @Override
    public void onResume() {

        text.setText("zheshi 1333333333333的倍数");

        Log.e("testFratment3","3333333333333333333d的倍数");
        super.onResume();
    }

}
