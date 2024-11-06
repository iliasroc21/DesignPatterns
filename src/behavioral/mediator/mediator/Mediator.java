package behavioral.mediator.mediator;

import behavioral.mediator.component.Component;

public interface Mediator {
    void notifyComponent(Component component , String event);
}
