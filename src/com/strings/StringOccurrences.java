package com.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class StringOccurrences {

	public static void main(String[] args) {
		String str = "To be or not to be";
		String[] strArr = str.split(" ");
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String s : strArr) {
			Integer count = map.get(s);
			
			if (count == null) {
				map.put(s, 1);
			}else {
				map.put(s, ++count);
			}
		}

		Set<Entry<String, Integer>> set = map.entrySet();
		for (Entry<String, Integer> entries: set) {
			System.out.println(entries.getKey() + " " + entries.getValue());
		}
	}
}
