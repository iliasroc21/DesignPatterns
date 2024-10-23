package behavioral.state.status;

import behavioral.state.context.Package;

public interface PackageState {
    void next(Package pkg);
    void prev(Package pkg);
    void printStatus();
}
