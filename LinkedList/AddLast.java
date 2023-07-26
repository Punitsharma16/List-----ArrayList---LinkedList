package LinkedList;

public class AddLast {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void print(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data+"-->");
            currNode= currNode.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        AddLast List = new AddLast();
        List.addLast("This");
        List.addLast("is");
        List.addLast("Newton");
        List.addLast("School");
        List.print();
    }
}
