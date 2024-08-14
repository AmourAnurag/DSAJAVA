package ImplementingHashmap;

import java.util.LinkedList;
import java.util.Objects;

public class MyHashMap<K, V> {

    class Node {
        K key;
        V value;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public String toString() {
            return "{" + key + ": " + value + "}";
        }
    }

    LinkedList<Node>[] HashTable;
    private int elements;
    private int TableSize;
    private Double ThereShold;

    @SuppressWarnings("unchecked")
    MyHashMap() {
        elements = 0;
        TableSize = 16;
        ThereShold = 0.75;
        HashTable = new LinkedList[TableSize];
        initialHashTable();
    }

    @SuppressWarnings("unchecked")
    private void initialHashTable() {
        for (int i = 0; i < TableSize; i++) {
            HashTable[i] = new LinkedList<>();
        }
    }

    public void put(K key, V value) {
        int hashCode = getHashCode(key);
        int index = searchInLinkedList(key, hashCode);
        Node node = new Node(key, value);
        if (index == -1) {
            HashTable[hashCode].add(0, node);
            elements++;
        } else {
            HashTable[hashCode].get(index).value = value;
        }
        if (elements / (double) TableSize >= ThereShold) {
            rehash();
        }
    }

    private int getHashCode(K key) {
        int hashCode = Objects.hash(key);
        hashCode = (Math.abs(hashCode) % TableSize);
        return hashCode;
    }

    private int searchInLinkedList(K key, int hashCode) {
        LinkedList<Node> list = HashTable[hashCode];
        for (int index = 0; index < list.size(); index++) {
            if (list.get(index).key.equals(key)) {
                return index;
            }
        }
        return -1;
    }

    @SuppressWarnings("unchecked")
    private void rehash() {
        LinkedList<Node>[] oldTable = HashTable;
        TableSize = 2 * TableSize;
        elements = 0;
        HashTable = new LinkedList[TableSize];
        initialHashTable();
        for (LinkedList<Node> list : oldTable) {
            for (Node node : list) {
                put(node.key, node.value);
            }
        }
    }

    public V get(K key) {
        int hashCode = getHashCode(key);
        int index = searchInLinkedList(key, hashCode);
        if (index == -1) {
            return null;
        } else {
            return HashTable[hashCode].get(index).value;
        }
    }

    public boolean containsKey(K key) {
        int hashCode = getHashCode(key);
        int index = searchInLinkedList(key, hashCode);
        return index != -1;
    }

    public V remove(K key) {
        int hashCode = getHashCode(key);
        int index = searchInLinkedList(key, hashCode);
        if (index == -1) {
            return null;
        } else {
            V value = HashTable[hashCode].get(index).value;
            HashTable[hashCode].remove(index);
            elements--;
            return value;
        }
    }

    public void iterate() {
        for (int i = 0; i < TableSize; i++) {
            for (Node node : HashTable[i]) {
                System.out.println(node);
            }
        }
    }

    public boolean isEmpty() {
        return elements == 0;
    }
}
