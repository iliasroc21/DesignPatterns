package structural.decorator;

import structural.decorator.decorators.FacebookNotifier;
import structural.decorator.decorators.SMSNotifier;
import structural.decorator.decorators.SlackNotifier;
import structural.decorator.notifier.EmailNotifier;
import structural.decorator.notifier.Notifier;

public class Main {
    public static void main(String[] args) {
        Notifier notifier = new EmailNotifier();
        notifier.send("Hello!");

        System.out.println("--------------Email + SMS notification---------------------");

        Notifier smsNotifier = new SMSNotifier(new EmailNotifier());
        smsNotifier.send("Hello!");

        // Email + Facebook notification
        System.out.println("--------------Email + Facebook notification---------------------");

        Notifier facebookNotifier = new FacebookNotifier(new EmailNotifier());
        facebookNotifier.send("Hello!");

        // Email + Slack notification
        System.out.println("--------------Email + Slack notification---------------------");
        Notifier slackNotifier = new SlackNotifier(new EmailNotifier());
        slackNotifier.send("Hello!");

        // Email + SMS + Facebook + Slack notification
        System.out.println("--------------Email + SMS + Facebook + Slack notification---------------------");

        Notifier allNotifier = new FacebookNotifier(
           new SMSNotifier(slackNotifier)
        );
        allNotifier.send("Hello!");
    }
}
