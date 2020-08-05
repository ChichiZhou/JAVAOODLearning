package HeadFirst.IterationAndCollections;

import lombok.NonNull;
import lombok.RequiredArgsConstructor;

import java.util.*;

@RequiredArgsConstructor
public class DinerMenuIterator<T> implements MenuIterator {
    @NonNull List<T> list;
    private int pos = 0;

    public boolean hasNext() {
        return pos!=list.size() && list.get(pos) != null;
    }

    public MenuItem next() {
        Object[] elementData = list.toArray();

        if (pos > elementData.length)
            throw new ConcurrentModificationException();
        MenuItem nextMenuItem = (MenuItem)elementData[pos];
        pos += 1;
        return nextMenuItem;
    }

    public void remove() {

    }
}
