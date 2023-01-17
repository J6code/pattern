package iterator.demo1.service.impl;

import iterator.demo1.service.Iterator;

import java.util.ArrayList;

public class PancakeHouseMenuIterator implements Iterator {
    ArrayList items;
    int position = 0;

    public PancakeHouseMenuIterator(ArrayList items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position < items.size()) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        Object o = items.get(position);
        position++;
        return o;
    }
}
