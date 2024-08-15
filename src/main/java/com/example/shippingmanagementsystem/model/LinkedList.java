package com.example.shippingmanagementsystem.model;

/**
 * A singly-linked list implementation in Java.
 *
 * @param <T> the type of data stored in the list
 */
public class LinkedList<T> {
    // Reference to the first node in the list
    private Node<T> head;
    // Reference to the last node in the list
    private Node<T> tail;
    // Number of elements in the list
    private int size;

    /**
     * Constructs an empty linked list.
     */
    public LinkedList() {
        // Initialize head, tail, and size to their default values
        head = null;
        tail = null;
        size = 0;
    }

    /**
     * Adds a new node with the given data to the end of the list.
     *
     * @param data the data to be added
     */
    public void add(T data) {
        // Create a new node with the given data
        Node<T> newNode = new Node<>(data);

        // If the list is not empty, set the next field of the current tail node to the new node
        if (tail != null) {
            tail.next = newNode;
        }

        // Set the tail field to the new node
        tail = newNode;

        // If the list was empty, set the head field to the new node
        if (head == null) {
            head = newNode;
        }

        // Increment the size field
        size++;
    }

    /**
     * Removes the first node with the given data from the list.
     *
     * @param data the data to be removed
     * @return true if the data was found and removed, false otherwise
     */
    public boolean remove(T data) {
        // Initialize current and previous nodes to the head of the list
        Node<T> current = head;
        Node<T> previous = null;

        // Iterate through the list to find the node with the matching data
        while (current != null) {
            if (current.data.equals(data)) {
                // If the node to be removed is the head node, update the head field
                if (previous != null) {
                    previous.next = current.next;
                } else {
                    head = current.next;
                }

                // If the node to be removed is the tail node, update the tail field
                if (current == tail) {
                    tail = previous;
                }

                // Decrement the size field
                size--;

                // Return true to indicate that the data was found and removed
                return true;
            }

            // Update previous and current nodes to the next node in the list
            previous = current;
            current = current.next;
        }

        // Return false to indicate that the data was not found
        return false;
    }

    /**
     * Returns the data of the node at the given index.
     *
     * @param index the index of the node
     * @return the data of the node
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public T get(int index) {
        // Check if the index is within bounds
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        // Initialize current node to the head of the list
        Node<T> current = head;

        // Iterate through the list to find the node at the given index
        for (int i = 0; i < index; i++) {
            current = current.next;
        }

        // Return the data of the node
        return current.data;
    }

    /**
     * Returns the number of elements in the list.
     *
     * @return the number of elements in the list
     */
    public int size() {
        // Return the size field
        return size;
    }

    /**
     * A private static class that represents a single node in the list.
     *
     * @param <T> the type of data stored in the node
     */
    private static class Node<T> {
        // The data stored in the node
        T data;
        // The next node in the list
        Node<T> next;

        /**
         * Constructs a new node with the given data.
         *
         * @param data the data to be stored in the node
         */
        Node(T data) {
            // Initialize data and next fields
            this.data = data;
            this.next = null;
        }
    }
}
