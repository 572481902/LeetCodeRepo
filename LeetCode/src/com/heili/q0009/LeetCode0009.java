package com.heili.q0009;

import org.junit.Test;

/*
 *	Description:
 *		Determine whether an integer is a palindrome. Do this without extra space.
 */

public class LeetCode0009 {

	public boolean isPalindrome(int x) {
        
		int tempX = x;
		
		int resultX = 0;
		
		while (x > 0) {
			
			resultX = resultX * 10 + x % 10;
			
			x /= 10;
			
		}
		
		return resultX == tempX;
    }
	
	
	@Test
	public void testIsPalindrome() {
		
		System.out.println(isPalindrome(1321));
		
	}
}
