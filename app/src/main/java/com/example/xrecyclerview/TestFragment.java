package com.example.xrecyclerview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/7/18.
 */

public class TestFragment extends Fragment {

    public TestFragment() {
    }

    private TextView text;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view = inflater.inflate(R.layout.item, container, false);


        text = (TextView) view.findViewById(R.id.text);

        text.setText("zheshi 11111111111111");

        Log.e("testFratment","1111111111111");


        return view;
    }
    @Override
    public void onResume() {

        text.setText("zheshi 11111111111的倍数");

        Log.e("testFratment","11111111111111的倍数");
        super.onResume();
    }


}
