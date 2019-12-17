package com.space.libraryone;

import android.util.Log;

import java.lang.reflect.Field;

/**
 * Created by licht on 2019/12/12.
 */

public class InsertUtil {
    public static UserMessage requreMessage(Field field) {
        UserMessage userMessage = new UserMessage();
        if (field.isAnnotationPresent(MyTest.class)) {
            MyTest annotation = field.getAnnotation(MyTest.class);
            userMessage.name = annotation.userName();
            userMessage.age = annotation.age();
            userMessage.sex = annotation.sex();
        }
        Log.e("=====", "requreMessage: " + field.getName());
        return userMessage;
    }
}
