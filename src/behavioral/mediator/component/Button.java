package behavioral.mediator.component;

import behavioral.mediator.mediator.Mediator;

public class Button extends Component{

    public Button(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void click() {
        mediator.notifyComponent(this, "click");
    }}
