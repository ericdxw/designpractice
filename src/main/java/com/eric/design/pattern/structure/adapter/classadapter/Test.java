package com.eric.design.pattern.structure.adapter.classadapter;

public class Test {
    public static void main(String[] args) {
        Target target = new ConcretTarget();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();
    }
}
