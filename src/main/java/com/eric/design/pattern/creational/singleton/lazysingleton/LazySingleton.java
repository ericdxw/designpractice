package com.eric.design.pattern.creational.singleton.lazysingleton;

import sun.security.jca.GetInstance;

public class LazySingleton{
    private static LazySingleton lazySingleton;
    private LazySingleton(){
        super();
    }
    public static synchronized LazySingleton getInstance(){
        if(lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
