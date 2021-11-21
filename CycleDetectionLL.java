package linkedlist;

public class CycleDetectionLL {
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
        cycleDetect(node1);
	}

	public static void cycleDetect(Linkedlist_demo node) {
		Linkedlist_demo slow =node, fast = node;
        int flag = 0;
        while (slow != null && fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println("Cycle detected");
        else
            System.out.println("Cycle not detected");
   
	}


}
