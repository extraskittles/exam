package ObserverPattern;

public abstract class AbstractObserver {
    protected Matter matter;
    public AbstractObserver(Matter matter){
        this.matter=matter;
        matter.addObserver(this);
    }
    public abstract void update();
}
