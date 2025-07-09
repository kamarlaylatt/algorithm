package Exercises.LinkedListEx1;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class LinkedList {
    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node first;
    private Node last;
    private int size;

    private boolean isEmpty() {
        return first == null;
    }

    public void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            node.next = first;
            first = node;
        }
        size++;
    }

    public void addLast(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            first = last = node;
        } else {
            var current = first;
            // while (current != null) {
            // var temp_current = current.next;
            // if (current.next == null)
            // current.next = node;
            // current = temp_current;
            // }
            last.next = node;
            last = node;
        }
        size++;
    }

    public int getDataByIndex(int index) {
        var current = first;
        int arr_index = 0;
        while (current != null) {
            if (arr_index == index) {
                return current.data;
            }
            current = current.next;
            arr_index++;
        }
        return -1;
    }

    public int indexOf(int data) {
        var current = first;
        int index = 0;
        while (current != null) {
            if (current.data == data)
                return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    public boolean isContain(int data) {
        return indexOf(data) != -1;
    }

    public void removeFirst() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var second = first.next;
            first.next = null;
            first = second;
        }
        size--;
    }

    // public void removeLast() {
    // var current = first;
    // while (current.next != null) {
    // var second = current.next;
    // if (second.next == null) {
    // last = current;
    // current.next = null;
    // } else {
    // current = current.next;
    // }
    // }
    // size--;
    // }

    public void removeLast() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }

        if (first == last) {
            first = last = null;
        } else {
            var prev = getPrevious(last);
            last = prev;
            prev.next = null;
        }
        size--;
    }

    public Node getPrevious(Node node) {
        var current = first;
        while (current != null) {
            if (current.next == node)
                return current;
            current = current.next;
        }

        return null;
    }

    public void reverse() {
        // 1 -> | <- 2 | <- 3 | <- 4 | <- 5
        // p c

        var previous = first;
        var current = first.next;

        while (current != null) {
            var next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }

        last = first;
        last.next = null;
        first = previous;

    }

    public int[] toArray() {
        var array = new int[size];
        var current = first;
        int index = 0;

        while (current != null) {
            array[index++] = current.data;
            current = current.next;
        }

        return array;
    }
}