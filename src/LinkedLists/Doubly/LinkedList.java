package LinkedLists.Doubly;

import com.sun.jndi.toolkit.ctx.HeadTail;

public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        this.head = null;
        this.tail = null;
    }

    public boolean isEmpty(){
        return head == null;
    }
    public Node search(int value){
        if(head == null){
            return null;
        }
        if(head.getData() == value){
            return head;
        }
        Node temp = head;
        while(temp!=null){
            if (temp.getData() == value){
                return temp;
            }
            temp = temp.getNext();
        }
        System.out.println("Does not exist");
        return null;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.getData() + ", ");
            temp = temp.getNext();
        }
        System.out.println();
    }
    public boolean nodeExists(int value){
        if(head.getData() == value){
            return true;
        }
        Node temp = head;
        while(temp!=null){
            if (temp.getData() == value){
                return true;
            }
            temp = temp.getNext();
        }
        return false;
    }
    public void insertFront(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        } else {
            node.setNext(head);
            head.setPrev(node);
            head = node;
        }
    }
    public void insertRear(int data){
        Node node = new Node(data);
        if(head == null){
            head = node;
            tail = node;
        } else {
            node.setPrev(tail);
            tail.setNext(node);
            tail = node;
        }
    }
    public void insertNext(int data, int prev){
        Node node = new Node(data);
        if(head == null){
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.getData() == prev){
                if (temp.getNext()!= null){
                    node.setNext(temp.getNext());
                    node.setPrev(temp);
                    temp.getNext().setPrev(node);
                    temp.setNext(node);
                }else{
                    temp.setNext(node);
                    node.setPrev(temp);
                }
                return;
            }
            temp = temp.getNext();
        }
    }
    public void delete(int data){
        if(head == null){
            return;
        }
        if(head.getData() == data){
            head.getNext().setPrev(null);
            head = head.getNext();
            return;
        }
        Node temp = head;
        while(temp!=null){
            if(temp.getData() == data){
                if (temp.getNext() != null) {
                    temp.getNext().setPrev(temp.getPrev());
                    return;
                }
                if (temp.getPrev() != null) {
                    temp.getPrev().setNext(temp.getNext());
                    return;
                }
            }
            temp = temp.getNext();
        }
    }

}
