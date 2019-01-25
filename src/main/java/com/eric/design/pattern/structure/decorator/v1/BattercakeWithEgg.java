package com.eric.design.pattern.structure.decorator.v1;

public class BattercakeWithEgg extends Battercake{
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加个蛋";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}
