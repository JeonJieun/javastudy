package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, Integer> m = new HashMap<>(); // key 불변, 중복x

		String ks1 = "one";
		m.put(ks1, 1); // auto boxing
		m.put("two", 2);
		m.put("three", 3);

		int i = m.get("one"); // auto unboxing
		int j = m.get(new String("one"));
		System.out.println(i + ":" + j);

		System.out.println();
		
		m.put("three", 333333);
		System.out.println(m.get("three"));
		
		System.out.println();
		
		// 순회
		Set<String> s = m.keySet();
		for(String key : s) {
			System.out.println(m.get(key));
		}
		
		
		
	}

}
