package com.space.commonmodule.utils;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by licht on 2019/12/10.
 */

public class ToastUtil {

    public static void showTip(Context context, String text) {
        Toast.makeText(context,text,Toast.LENGTH_SHORT).show();
    }
}
