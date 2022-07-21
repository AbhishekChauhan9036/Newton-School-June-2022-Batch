/*

class Node {
    Node next;
    Node prev;
    int val;

    Node(int val) {
        this.val = val;
        next = null;
        prev = null;
    }
}
*/



public static Node insertnew(Node head, int new_data) {
//enter your code here
    Node new_node = new Node(new_data);
    new_node.next = head;
    head = new_node;

    return head;
}