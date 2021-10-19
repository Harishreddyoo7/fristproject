package pratices_prblms;

import java.util.HashMap;

public class RemoveElementFromHashMap {

	public static void main(String[] args) {
		HashMap<Integer , String> dataMap = new HashMap<>();
		dataMap.put(1,"A");
		dataMap.put(2,"B");
		dataMap.put(3,"C");
		dataMap.put(4,"D");
		dataMap.put(5,"E");

			for(Integer key : dataMap.keySet()) {
				if(dataMap.get(key).equals("D")) { 
				dataMap.remove(key);
				break;
				}
			}
			System.out.println(dataMap);
	}
}
