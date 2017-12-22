package com.heili.q0007;

import org.junit.Test;

public class LeetCode0007 {

	public int reverse(int x) {
        
		int result = 0;
		int number = x;
		
		while (Math.abs(number) > 0) {
			
			int temp = number % 10;
			
			if (Math.abs(result) > Integer.MAX_VALUE / 10) {
				
				return 0;
				
			}

			result = result * 10 + temp;
			
			number = number / 10;
			
		}
		
		return result;
		
    }
	
	
	@Test
	public void testReverse() {
		
		System.out.println(reverse(-1563847412));
	
	}
	
}
