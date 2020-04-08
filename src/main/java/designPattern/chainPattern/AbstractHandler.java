package designPattern.chainPattern;

public abstract class AbstractHandler {
    public static final int LEADER=3;
    public static final int MANAGER=2;
    public static final int BOSS=1;
    private int level;
    private AbstractHandler nextHandler;
    public AbstractHandler(int level){
        this.level=level;
    }

    public void setNextHandler(AbstractHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
    public void handle(int level){
        if(this.level<=level){
            approve();
        }
        if(nextHandler!=null){
            nextHandler.handle(level);
        }
    }
    public abstract void approve();
}
