package com.eric.design.pattern.structure.adapter.classadapter;

public class ConcretTarget implements Target {
    @Override
    public void request() {
        System.out.println("concreteTarget目标方法");
    }
}
