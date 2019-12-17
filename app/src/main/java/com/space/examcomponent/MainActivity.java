package com.space.examcomponent;

import android.view.View;
import android.widget.Button;

import com.space.commonmodule.base.BaseActivity;
import com.space.commonmodule.utils.ARouterUtil;

public class MainActivity extends BaseActivity implements View.OnClickListener {


    private Button mBtn1;
    private Button mBtn2;
    private Button mBtn3;

    @Override
    protected int getLayOutID() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        mBtn1 = findViewById(R.id.btn1);
        mBtn2 = findViewById(R.id.btn2);
        mBtn3 = findViewById(R.id.btn3);
    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {
        mBtn1.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        mBtn3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn1:
                ARouterUtil.navigatePage("/test/twoactivity");
                break;
            case R.id.btn2:
                ARouterUtil.navigatePage("/test2/threeactivity");
                break;
            case R.id.btn3:
                ARouterUtil.navigatePage("/login/loginactivity");
                break;
        }
    }
}
