package LinkedList;

class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class NthNodeFromLast {
    Node head;
    public Node removeNthFromEnd(Node head, int n){
        if(head.next == null){
            return null;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        if(n == size){
            return head.next;
        }
        int indexToSearch = size-n;
        Node prev = head;
        int i = 1;
        while(i <indexToSearch){
            prev = prev.next;
            i++;
        }
        prev = prev.next.next;
        return head;
    }
}
