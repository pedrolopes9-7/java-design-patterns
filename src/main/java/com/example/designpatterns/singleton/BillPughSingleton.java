package com.example.designpatterns.singleton;

public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static final class InstanceHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {

        return InstanceHolder.instance;
    }
}
