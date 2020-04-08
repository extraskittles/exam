package designPattern.CommandPattern;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock();
        Command buyCommand=new BuyCommand(stock);
        Command sellCommand=new SellCommand(stock);
        CommandDispatcher commandDispatcher = new CommandDispatcher();
        commandDispatcher.addCommand(buyCommand);
        commandDispatcher.addCommand(sellCommand);
        commandDispatcher.executeAll();
    }
}
