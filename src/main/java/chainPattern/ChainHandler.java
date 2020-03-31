package chainPattern;

public class ChainHandler {
    public static AbstractHandler getChainHandler(){
        AbstractHandler leaderHandler=new LeaderHandler(AbstractHandler.LEADER);
        AbstractHandler managerHandler=new ManagerHandler(AbstractHandler.MANAGER);
        AbstractHandler bossHandler=new BossHandler(AbstractHandler.BOSS);
        leaderHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(bossHandler);
        return leaderHandler;
    }
}
