package com.heili.q0008;

import org.junit.Test;

/*
 *	Description:
 * 		Implement atoi to convert a string to an integer.
 *		Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *		Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *			1. 若字符串开头是空格，则跳过所有空格，到第一个非空格字符，如果没有，则返回0.
 *			2. 若第一个非空格字符是符号+/-，则标记sign的真假，这道题还有个局限性，那就是在c++里面，+-1和-+1都是认可的，都是-1，而在此题里，则会返回0.
 *			3. 若下一个字符不是数字，则返回0. 完全不考虑小数点和自然数的情况，不过这样也好，起码省事了不少。
 *			4. 如果下一个字符是数字，则转为整形存下来，若接下来再有非数字出现，则返回目前的结果。
 *			5. 还需要考虑边界问题，如果超过了整形数的范围，则用边界值替代当前值。
 */

public class LeetCode0008 {

	public int myAtoi(String str) {

		int i = 0;
		String sign = "";
		String resultStr = "";
		
		str = str.trim();
		
		if (str == null || str.trim().equals("")) {
			
			return 0;
			
		}
		
		//首字母变量
		String initials = Character.toString(str.charAt(0));
		if ("+".equals(initials) || "-".equals(initials)) {
			
			sign = initials;
			
			++i;
			
		}
		
		for ( ; i < str.length(); ++i) {
			
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				
				String tempResStr = resultStr + Character.toString(str.charAt(i));
				
				if (Long.parseLong(sign + tempResStr) > Integer.MAX_VALUE) {
					
					return Integer.MAX_VALUE;
					
				}
				
				if (Long.parseLong(sign + tempResStr) < Integer.MIN_VALUE) {
					
					return Integer.MIN_VALUE;
					
				}
				
				resultStr += Character.toString(str.charAt(i));
				
			} else {
				
				break;
				
			}
			
		}
		
		if (resultStr == "") return 0;
		
		return Integer.parseInt(sign + resultStr.trim());
		
	}

	
	@Test
	public void testMyAtoi() {
		
		System.out.println(myAtoi("2147483648"));
		
	}
	
}
