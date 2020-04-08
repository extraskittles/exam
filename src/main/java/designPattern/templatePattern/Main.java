package designPattern.templatePattern;

public class Main {
    public static void main(String[] args) {
        Game footBall = new FootBall();
        Game basketBall = new BasketBall();
        footBall.play();
        footBall.play();
    }
}
