package linkedlist;

public class Palindrome {

	 static int count = 0;
		public static void main(String[] args) {
			Linkedlist_demo node1 = new Linkedlist_demo(1);
			Linkedlist_demo node2 = new Linkedlist_demo(2);
			Linkedlist_demo node3 = new Linkedlist_demo(2);
			Linkedlist_demo node4 = new Linkedlist_demo(1);
			node1.next=node2;
			node2.next=node3;
			node3.next=node4;
			node4.next=null;
			if(palindromeChecker(node1))
				System.out.println("Palindrome");
			else 
				System.out.println("Not a Palindrome");
			
		}
	    public static Linkedlist_demo reverse(Linkedlist_demo node) {
	    	while(node != null) {
				count++;
				node = node.next;
			}
			
			Linkedlist_demo current = node;
			Linkedlist_demo prev = null;
			Linkedlist_demo next = null;
			while(current!=null) {
				next = current.next;
				current.next = prev;
				prev = current;
				current = next;
			}
			node = prev;
			
			return node;
		}
	    private static boolean palindromeChecker(Linkedlist_demo node) {
	    	Linkedlist_demo current = node;
	    	int mid =0;
	    	if(count%2 == 0) {
	    		mid = count/2;
	    	}else {
	    		mid = (count+1)/2;
	    	}
	    	for(int i =1;i<mid;i++) {
	    		current = current.next;
	    	}
	    	Linkedlist_demo revHead = reverse(current.next);
	    	while(node != null && revHead != null) {
	    		if(node.data !=  revHead.data) {
	    			return false;
	    		}
	    		node = node.next;
	    		revHead = revHead.next;
	    	}
	    	return true;
	    }
	

	}


