package com.eric.design.pattern.structure.decorator.v1;

public class BattercakeWithEggSausage extends  BattercakeWithEgg{
    @Override
    protected String getDesc() {
        return super.getDesc()+" 加香肠";
    }

    @Override
    protected int cost() {
        return super.cost()+2;
    }
}
