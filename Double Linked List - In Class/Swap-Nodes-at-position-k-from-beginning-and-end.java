/*
class Node
{
   int data;
   Node next, prev;
};
*/


static void swap(Node pa, Node pb){
        // swap parents
        Node a = pa.next, b = pb.next;
        pa.next = b;
        pb.next = a;
        // swap children
        Node temp = a.next;
        a.next = b.next;
        b.next = temp;
    }

    public static Node swapNodes(Node head, int k){
        Node dummy = new Node(), pa = dummy, pb = dummy, a = head, b = head;
        dummy.next = head;

        // find parent-a
        int count = 0;
        while(++count < k) {
            pa = pa.next;
            a = a.next;
        }
        // find parent-b
        while(a.next!= null) {
            a = a.next;
            pb = pb.next;
            b = b.next;
        }
        swap(pa, pb);
        return dummy.next;
    }