package com.example.shippingmanagementsystem.model;

// This is a class for a custom linked list
public class CustomLinkedList<T> {
    private Node<T> head; // This is the first node in the list
    private int size; // This keeps track of how many items are in the list

    // This is a class for the nodes in the list
    private static class Node<T> {
        private T data; // This is the data the node holds
        private Node<T> next; // This is the next node in the list

        // This is the constructor for the node
        public Node(T data) {
            this.data = data; // Set the data
            this.next = null; // Set the next node to null
        }
    }

    // This method adds a new item to the list
    public void add(T data) {
        Node<T> newNode = new Node<>(data); // Create a new node with the data
        if (head == null) { // If the list is empty
            head = newNode; // Set the new node as the head
        } else {
            Node<T> current = head; // Start at the head
            while (current.next != null) { // Go to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Add the new node at the end
        }
        size++; // Increase the size of the list
    }

    // This method gets the item at a specific index
    public T get(int index) {
        if (index >= size) { // If the index is too big
            throw new IndexOutOfBoundsException(); // Throw an error
        }
        Node<T> current = head; // Start at the head
        for (int i = 0; i < index; i++) { // Move to the right index
            current = current.next; // Move to the next node
        }
        return current.data; // Return the data at the index
    }

    // This method returns the size of the list
    public int size() {
        return size; // Return the size
    }

    // Additional methods
    // toString method
  
    @Override
public String toString() {
    StringBuilder sb = new StringBuilder(); // This makes a new StringBuilder to build the string
    sb.append("["); // Start the string with a [
    Node<T> current = head; // Start at the head of the list
    while (current != null) { // While there are still nodes in the list
        sb.append(current.data); // Add the data from the current node to the string
        if (current.next != null) { // If there is another node after this one
            sb.append(", "); // Add a comma and a space
        }
        current = current.next; // Move to the next node
    }
    sb.append("]"); // End the string with a ]
    return sb.toString(); // Return the string we built
}

}