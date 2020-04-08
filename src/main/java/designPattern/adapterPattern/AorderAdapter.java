package designPattern.adapterPattern;

public class AorderAdapter implements Aorder{
    private Border border;
    public AorderAdapter(Border border){
        this.border=border;
    }
    public void dealWithOrder() {
        border.handlerOrder();
    }
}
