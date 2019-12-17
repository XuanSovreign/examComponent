package com.space.loginmodule;

import com.alibaba.android.arouter.utils.TextUtils;
import com.space.commonmodule.utils.ToastUtil;

/**
 * Created by licht on 2019/12/10.
 */

public class LoginPresenter implements LoginContract.LoginPresenter {
    private LoginContract.LoginModel mModel;
    private LoginContract.LoginView mView;

    public LoginPresenter(LoginContract.LoginView view) {
        mModel = new LoginModel();
        mView = view;
    }

    @Override
    public void login() {
        String userText = mView.getUserText();
        String passwordText = mView.getPasswordText();
        if (TextUtils.isEmpty(userText) || TextUtils.isEmpty(passwordText)) {
            ToastUtil.showTip(mView.getContext(),"账号或者密码不能为空");
            return;
        }
        mModel.setLoginData(userText, passwordText, new LoginCallback() {
            @Override
            public void onSuccess() {
                mView.onLoginSuccess();
            }

            @Override
            public void onFailure(String text) {
                mView.onLoginFailure(text);
            }
        });
    }
}
