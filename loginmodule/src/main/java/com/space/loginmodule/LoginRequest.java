package com.space.loginmodule;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by licht on 2019/12/9.
 */

public interface LoginRequest {
    @POST("/login")
    Call<LoginInfoBean> getUserInfo(@Body UserInfo userInfo);
}
