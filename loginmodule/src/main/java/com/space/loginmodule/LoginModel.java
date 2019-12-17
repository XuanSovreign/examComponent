package com.space.loginmodule;

import com.space.commonmodule.utils.RetrofitUtil;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

/**
 * Created by licht on 2019/12/9.
 */

public class LoginModel implements LoginContract.LoginModel {

    @Override
    public void setLoginData(String userName, String password,final LoginCallback callback) {
//        UserInfo userInfo = new UserInfo();
//        userInfo.userName=userName;
//        userInfo.password=password;
//        Retrofit instance = RetrofitUtil.getInstance();
//        LoginRequest loginRequest = instance.create(LoginRequest.class);
//        Call<LoginInfoBean> call = loginRequest.getUserInfo(userInfo);
//        call.enqueue(new Callback<LoginInfoBean>() {
//            @Override
//            public void onResponse(Call<LoginInfoBean> call, Response<LoginInfoBean> response) {
//                callback.onSuccess();
//            }
//
//            @Override
//            public void onFailure(Call<LoginInfoBean> call, Throwable t) {
//                callback.onFailure(t.getMessage());
//            }
//        });
        if ("adimin".equals(userName) && "123456".equals(password)) {
            callback.onSuccess();
        } else {
            callback.onFailure("账号不存在或者密码错误");
        }

    }
}
