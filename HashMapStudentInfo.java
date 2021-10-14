package pratices_prblms;

import java.util.HashMap;

public class HashMapStudentInfo {

	public static void main(String[] args) {
		HashMap<Integer , String> dataMap = new HashMap<>();
		dataMap.put(1,"Devi");
		dataMap.put(2,"Harish");
		dataMap.put(3,"Kusuma");
		dataMap.put(4,"Nagesh");
		dataMap.put(5,"Sujitha");
		
		for(Integer key : dataMap.keySet()) {
			System.out.println(dataMap.get(key));
		}
	}

}
