package linkedlist;

public class FindTheKthEle {
	static int count = 0;
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
		int k = 1;
		Linkedlist_demo node = node1;
		while(node != null) {
			count++;
			node = node.next;
		}int key = count;
		while(node1 != null) {
			if(key == k) {
				System.out.println(node1.data);
				break;
			}
			node1 = node1.next;
			key--;
		}
	}

}

