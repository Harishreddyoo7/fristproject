package linkedlist;

public class MiddleElementLL {
		static int count = 0;
		public static void main(String[] args) {
			Linkedlist_demo node1 = new Linkedlist_demo(1);
			Linkedlist_demo node2 = new Linkedlist_demo(2);
			Linkedlist_demo node3 = new Linkedlist_demo(3);
			Linkedlist_demo node4 = new Linkedlist_demo(4);
			node1.next=node2;
			node2.next=node3;
			node3.next=node4;
			node4.next=null;
			Linkedlist_demo node = node1;
			while(node != null) {
				count++;
				node = node.next;
			}
			int mid =0;
	    	if(count%2 == 0) {
	    		mid = count/2;
	    	}else {
	    		mid = (count+1)/2;
	    	}
	    	Linkedlist_demo current = node1;
	    	while(current.next != null) {
	    	for(int i = 1;i<mid;i++) {
	    		current = current.next;
	    	}
	    	System.out.println(current.data);
	    	}
	    	
		}

	}

