package designPattern.factoryPattern.simpleFacotry;

import designPattern.factoryPattern.simpleFacotry.pojo.Circle;
import designPattern.factoryPattern.simpleFacotry.pojo.Rectangle;
import designPattern.factoryPattern.simpleFacotry.pojo.Shape;
import designPattern.factoryPattern.simpleFacotry.pojo.Square;

public class ShapeFactory {
    public static Shape getShape(String shapeType){
        if(shapeType.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shapeType.equalsIgnoreCase("square")){
            return new Square();
        }else if(shapeType.equalsIgnoreCase("circle")){
            return new Circle();
        }else{
            return null;
        }
    }
}
