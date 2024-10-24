package structural.decorator.decorators;

import structural.decorator.notifier.Notifier;

public abstract class NotifierDecorator implements Notifier {
    protected Notifier unwrapperdNotifier;
    public NotifierDecorator(Notifier notifier){
        this.unwrapperdNotifier= notifier;
    }
    @Override
    public void send(String message) {
        unwrapperdNotifier.send(message);
    }
}
