package info.nj005py.exercise.week8;

import java.util.LinkedHashMap;
import java.util.Map;

//146. LRU缓存机制
public class LRUCache extends LinkedHashMap<Integer,Integer> {
    int capacity;

    public LRUCache(int capacity) {
        super(capacity,0.75F,true);
        this.capacity = capacity;
    }

    public int get(int key) {
        return getOrDefault(key,-1);
    }

    public void put(int key,int value) {
        super.put(key,value);
    }

    @Override
    protected boolean removeEldestEntry(Map.Entry<Integer,Integer> entry) {
        return size() > capacity;
    }
}
