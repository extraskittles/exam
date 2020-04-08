package designPattern.CommandPattern;

public class SellCommand implements Command{
    private Stock stock;
    public SellCommand(Stock stock){
        this.stock=stock;
    }
    public void execute() {
        stock.sellItem();
    }
}
