package designPattern.CommandPattern;

import java.util.ArrayList;
import java.util.List;

public class CommandDispatcher {
    List<Command> commands=new ArrayList<Command>();
    public void addCommand(Command command){
        commands.add(command);
    }
    public void executeAll(){
        for(Command command:commands){
            command.execute();
        }
    }
}
