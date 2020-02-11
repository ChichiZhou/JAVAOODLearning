package IterationAndCollections;

import java.util.Arrays;

public class DinerMenu {
    static final int MAX_ITEM = 6;
    int numberOffItems = 0;
    MenuItem[] menuItems;

    public DinerMenu(){
        menuItems = new MenuItem[MAX_ITEM];
        for(numberOffItems = 0; numberOffItems < MAX_ITEM; numberOffItems++){
            menuItems[numberOffItems] = new MenuItem("Ass", "Shilin's ass", 1.2);
        }
    }

    public DinerMenuIterator createIterator(){
        return new DinerMenuIterator(Arrays.asList(menuItems));
    }
}
