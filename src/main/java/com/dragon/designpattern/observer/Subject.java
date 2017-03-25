package com.dragon.designpattern.observer;

/**
 * Created by dragon1990 on 17-3-25.
 */
public interface Subject {
    /**
     * 添加观察者
     * @param observer 观察者
     */
    void addObserver(Observer observer);

    /**
     * 删除观察者
     * @param observer 观察者
     */
    void removeObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    void notifyObservers();
}
