package behavioral.mediator.component;

import behavioral.mediator.mediator.Mediator;

public abstract class Component {
    protected Mediator mediator;
    public Component(Mediator mediator){
        this.mediator = mediator ;
    }
    public void click() {
        mediator.notifyComponent(this, "click");
    }
}
