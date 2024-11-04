package behavioral.iterator.iterator;

import behavioral.iterator.iterable.Facebook;
import behavioral.iterator.model.Profile;

import java.util.Iterator;
import java.util.List;

public class FriendsIterator implements ProfileIterator{
    private String profileId;
    private List<Profile> profiles;
    private Iterator<Profile> iterator;
    public FriendsIterator(String profileId, Facebook facebook) {
        this.profileId = profileId;
        this.profiles = facebook.getProfiles();
        this.iterator = profiles.iterator();
    }
    @Override
    public boolean hasMore() {
        return iterator.hasNext();

    }

    @Override
    public Profile getNext() {
        while (iterator.hasNext()) {
            Profile profile = iterator.next();
            return profile;
        }
        return null;    }
}
