/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc104_project;

import java.util.Random;

/**
 *
 * @author My PC
 */

// Circularly Linked List
public class SList<E> {
    private Node<E> head, tail;
    private int size;
    
    SList() {
        this.head = null;
        this.tail = null;
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }
    
    public void addQuestionAndAnswer(E e, E e2, E e3) {
        Node<E> newNode = new Node<>(e, e2, e3, null, null, null, null);
        if(size == 0) {
            head = newNode;
            tail = newNode;
            // For Circular Link
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            // For Circular Link
            tail.setNext(head);
        }
        size++;
    }
    
    public void addMultipleChoice(E e, E e2, E e3, E e4, E e5, E e6) {
        Node<E> newNode = new Node<>(e, e2, e3, e4, e5, e6, null);
        if(size == 0) {
            head = newNode;
            tail = newNode;
            // For Circular Link
            tail.setNext(head);
        } else {
            tail.setNext(newNode);
            tail = newNode;
            // For Circular Link
            tail.setNext(head);
        }
        size++;
    }
    
    public Node<E> getNode() {
        // To generate random numbers
        Random rand = new Random(); 
        int rand_int = rand.nextInt(1000);
        Node<E> tempNode;
        Node<E> tempPrevNode;
        Node<E> tempNextNode;
        tempNode = head;
        tempPrevNode = head;
        
        for(int j = 0; j < rand_int; j++) {
            tempNode = tempNode.getNext();
            // To get the previous Node of the selected Node
            if(j > 0) {
                tempPrevNode = tempPrevNode.getNext();
            }
        }
        
        // The next Node of select Node
        tempNextNode = tempNode.getNext();
        // Pass Node value to return Node
        Node<E> returnNode = tempNode;
        // Removing the selected Node
        tempPrevNode.setNext(tempNextNode);
        // Decrease size because a Node is removed
        size--;
        
        return returnNode;
    }
    
}
