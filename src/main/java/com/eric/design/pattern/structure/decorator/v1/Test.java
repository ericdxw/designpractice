package com.eric.design.pattern.structure.decorator.v1;

public class Test {
    public static void main(String[] args) {
        Battercake battercake = new BattercakeWithEgg();
        System.out.println("买了"+battercake.getDesc()+"花了"+battercake.cost());
        battercake = new BattercakeWithEggSausage();
        System.out.println("买了"+battercake.getDesc()+"花了"+battercake.cost());
    }
}
