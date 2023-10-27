import java.util.*;

class LinkedListRev {
    public static void main(String[] args) {
        LinkedList<Integer> numList = new LinkedList<>();
        numList.add(1);
        numList.add(2);
        Collection<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(5);
        numList.addAll(list);
        System.out.println("Original List: " + numList);
        
        //using reverse
        Collections.reverse(numList);
        System.out.println("Reversed List: " + numList);

        //without using reverse

        Node head = null;
        for (int i : numList){
            if (head == null){
                head = new Node(i,null);
            } else{
                Node temp = head;
                while (temp.next != null){
                    temp=temp.next;
                }
                temp.next = new Node(i,null);
            }
        }
        printLinkedList(head);

    }
    public static void printLinkedList(Node head) {
        List<Integer> list = new ArrayList<>();
        Node temp = head;
        while(temp != null) {
            list.add(temp.data);
            temp = temp.next;
        }
        System.out.println("Reversed List: " + list);
    }

}
class Node {
    int data;
    Node next;

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }
}