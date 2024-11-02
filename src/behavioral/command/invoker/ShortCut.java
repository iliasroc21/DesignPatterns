package behavioral.command.invoker;

import behavioral.command.actions.Command;

public class ShortCut {
    private Command command;
    public ShortCut(Command command){
        this.command = command;
    }
    public void press(){
        command.execute();
    }
}
