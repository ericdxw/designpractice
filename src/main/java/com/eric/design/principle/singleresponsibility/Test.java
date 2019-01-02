package com.eric.design.principle.singleresponsibility;

public class Test {
    public static void main(String[] args) {
//        Bird bird = new Bird();
//        bird.mainMoveMode("大雁");
//        bird.mainMoveMode("鸵鸟");
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMethod("大雁");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMethod("鸵鸟");
    }
}
