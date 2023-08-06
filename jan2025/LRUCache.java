package com.example.mycode.matrix.jan2025;

import java.util.HashMap;

public class LRUCache {

    private final int capacity;
    private final HashMap<Integer, Node> map;
    private final DoublyLinkedList cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.map = new HashMap<>();
        this.cache = new DoublyLinkedList();
    }


    // Get method
    public int get(int key) {
        if (!map.containsKey(key)) {
            return -1;
        }

        // Move the accessed node to the head (most recently used)
        Node node = map.get(key);
        cache.moveToHead(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            // Update the value and move the node to the head
            Node node = map.get(key);
            node.value = value;
            cache.moveToHead(node);
        } else {
            // If at capacity, remove the least recently used node
            if (map.size() >= capacity) {
                Node tail = cache.removeTail();
                map.remove(tail.key);
            }

            // Create a new node and add it to the head
            Node newNode = new Node(key, value);
            cache.addToHead(newNode);
            map.put(key, newNode);
        }
    }


    private static class Node {
        int key, value;
        Node prev, next;

        public Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    private static class DoublyLinkedList {
        private Node head, tail;

        DoublyLinkedList() {
            head = new Node(0, 0);
            tail = new Node(0, 0);

            head.next = tail;
            head.prev = head;
        }

        void addToHead(Node node) {
            node.next = head.next;
            node.prev = head;
            head.next.prev = node;
            head.next = node;
        }

        void moveToHead(Node node) {
            removeNode(node);
            addToHead(node);
        }


        void removeNode(Node node) {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }


        Node removeTail() {
            Node tailNode = tail.prev;
            removeNode(tailNode);
            return tailNode;
        }


    }


    public static void main(String[] args) {

        LRUCache lruCache = new LRUCache(3);

        lruCache.put(1, 10);
        lruCache.put(2, 20);
        lruCache.put(3, 30);
        System.out.println("Value for key 1: " + lruCache.get(1)); // Output: 10

        lruCache.put(4, 40); // Evicts key 2
        System.out.println("Value for key 2: " + lruCache.get(2)); // Output: -1

        lruCache.put(5, 50); // Evicts key 3
        System.out.println("Value for key 3: " + lruCache.get(3)); // Output: -1 Output: 10


    }
}




