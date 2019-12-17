package com.space.commonmodule.utils;

import com.alibaba.android.arouter.launcher.ARouter;

/**
 * Created by licht on 2019/12/6.
 */

public class ARouterUtil {
    public static void navigatePage(String url) {
        ARouter.getInstance().build(url).navigation();
    }
}
