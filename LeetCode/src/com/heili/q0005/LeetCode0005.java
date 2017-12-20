package com.heili.q0005;

import org.junit.Test;

/*
 * 
 * Description:
 *	Given a string s, find the longest palindromic substring in s. 
 *	You may assume that the maximum length of s is 1000.
 * 
 */

public class LeetCode0005 {

	public String longestPalindrome(String s) {
		
		int longestPalindromeLength = -1;
		int leftIndex = 0;
		int rightIndex = 0;
		
		boolean[][] pdFlag = new boolean[s.length()][s.length()];
		
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j <= i; ++j) {
				
				pdFlag[j][i] = (j == i) || (j + 1 == i && (s.charAt(j) == s.charAt(i))) || ((s.charAt(j) == s.charAt(i)) && (pdFlag[j + 1][i - 1]));
				
				if (pdFlag[j][i] && longestPalindromeLength < i - j + 1) {
					
					longestPalindromeLength = i - j + 1;
					
					leftIndex = j;
					rightIndex = i;
					
				}
				
			}
			
		}
		
		return s.substring(leftIndex, rightIndex + 1);
		
	}
	
	@Test
	public void testLongestPalindrome() {
		
		String s = "aa";
		
		System.out.println(longestPalindrome(s));
		
	}
	
}
