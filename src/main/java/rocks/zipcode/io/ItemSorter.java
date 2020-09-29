package rocks.zipcode.io;

import java.util.*;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    private Item[] item;
    public ItemSorter(Item[] items) {
        this.item=items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(item,comparator);
        return item;
    }
}
