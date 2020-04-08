package designPattern.ObserverPattern;

public class OctalObserver extends AbstractObserver{
    public OctalObserver(Matter matter){
        super(matter);
    }
    public void update() {
        System.out.println("更新后的八进制参数是:"+Integer.toOctalString(matter.getProperty()));
    }
}
