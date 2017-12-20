package com.heili.q0003;

import java.util.ArrayList;
import java.util.List;

public class LeetCode0003 {

public int lengthOfLongestSubstring(String s) {
		
		int longestSize = 0;
		int repIndex = 0;
		
		List<Character> charList = new ArrayList<Character>();
		List<Character> storeList = new ArrayList<Character>();
		
		int k = 0;
		for(int i = 0; i < s.length(); i++) {
			
			if (charList.contains(s.charAt(i))) {
				
				repIndex = storeList.lastIndexOf(s.charAt(i));
				i = repIndex;
				
				if (longestSize < charList.size()) {
					
					longestSize = charList.size();
					
				}
				
				charList.clear();
				
			} else {
				
				charList.add(s.charAt(i));
				
				if (k == i) {
					
					storeList.add(s.charAt(i));
					++k;
				}
				
			}
			
		}
		
		if (longestSize < charList.size()) {
			
			longestSize = charList.size();
			
		}
		
		return longestSize;
		
    }
	
}
