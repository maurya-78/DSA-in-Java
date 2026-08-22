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

    boolean search(int val){
       if(head == null) return false;
       Node temp = head;
       while (temp != null){
           if(temp.val == val) return  true;
           temp = temp.next;
       }
       return  false;
    }
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

      void insert(int val, int idx){
        if(idx<0 || idx>size){
            System.out.println("Invalid Index");
            return;
        }if(idx ==0) addAtHead(val);
          else if(idx == size) {
              addAtTail(val);
          }else{
              Node temp = head;
              for(int i=1;i<= idx-1;i++){
                  temp = temp.next;
              }
              Node newNode = new Node(val);
              newNode.next = temp.next;
              temp.next = newNode;
              size++;
          }
      }
      void delete(int idx){
        if(idx <0 || idx >=size) {
            System.out.println("Invalid index");
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp =temp.next;
        }
        temp.next = temp.next.next;  // delete method
          if(idx == size-1) tail = temp ; // we are deleting tail
          size--;
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
        System.out.println(ll.size );
        ll.insert(48,2);
        ll.delete(3);
    }
}
