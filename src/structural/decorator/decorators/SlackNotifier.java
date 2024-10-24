package structural.decorator.decorators;

import structural.decorator.notifier.Notifier;

public class SlackNotifier extends NotifierDecorator{
    public SlackNotifier(Notifier notifier) {
        super(notifier);
    }
    @Override
    public void send(String message) {
        super.send(message);
        sendSlackMessage(message);
    }

    private void sendSlackMessage(String message) {
        System.out.println("Sending Slack Message: " + message);
    }
}
