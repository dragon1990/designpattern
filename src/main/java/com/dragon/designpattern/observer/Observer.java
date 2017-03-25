package com.dragon.designpattern.observer;

/**
 * Created by dragon1990 on 17-3-25.
 */
public interface Observer {

    /**
     * 更新状态
     * @param tempature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    void update(Double tempature, Double humidity, Double pressure);

}
