package chainPattern;

public class Main {
    public static void main(String[] args) {
        AbstractHandler chainHandler = ChainHandler.getChainHandler();
        chainHandler.handle(AbstractHandler.BOSS);
    }
}
