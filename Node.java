/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vinay
 */
public class Node {
    
    private String data;
    private Node next;

    public Node() {
        this("", null);
    }

    public Node(String data) {
        this(data, null);
    }

    public Node(String data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node getNext() {
        return this.next;
    }

    public void setNext(Node newNext) {
        this.next = newNext;
    }

    public String getData() {
        return this.data;
    }

    @Override
    public String toString() {
        return "[Node: " + this.data + "]";
    }
}
