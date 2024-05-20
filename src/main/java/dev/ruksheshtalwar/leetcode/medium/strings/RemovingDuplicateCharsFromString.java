package dev.ruksheshtalwar.leetcode.medium.strings;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemovingDuplicateCharsFromString {

	public static void main(String[] args) {
		String str = "iamadadshdsjkh";
		System.out.println(removeDuplicate(str));
		
	}
	
	static String removeDuplicate(String str) {
		char[] chars = str.toCharArray();
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(char ch : chars) {
			set.add(ch);
		}
		
		StringBuffer sb = new StringBuffer();
		for(char c : set) {
			sb.append(c);
		}
		
		return sb.toString();
		
		
	}
}
