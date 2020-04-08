package designPattern.chainPattern;

public class ManagerHandler extends AbstractHandler {
    public ManagerHandler(int level){
        super(level);
    }
    public void approve() {
        System.out.println("经理批准了");
    }
}
