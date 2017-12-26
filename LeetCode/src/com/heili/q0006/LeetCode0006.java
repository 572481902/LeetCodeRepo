package com.heili.q0006;

import org.junit.Test;

/*
 *	Description:
 *		The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
 *		(you may want to display this pattern in a fixed font for better legibility)
 */
public class LeetCode0006 {

	public String convert(String s, int numRows) {

		if (numRows == 1) {
			
			return s;
			
		}
		
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < numRows; ++i) {

			for (int j = 0; j <= Math.ceil(s.length() / (2 * numRows - 2)); ++j) {

				if ((i + (numRows - 1) * 2 * j) < s.length()) {

					sb.append(s.charAt(i + (numRows - 1) * 2 * j));

				}
					
				if (!(i == 0 || i == numRows - 1) && i + ((numRows - i - 1) * 2) + ((numRows - 1) * 2 * j) < s.length()) {

					sb.append(s.charAt(i + ((numRows - i - 1) * 2) + ((numRows - 1) * 2 * j)));

				}
			}
		}

		return sb.toString();

	}

	
	@Test
	public void testConvert() {

		System.out.println(convert("PAYPALISHIRING", 3));

	}

}
