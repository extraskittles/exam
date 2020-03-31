package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Matter {
    private List<AbstractObserver> observers=new ArrayList<AbstractObserver>();
    private int property;

    public int getProperty() {
        return property;
    }

    public void setProperty(int property) {
        this.property = property;
        notifyObservers();
    }
    public void addObserver(AbstractObserver observer){
        observers.add(observer);
    }
    public void notifyObservers(){
        for(AbstractObserver observer:observers){
            observer.update();
        }
    }
}
