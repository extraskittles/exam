package designPattern.ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Matter matter = new Matter();
        AbstractObserver binaryObserver = new BinaryObserver(matter);
        AbstractObserver octalObserver = new OctalObserver(matter);
        matter.setProperty(2);
        System.out.println("-----");
        matter.setProperty(9);
    }
}
