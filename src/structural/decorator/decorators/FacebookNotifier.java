package structural.decorator.decorators;

import structural.decorator.notifier.Notifier;

public class FacebookNotifier extends NotifierDecorator {

    public FacebookNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        sendFacebookMessage(message);
    }

    private void sendFacebookMessage(String message) {
        System.out.println("Sending Facebook Message: " + message);
    }
}
