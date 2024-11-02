package behavioral.command.invoker;

import behavioral.command.actions.Command;

public class Button {
    private Command command;
    public Button(Command command){
        this.command =command;
    }
    public void click(){
        command.execute();
    }
}
