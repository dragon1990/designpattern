package com.dragon.designpattern.chap01;

/**
 * Created by dragon1990 on 17-3-25.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
