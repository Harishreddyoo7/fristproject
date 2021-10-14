package pratices_prblms;

import java.util.HashMap;

public class CharFreqInString {

	public static void main(String[] args) {
		String str = "aaabbbcccddeeeffffksacd";
		HashMap<Character , Integer> dataMap = new HashMap<>();
		Integer value = 0;
		for(int i = 0; i<str.length();i++) {
			Character ch = str.charAt(i);
			if(dataMap.containsKey(ch)) {
				value = dataMap.get(ch);
				value++;
				dataMap.put(ch, value);
			}else {
				dataMap.put(ch,1);
			}
		}
		for(Character key : dataMap.keySet()) {
			value = dataMap.get(key);
			System.out.println(key + " = " + value);
		}

	}

}
