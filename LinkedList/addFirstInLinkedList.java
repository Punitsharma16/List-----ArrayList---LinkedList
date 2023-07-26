package LinkedList;

public class addFirstInLinkedList {
    Node Head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
            Node newNode = new Node(data);
            if(Head == null){
                Head = newNode;
                return;
            }
            newNode.next = Head;
            Head = newNode;
        }
        public void PrintList() {
            if (Head == null) {
                System.out.println("List is Empty");
                return;
            }
            Node currNode = Head;
            while(currNode != null) {
                System.out.print(currNode.data+"-->");
                currNode = currNode.next;
            }
            System.out.println("Null");
        }

    public static void main(String[] args) {
        addFirstInLinkedList list1 = new addFirstInLinkedList();
        list1.addFirst("Developer");
        list1.addFirst("Web");
        list1.addFirst("Stack");
        list1.addFirst("Full");
        list1.PrintList();
    }
}
