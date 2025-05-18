package com.dsa;

class Node {
    private  String value;
    Node next;

    public Node(String value){
        this.value=value;
        this.next=null;
    }

    public String getValue(){
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

class LinkedList{
    private Node head;

    public void insert(String value){
        Node newNode = new Node(value);
        if(head==null){
            head=newNode;
            return;
        }
        Node current = head;
        while(current.getNext()!=null){
            current=current.getNext();
        }
        current.setNext(newNode);
    }

    public void printList(){
        Node current = head;
        while(current!=null){
            System.out.print(current.getValue()+ "-->");
            current=current.getNext();
        }
        System.out.println("null");
    }
}
public class Program9 {
    public static void main(String[] args) {
//       Node head = new Node("a");
//       Node second = new Node("b");
//       Node third = new Node("c");
//       head.setNext(second);
//       second.setNext(third);
//       Node current = head;
//       while(current!=null){
//           System.out.println(current.getValue());
//           current =current.getNext();
//
//       }
        LinkedList list = new LinkedList();
        list.insert("a");
        list.insert("b");
        list.insert("c");

        list.printList();

    }
}
