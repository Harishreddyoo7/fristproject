package pratices_prblms;

public class Panagram {

	public static void main(String[] args) {
		String str = "Abcdefghijklmnopqrstuvwxyz";
		str = str.toLowerCase();
		boolean isPanagram = checkPanagram(str);
		System.out.println(isPanagram);
	}

	private static boolean checkPanagram(String str) {
		
		for(char i = 'a';i<= 'z';i++) {
			String value = String.valueOf(i);
			if(str.contains(value)) {
				continue;
			}else {
				return false;
			}
	    }
		return true;
	}
}

