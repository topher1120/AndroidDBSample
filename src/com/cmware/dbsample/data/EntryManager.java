package com.cmware.dbsample.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * A class to manage the persistence and retrieval of Entry objects.
 */
public class EntryManager {

    private List<Entry> entryList = new ArrayList<Entry>();

    public EntryManager() {
        initList();
    }

    private void initList() {
        Entry entry1 = new Entry(1L, "John Doe", "Denver, CO");
        entryList.add(entry1);
    }

    public List<Entry> getEntryList() {
        return Collections.unmodifiableList(entryList);
    }

    public Entry[] getEntryArray() {
        return entryList.toArray(new Entry[entryList.size()]);
    }

    public Entry getEntryAt(int position) {
        return entryList.get(position);
    }

}
