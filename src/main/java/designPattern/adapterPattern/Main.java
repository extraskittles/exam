package designPattern.adapterPattern;

public class Main {
    public static void main(String[] args) {
        Aorder aorderAdatper = new AorderAdapter(new GroudBuy());
        aorderAdatper.dealWithOrder();
    }
}
