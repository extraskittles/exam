package designPattern.DecoratorPattern;

public class RedDecorator extends AbstractDecorator{
    public RedDecorator(Shape decoratedShape){
        super(decoratedShape);
    }

    public void draw() {
        decoratedShape.draw();
        System.out.println("颜色:红色");
    }
}
