package designPattern.templatePattern;

public abstract class Game {
    abstract void init();
    abstract void start();
    public void play(){
        init();
        start();
    }
}
