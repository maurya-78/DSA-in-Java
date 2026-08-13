package LinkedList;
class Node{     //  user define deta type
    int val;
    Node next;    // null
    Node(int val){
        this.val = val;
    }
}
class LinkedList{     // user defined data structure
      int size;
      Node head;      // null
      Node tail;      // null
      void addAtTail(int val){
           Node temp = new Node(val);
           if(tail == null) head = tail = temp;
           else {
               tail.next = temp;
               tail = temp;
               size++;
           }
      }
    void addAtHead(int val){
        Node temp = new Node(val);
        if(tail == null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
            size++;
        }
    }
    void deleteAtHead(int val){
        Node temp = new Node(val);
        if(tail == null){
            System.out.println("List is Empty");
            return;
        }
            head = head.next;
        size--;
    }
       void display(){
         if(head == null) return;
         Node temp = head;
         while(temp != null){
             System.out.print(temp.val+" ");
             temp = temp.next;
         }
           System.out.println();
      }
}
public class LinkedListDataStructure {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addAtTail(10);
        ll.addAtTail(20);
        ll.addAtTail(30);
        ll.addAtTail(40);
        ll.addAtHead(50);
        ll.deleteAtHead(50);
        ll.display();
        System.out.println(ll.size);
    }
}
