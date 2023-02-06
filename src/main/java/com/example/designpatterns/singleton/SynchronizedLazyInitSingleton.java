package com.example.designpatterns.singleton;

public class SynchronizedLazyInitSingleton {

    private static SynchronizedLazyInitSingleton instance;

    private SynchronizedLazyInitSingleton() {
    }

    public static synchronized SynchronizedLazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new SynchronizedLazyInitSingleton();
        }

        return instance;
    }
}
