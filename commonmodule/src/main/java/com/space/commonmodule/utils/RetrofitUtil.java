package com.space.commonmodule.utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by licht on 2019/12/9.
 */

public class RetrofitUtil {
    private static Retrofit mRetrofit;
    public static Retrofit getInstance() {
        if (mRetrofit == null) {
            synchronized (RetrofitUtil.class) {
                if (mRetrofit == null) {
                    mRetrofit=new Retrofit.Builder().baseUrl("").addConverterFactory(GsonConverterFactory.create()).build();
                }
            }
        }
        return mRetrofit;
    }
}
