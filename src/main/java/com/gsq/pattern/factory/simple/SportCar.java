package com.gsq.pattern.factory.simple;

/**
 * 简单工厂模式
 */
class SportCar implements Car {

    public void getCar() {
        System.out.println("获取了一辆 SportCar。");
    }
}
