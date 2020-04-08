package designPattern.CommandPattern;

public class BuyCommand implements Command{
    private Stock stock;
    public BuyCommand(Stock stock){
        this.stock=stock;
    }
    public void execute() {
        stock.buyItem();
    }
}
