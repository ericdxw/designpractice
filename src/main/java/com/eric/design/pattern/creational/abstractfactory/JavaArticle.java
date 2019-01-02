package com.eric.design.pattern.creational.abstractfactory;

public class JavaArticle extends Article {
    @Override
    public void produceArticle() {
        System.out.println("编写java手记");
    }
}
