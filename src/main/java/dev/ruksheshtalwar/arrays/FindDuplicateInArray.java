package dev.ruksheshtalwar.arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateInArray {
	
	//1st Solution -- worst time complexity O(n^2)
	private static void firstSolution(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i].equals(arr[j])) {
					System.out.println("duplicate elements :: " + arr[i]);
				}
			}
		}
	}
	
	//2nd Solution -- Hashset stores unique elements only -- time complexity O(n)
	private static void secondSolution(String[] arr){
		Set<String> set = new HashSet<String>();
		
		for (String language : arr) {
			if (set.add(language) == false) {
				System.out.println("Duplicate elements :: " + language);
			}
		}
	}
	
	//3rd Solution -- Hashmap
	private static void thirdSolution(String[] arr) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		for (String language : arr) {
			Integer count = map.get(language);
			if (count == null) 
				map.put(language, 1);
			else
				map.put(language, ++count);
			}
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println("Duplicate element :: " + entry.getKey());
			}
		}
		
		System.out.println(" ********* ");
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		}
	

	public static void main(String[] args) {
		
		String[] arr = {"Java", "C", "C++", "Python", "Ruby", "Java", "C"}; //We can also take array of integers and print duplicate numbers 
		
		firstSolution(arr);
		
		System.out.println("*********");
		
		secondSolution(arr);
		
		System.out.println("*********");
		
		thirdSolution(arr);
		
	}
}
