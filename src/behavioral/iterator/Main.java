package behavioral.iterator;

import behavioral.iterator.iterable.Facebook;
import behavioral.iterator.iterable.SocialNetwork;
import behavioral.iterator.iterable.SocialSpammer;
import behavioral.iterator.iterator.ProfileIterator;

public class Main {
    public static void main(String[] args) {
        SocialNetwork facebook = new Facebook();
        SocialSpammer spammer = new SocialSpammer();

        ProfileIterator friendsIterator = facebook.createFriendsIterator("1");
        spammer.sendSpam(friendsIterator, "Hello friend!");

        ProfileIterator coworkersIterator = facebook.createCoworkersIterator("1");
        spammer.sendSpam(coworkersIterator, "Hello coworker!");
    }
}
