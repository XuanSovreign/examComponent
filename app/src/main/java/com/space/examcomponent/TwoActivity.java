package com.space.examcomponent;


import com.alibaba.android.arouter.facade.annotation.Route;
import com.space.commonmodule.base.BaseActivity;

/**
 * Created by licht on 2019/4/22.
 */

@Route(path = "/test/twoactivity")
public class TwoActivity extends BaseActivity {

    @Override
    protected int getLayOutID() {
        return R.layout.activity_two;
    }

    @Override
    protected void initView() {

    }

    @Override
    protected void initData() {

    }

    @Override
    protected void initListener() {

    }
}
