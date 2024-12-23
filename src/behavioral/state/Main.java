package behavioral.state;

import behavioral.state.context.Package;

public class Main {
    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
        pkg.previousState();
        pkg.printStatus();
    }
}
