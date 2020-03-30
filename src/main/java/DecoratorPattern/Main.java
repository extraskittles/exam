package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle();
        RedDecorator redCircle = new RedDecorator(circle);
        RedDecorator redSquare = new RedDecorator(new Square());
        circle.draw();
        System.out.println("--");
        redCircle.draw();
        System.out.println("--");
        redSquare.draw();
    }
}
