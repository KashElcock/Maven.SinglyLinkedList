package com.zipcodewilmington.singlylinkedlist;

/**
 * Created by leon on 1/10/18.
 */
public class SinglyLinkedList {
    static class Node {
        int data;
        Node next;
        //make a new node
        Node(int data){
            this. data = data;
            this. next = null;
        }
    }
    //head and tail point to null
    Node head = null;
    Node tail = null;
    //method to add new node
    void addNode (int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    void displayNodes(){
        Node current = head;
        if (head ==null){
            System.out.println("Empty");
            return;
        }
        System.out.println("Nodes : ");
        while(current != null){
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    int countNodes(){
        int count = 0;
        Node currentNode = head;
        while(currentNode != null){
            count++;
            currentNode = currentNode.next;
        } return count;
    }
}
