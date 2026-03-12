public class Linkedlist {
    Node head;
    public void addData(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        }
    }
    public void display(){
        Node temp = head;
        System.out.println("Linked list");
        System.out.println(temp.data);
        while (temp.next != null){
            temp = temp.next;
        }
    }
}
