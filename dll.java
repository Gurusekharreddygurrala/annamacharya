import java.util.*;
class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data=data;
       
    }
}
public class dll{
    public static void main(String args[]){
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        first.next=second;
        second.next=third;
        second.prev=first;
        third.prev=second;
        Node temp=first;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
         temp=third;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.prev;
        }
        System.out.println("null");
    }
}