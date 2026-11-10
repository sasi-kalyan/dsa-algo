package singlelinkedlist;

/*
        LinkedList: is a linear data-structure thaat holds elements in sequential fashion
        unlike arrays the elements are not contiguoes memory locations, but they link via
        referece/pointer.

        Node is the building block for the linked-list, the structure of the node is as below.

        ----------------
        |data  | next  | =>
        ----------------
 */

public class SingleLinkedList {

    static class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;


    /*
           addLast: method that appends the node to the linked-list at the last position.
     */
    public static void addLast(int data){

        //create new node
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = node;
    }

    /*
        addFirst: method that appends the node at the start of the linked-list.
     */
    public static void addFirst(int data){
        Node node = new Node(data);

        if(head == null){
            head = node;
            return;
        }

        node.next = head;
        head = node;
    }

    public static void print(){
        if(head == null) return;

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("NULL\n");
    }

    /*
        addPos: method that adds a node at specific position in the linked-list
     */
    public static void addAtPos(int data, int pos){

        if(head == null) return;

        Node node = new Node(data);
        if(pos == 1) {
            addFirst(data);
        }else{
            int i = 1;

            Node temp = head;
            while(i < (pos - 1)){
                temp = temp.next;
                i++;
            }

            node.next = temp.next;
            temp.next = node;
        }
    }

    /*
        removeLast: method that removes the last node in the linked-list
     */
    public static void removeLast(){
        if(head == null) return;

        Node prev = null, curr = head;
        while(curr.next != null){
            prev = curr;
            curr = curr.next;
        }

        prev.next = null;
    }

    /*
        removeFirst: method that removes the first node in the linked-list
     */
    public static void removeFirst(){
        if(head == null) return;
        head = head.next;
    }

    /*
        removeAtPos: method that removes the node at specific position in linked-list
     */
    public static void removeAtPos(int pos){
        if(head == null) return;

        if(pos == 1){
            removeFirst();
        }else{
            int i = 1;
            Node temp = head;
            while(i < (pos - 1)){
                temp = temp.next;
                i++;
            }

            temp.next = temp.next.next;
        }
    }

    /*
        count: method that counts the length of the linked-list
     */
    public static int count(){
        if(head == null) return 0;

        Node temp = head; int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        //add elements at last
        addLast(10);
        addLast(20);

        //add elements at first
        addFirst(40);
        addFirst(60);

        System.out.println("-----BEFORE-----");
        print();

        System.out.println("-----AFTER------");
        addAtPos(100, 1);
        addAtPos(120, 2);
        print();

        System.out.println("-----AFTER REMOVAL OF LAST NODE------");
        removeLast();
        print();

        System.out.println("----AFTER REMOVAL OF FIRST NODE-----");
        removeFirst();
        print();

        System.out.println("----REMOVE AT POS------");
        removeAtPos(2);
        print();

        //count of nodes in linked-lists
        System.out.println("COUNT OF NODES IN SINGLE LINKED LIST - " + count());

    }

}
