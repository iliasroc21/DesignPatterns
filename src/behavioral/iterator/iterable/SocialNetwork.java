package behavioral.iterator.iterable;

import behavioral.iterator.iterator.ProfileIterator;

public interface SocialNetwork {
    ProfileIterator createFriendsIterator(String profileId);
    ProfileIterator createCoworkersIterator(String profileId);
}
