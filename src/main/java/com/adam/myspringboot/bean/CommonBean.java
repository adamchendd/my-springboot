package com.adam.myspringboot.bean;

public class CommonBean implements BeanInterface {

    @Override
    public void hello(String name) {
        System.out.println("hello" + name);
    }
}
