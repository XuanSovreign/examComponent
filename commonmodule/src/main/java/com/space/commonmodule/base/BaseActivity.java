package com.space.commonmodule.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;

/**
 * Created by licht on 2019/4/22.
 */

public abstract class BaseActivity extends FragmentActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayOutID());
        initView();
        initData();
        initListener();
    }

    protected abstract int getLayOutID();

    protected abstract void initView();

    protected abstract void initData();

    protected abstract void initListener();

}
