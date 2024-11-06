package behavioral.mediator.component;

import behavioral.mediator.mediator.Mediator;

public class Textbox extends Component{
    private String text;
    private boolean visible ;
    public Textbox(Mediator mediator) {
        super(mediator);
        this.text="";
        this.visible=true;
    }
    public void setText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setVisible(boolean visible  , String name) {
        this.visible = visible;
        System.out.println(name + " visibility: " + visible);
    }
}
