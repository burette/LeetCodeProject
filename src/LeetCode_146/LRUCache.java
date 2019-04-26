package LeetCode_146;

import java.util.*;

//用的是Java中的LinkedList和HashMap，HashMap中存储的是key和value，LinkedList中存储的是若干个map
public class LRUCache {

    public int capacity;
    public List<Map<Integer, Integer>> list = new LinkedList<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        int value = -1;
        for (Map map : list) {
            if (map.containsKey(key)) {
                list.remove(map);
                list.add(0, map);
                return (int) map.get(key);
            }
        }
        return value;
    }

    public void put(int key, int value) {
        int index = -1;
        for (Map<Integer, Integer> map : list) {
            if (map.get(key) != null) {
                list.remove(map);
                break;
            }
        }
        int size = list.size();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(key, value);
        if (size < capacity) {
            list.add(0, map);
        } else {
            list.add(0, map);
            list.remove(capacity);
        }
    }
}

class LRUCache1 {
    public int capacity;
    public LinkedHashMap<Integer, Integer> map;

    public LRUCache1(int capacity) {
        this.capacity = capacity;
        map = new LinkedHashMap<>();
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            int value = map.get(key);
            map.remove(key);
            map.put(key, value);
            return value;
        } else {
            return -1;
        }
    }

    public void put(int key,int value){
        if (map.containsKey(key)){
            map.remove(key);
        }
        if (map.size()>=capacity){
            map.remove(map.keySet().iterator().next());
            map.put(key,value);
        }
    }
}