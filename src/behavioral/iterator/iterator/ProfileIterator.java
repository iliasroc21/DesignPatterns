package behavioral.iterator.iterator;

import behavioral.iterator.model.Profile;

public interface ProfileIterator {
    boolean hasMore();
    Profile getNext();
}
