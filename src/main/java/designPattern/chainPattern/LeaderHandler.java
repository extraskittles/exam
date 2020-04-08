package designPattern.chainPattern;

public class LeaderHandler extends AbstractHandler{
    public LeaderHandler(int level){
        super(level);
    }
    public void approve() {
        System.out.println("组长批准了");
    }
}
