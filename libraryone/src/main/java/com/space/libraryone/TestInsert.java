package com.space.libraryone;

/**
 * Created by licht on 2019/12/12.
 */

public class TestInsert {
    @MyTest(userName = "小明", age = 12, sex = "male")
    private UserMessage userOne;
    @MyTest(userName = "小红", age = 11, sex = "female")
    private UserMessage userTwo;
    @MyTest(userName = "小龙", age = 14, sex = "male")
    private UserMessage userThree;

    public UserMessage getUserOne() {
        return userOne;
    }

    public void setUserOne(UserMessage userOne) {
        this.userOne = userOne;
    }

    public UserMessage getUserTwo() {
        return userTwo;
    }

    public void setUserTwo(UserMessage userTwo) {
        this.userTwo = userTwo;
    }

    public UserMessage getUserThree() {
        return userThree;
    }

    public void setUserThree(UserMessage userThree) {
        this.userThree = userThree;
    }
}
