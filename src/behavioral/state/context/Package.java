package behavioral.state.context;

import behavioral.state.status.OrderedState;
import behavioral.state.status.PackageState;


public class Package {
    private PackageState state = new OrderedState();

    public void previousState(){
        state.prev(this);
    }
    public void nextState(){
        state.next(this);
    }
    public void printStatus(){
        state.printStatus();
    }
    public PackageState getState() {
        return state;
    }

    public void setState(PackageState state) {
        this.state = state;
    }
}
