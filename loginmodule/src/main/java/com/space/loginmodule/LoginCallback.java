package com.space.loginmodule;

/**
 * Created by licht on 2019/12/10.
 */

public interface LoginCallback {
    void onSuccess();

    void onFailure(String text);
}
