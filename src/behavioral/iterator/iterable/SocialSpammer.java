package behavioral.iterator.iterable;

import behavioral.iterator.iterator.ProfileIterator;
import behavioral.iterator.model.Profile;

public class SocialSpammer {
    public void sendSpam(ProfileIterator iterator, String message) {
        while (iterator.hasMore()) {
            Profile profile = iterator.getNext();
            System.out.println("Sending '" + message + "' to " + profile.getEmail());
        }
    }
}
