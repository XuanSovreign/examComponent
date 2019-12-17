package com.space.libraryone;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.space.commonmodule.utils.ToastUtil;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by licht on 2019/4/22.
 */

@Route(path = "/test2/threeactivity")
public class ThreeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_three);
        List<UserMessage> userMessages=new ArrayList<>();
        Field[] fields =TestInsert.class.getDeclaredFields();
        for (Field field:fields) {
            UserMessage userMessage = InsertUtil.requreMessage(field);
            userMessages.add(userMessage);
        }
        if (!userMessages.isEmpty()) {
            ToastUtil.showTip(this,"=========="+userMessages.size());
        }
    }
}
