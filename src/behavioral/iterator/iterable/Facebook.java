package behavioral.iterator.iterable;

import behavioral.iterator.iterator.CoworkersIterator;
import behavioral.iterator.iterator.FriendsIterator;
import behavioral.iterator.iterator.ProfileIterator;
import behavioral.iterator.model.Profile;

import java.util.ArrayList;
import java.util.List;

public class Facebook implements SocialNetwork {
    private final List<Profile> profiles = new ArrayList<>();

    public Facebook() {
        profiles.add(new Profile("1", "john@example.com"));
        profiles.add(new Profile("2", "jane@example.com"));
        profiles.add(new Profile("3", "dave@example.com"));
    }
    @Override
    public ProfileIterator createFriendsIterator(String profileId) {
        return new FriendsIterator(profileId , this);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileId) {
        return  new CoworkersIterator(profileId, this);
    }

    public List<Profile> getProfiles() {
        return profiles;
    }
}
