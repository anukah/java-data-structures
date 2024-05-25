package End2021.Paper1.Q1;

import javax.xml.bind.NotIdentifiableEvent;

public class LinkedList {
    Node front;
    Node rear;

    public LinkedList() {
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){return front == null;}

    public void insertRear(String regNo, String name, int age, String gender, String events){
        Node node = new Node(regNo, name, age, gender, events);
        if (isEmpty()){
            front = node;
        } else {
            rear.next = node;
        }
        rear = node;
    }
    public Node delete(String regNo){
        Node returnNode = null;
        if (!isEmpty()){
            if (front.getStudent().getRegNo().equals(regNo)){
                returnNode = front;
                front = front.next;
                if (front==null)
                {rear = null;}
            } else {
                Node temp = front;
                while(temp.next!=null){
                    if (temp.next.getStudent().getRegNo().equals(regNo)){
                        returnNode = temp.next;
                        if (temp.next == rear) {
                            rear = temp;
                        }
                        temp.next = temp.next.next;
                        break;
                    }
                    temp = temp.next;
                }
            }
        }
        return returnNode;
    }
    public void search(String regNo){
        Node returnNode = null;
        if (!isEmpty()){
            Node temp = front;
            while(temp!=null){
                if (temp.getStudent().getRegNo().equals(regNo)){
                    returnNode = temp;
                }
                temp = temp.next;
            }
        }
        if (returnNode!=null){
            System.out.println("Student Found");
            System.out.println("------------------------------");
            System.out.println("Registration NO    : " + returnNode.getStudent().getRegNo());
            System.out.println("Name               : " + returnNode.getStudent().getName());
            System.out.println("Age                : " + returnNode.getStudent().getAge());
            System.out.println("Events             : " + returnNode.getStudent().getEvents());
            System.out.println("------------------------------");
        } else System.out.println("Student Not Found");
    }

    public void display(){
        Node temp = front;
        while(temp!=null){
            System.out.print(temp.getStudent().getRegNo() + ", ");
            temp = temp.next;
        }
    }
}
