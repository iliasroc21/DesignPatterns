package behavioral.mediator.component;

import behavioral.mediator.mediator.Mediator;

public class Checkbox extends Component{
    private boolean checked;
    public Checkbox(Mediator mediator) {
        super(mediator);
    }

    public void toggle() {
        checked = !checked;
        mediator.notifyComponent(this, "check");
    }

    public boolean isChecked() {
        return checked;
    }
}
