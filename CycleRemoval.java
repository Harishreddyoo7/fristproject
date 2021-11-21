package linkedlist;

public class CycleRemoval {
	public static void main(String[] args) {
		Linkedlist_demo node1 = new Linkedlist_demo(1);
		Linkedlist_demo node2 = new Linkedlist_demo(2);
		Linkedlist_demo node3 = new Linkedlist_demo(3);
		Linkedlist_demo node4 = new Linkedlist_demo(4);
		Linkedlist_demo node5 = new Linkedlist_demo(5);
		node1.next=node2;
		node2.next=node3;
		node3.next=node4;
		node4.next=node5;
		node5.next=node2;
        cycleremoval(node1);
        printList(node1);
	}

	public static void printList(Linkedlist_demo node) {
		 while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	}

	public static void cycleremoval(Linkedlist_demo node) {
		Linkedlist_demo slow =node, fast = node;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (slow == fast) {
            slow = node;
            if (slow != fast) {
                while (slow.next != fast.next) {
                    slow = slow.next;
                    fast = fast.next;
                }
                System.out.println(fast.next.data + " loop begins");
                fast.next = null; 
            }
            else {
                while(fast.next != slow) {
                    fast = fast.next;
                }
                fast.next = null;
            }
        }
}


}
