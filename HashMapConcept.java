package pratices_prblms;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		String str = "Tit for Tat is a proverb";
		str =  str.toLowerCase();
		HashMap<Character,Integer> dataMap = new HashMap<>();
		for(int i = 0; i<str.length();i++) {
			Character ch = str.charAt(i);
			if(ch>= 'a' && ch<='z') {
				if(dataMap.containsKey(ch)) {
					Integer value = dataMap.get(ch);
					value++;
					dataMap.put(ch, value);
				}else {
					dataMap.put(ch,1);
				}
			}
		}
		int max =0,min = 0;
		char maxChar = 0, minChar=0;
		for(Character key : dataMap.keySet()) {
			int value = dataMap.get(key);
			if(max<value) {
				max = dataMap.get(key);
				maxChar = key;
			}else {
				min = dataMap.get(key);
				minChar = key;
			}
		}
		System.out.println(max + " is ouccurance is of char-"+maxChar);
		System.out.println(min + " is ouccurance is of char-"+minChar);
	}

}
