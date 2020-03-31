package ObserverPattern;

public class BinaryObserver extends AbstractObserver{
    public BinaryObserver(Matter matter){
        super(matter);
    }
    public void update() {
        System.out.println("更新后的二进制参数是:"+Integer.toBinaryString(matter.getProperty()));
    }
}
