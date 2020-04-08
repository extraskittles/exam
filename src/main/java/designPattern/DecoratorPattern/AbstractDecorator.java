package designPattern.DecoratorPattern;

public abstract class AbstractDecorator implements Shape{
    protected Shape decoratedShape;
    public AbstractDecorator(Shape decoratedShape){
        this.decoratedShape=decoratedShape;
    }
}
