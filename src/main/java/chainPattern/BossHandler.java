package chainPattern;

public class BossHandler extends AbstractHandler{
    public BossHandler(int level){
        super(level);
    }
    public void approve() {
        System.out.println("老板批准了");
    }
}
