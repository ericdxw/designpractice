package com.eric.design.pattern.structure.decorator.v2;

public abstract class AbstactDecorator extends ABattercake {
    private ABattercake aBattercake;

    public AbstactDecorator(ABattercake aBattercake){
        this.aBattercake = aBattercake;
    }

    protected abstract void doSomething();

    @Override
    protected String getDesc() {
        return this.aBattercake.getDesc();
    }

    @Override
    protected int cost() {
        return this.aBattercake.cost();
    }
}
