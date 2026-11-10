package doublylinkedlist;

/*
    Doubly-Linked-List: is a linear datastructure that stores the elements in sequential fashion, but the nodes are
    linked together through the pointers.

    the doubly-linked-list structures as below

    |--------------------------
    |   prev |  data  | next  |  => ...
    |--------------------------

 */

public class DoublyLinkedList {

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    static Node head = null;

    /*
        addLast: method that appends the node at the end of doubly-linked-list
     */
    public static void addLast(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node curr = head;

        while (curr.next != null){
            curr = curr.next;
        }

        curr.next = node;
        node.prev = curr;
    }

    /*
        addFirst: method that appends the node at start of doubly-linked-list
     */
    public static void addFirst(int data){

        Node node = new Node(data);
        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head.prev = node;
        head = node;
    }

    /*
        addAtPost: method that appends the node at specified position
     */
    public static void addAtPost(int data, int pos){

        if(head == null){
            System.out.println("the specified position is not available to append.");
            return;
        }

        if(pos == 1){
            addFirst(data);
        }else{
            Node node = new Node(data);
            Node curr = head;
            int i = 1;

            while (i < (pos -1 )){
                curr = curr.next;
                i++;
            }

            node.next = curr.next;
            curr.next.prev = node;
            curr.next = node;
            node.prev = curr;
        }


    }

    /*
        print: method that prints the dobly-linked-list on console;
     */
    public static void print(){

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" <-> ");
            curr = curr.next;
        }
        System.out.println();
    }


    /*
        removeFirst: method that removes the node from the start of the list
     */
    public static void removeFirst(){
        head = head.next;
    }

    /*
        removeLast: mehtod that removes the node from the last of dobly-linked-list
     */
    public static void removeLast(){
        Node prev, curr;
        prev = null; curr = head;

        while (curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
    }

    /*
        removeAtPost: method that removes the element from specific position in doubly-linked-list
     */
    public static void removeAtPost(int pos){

        if(head == null){
            System.out.println("specified position not available, head is NULL");
            return;
        }

        if(pos == 1){
            removeFirst();
        }else{

            int i = 1;
            Node curr = head;
            while (i < (pos -1)){
                curr = curr.next;
                i++;
            }

            curr.next = curr.next.next;
            curr.next.prev = curr;
        }
    }

    public static void main(String[] args) {
        System.out.println("===========Doubly-Linked-List=============");

        addLast(10);
        print();
        addLast(40);
        addLast(70);
        print();

        System.out.println("Add first");
        addFirst(100);
        print();

        System.out.println("Add at position");
        addAtPost(900, 1);
        addAtPost(600, 3);
        print();

        System.out.println("remove first");
        removeFirst();
        print();

        System.out.println("remove last");
        removeLast();
        print();

        System.out.println("remove at pos");
        removeAtPost(2);
        print();
    }
}
