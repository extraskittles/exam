package designPattern.factoryPattern.simpleFacotry;

import designPattern.factoryPattern.simpleFacotry.pojo.Shape;

public class Main {
    public static void main(String[] args) {
        Shape circle = ShapeFactory.getShape("circle");
        System.out.println(circle.draw());
    }
}
