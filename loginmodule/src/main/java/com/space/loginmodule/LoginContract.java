package com.space.loginmodule;

import android.content.Context;

/**
 * Created by licht on 2019/12/9.
 */

public interface LoginContract {
    interface LoginView {
        Context getContext();
        String  getUserText();
        String getPasswordText();
        void onLoginSuccess();
        void onLoginFailure(String text);
    }
    interface LoginModel{
        void setLoginData(String userName, String password,LoginCallback callback);
    }
    interface LoginPresenter{
        void login();
    }
}
