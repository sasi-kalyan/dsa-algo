package singlelinkedlist;

public class CyclicLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    static Node head = null;


    /*
        detectCycle: method is used to check whether cycle exists in the linke-list or not.
     */
    public static boolean detectCycle(){

        Node fast = head, slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                return true;
            }
        }

        return false;
    }

    /*
        findStartNodeOfCycle: method that used to find the starting node in the cycle.
     */
    public static int findStartNodeOfCycle(){

        Node fast = head, slow = head;

        while(fast != null && fast.next != null){

            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        Node temp = head;

        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }

        return temp.data;
    }

    /*
        removeCycle: method is used to break the cycle in the linked-list.
     */
    public static void removeCycle(){

        Node slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                break;
            }
        }

        Node temp = head, prev = null;

        while(slow != temp){
            prev = slow;
            slow = slow.next;
            temp = temp.next;
        }

        prev.next = null;
    }


    /*
        print: method is used to print the nodes in the linked-list.
     */
    public static void print(){

        Node curr = head;

        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }

        System.out.println();
    }


    public static void main(String[] args) {

        Node fst = new Node(10);
        Node snd = new Node(20);
        Node trd = new Node(30);
        Node fou = new Node(40);
        Node fiv = new Node(50);

        fst.next = snd;
        snd.next = trd;
        trd.next = fou;
        fou.next = fiv;
        fiv.next = trd;

        head = fst;  //head is first node.

        System.out.println("Is cycle exists? " + detectCycle());

        System.out.println("find start node of the cycle: " + findStartNodeOfCycle());

        /*
                //Cycle formed in the linked-list between x2 - x4

                [10 | x1] => [20 | x2] => [30 | x3] => [40 | x4]  => [50 | x2]
                x0           x1           x2            x3           x4
         */

        removeCycle();

        System.out.println("after removal of cycle in the linked-list");
        print();
    }
}
