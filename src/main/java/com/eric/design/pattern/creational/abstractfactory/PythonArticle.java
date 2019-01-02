package com.eric.design.pattern.creational.abstractfactory;

public class PythonArticle extends Article {
    @Override
    public void produceArticle() {
        System.out.println("编写python手记！");
    }
}
