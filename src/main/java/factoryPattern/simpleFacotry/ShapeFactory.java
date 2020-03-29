package factoryPattern.simpleFacotry;

import factoryPattern.simpleFacotry.pojo.Circle;
import factoryPattern.simpleFacotry.pojo.Rectangle;
import factoryPattern.simpleFacotry.pojo.Shape;
import factoryPattern.simpleFacotry.pojo.Square;

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
