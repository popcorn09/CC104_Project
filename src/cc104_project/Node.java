/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cc104_project;

/**
 *
 * @author My PC
 * @param <E>
 */
public class Node<E> {
    private final E data, data2, data3, data4, data5 , data6;
    private Node<E> next;
    
    Node(E data, E data2, E data3, E data4, E data5, E data6, Node<E> next) {
        this.data = data;
        this.data2 = data2;
        this.data3 = data3;
        this.data4 = data4;
        this.data5 = data5;
        this.data6 = data6;
        this.next = next;
    }
    
    public E getData() {
        return data;
    }
    
    public E getData2() {
        return data2;
    }
    
    public E getData3() {
        return data3;
    }
    
    public E getData4() {
        return data4;
    }
    
    public E getData5() {
        return data5;
    }
    
    public E getData6() {
        return data6;
    }
    
    public Node<E> getNext() {
        return next;
    }
    
    public void setNext(Node<E> next) {
        this.next = next;
    }
    
}
