package LinkedList;
//class Node{
//    int val;
//    Node next;
//    Node(int val){
//        this.val = val;
//    }
//}
public class DisplayList {
    public static void display(Node head){
//        System.out.println(head.val+" ");
//        System.out.println(head.next.val+" ");
//        System.out.println(head.next.next.val+" ");
//        System.out.println(head.next.next.next.val+" ");
//        System.out.println(head.next.next.next.next.val+" ");

        // using loop

        Node temp = head;
        //while(temp != null)    or
        for( temp = head;temp!=null;temp = temp.next){
            System.out.print(temp.val+" ");
            //temp = temp.next;   // important
        }
        System.out.println();
    }
    public static void main(String[] args) {
       Node a = new Node(100);
       Node b = new Node(200);
       Node c = new Node(300);
       Node d = new Node(400);
       Node e = new Node(500);

       a.next = b;
       b.next = c;
       c.next = d;
       d.next = e;
       display(a);
    }
}
