package com.space.loginmodule;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.space.commonmodule.base.BaseActivity;
import com.space.commonmodule.utils.ToastUtil;

/**
 * Created by licht on 2019/12/5.
 */
@Route(path = "/login/loginactivity")
public class LoginActivity extends BaseActivity implements LoginContract.LoginView{

    private EditText mEtUser;
    private EditText mEtPassword;
    private Button mBtnLogin;
    private LoginPresenter mPresenter;

    @Override
    protected int getLayOutID() {
        return R.layout.activity_login;
    }

    @Override
    protected void initView() {
        mEtUser = findViewById(R.id.et_user);
        mEtPassword = findViewById(R.id.et_password);
        mBtnLogin = findViewById(R.id.btn_login);
    }

    @Override
    protected void initData() {
        mPresenter = new LoginPresenter(this);
    }

    @Override
    protected void initListener() {
        mBtnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.login();
            }
        });
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public String  getUserText() {
        return mEtUser.getText().toString().trim();
    }

    @Override
    public String getPasswordText() {
        return mEtPassword.getText().toString().trim();
    }

    @Override
    public void onLoginSuccess() {
        finish();
    }

    @Override
    public void onLoginFailure(String text) {
        ToastUtil.showTip(this,text);
    }
}
