package com.heili.q0008;

import org.junit.Test;

/*
 *	Description:
 * 		Implement atoi to convert a string to an integer.
 *		Hint: Carefully consider all possible input cases. If you want a challenge, please do not see below and ask yourself what are the possible input cases.
 *		Notes: It is intended for this problem to be specified vaguely (ie, no given input specs). You are responsible to gather all the input requirements up front.
 *			1. ���ַ�����ͷ�ǿո����������пո񣬵���һ���ǿո��ַ������û�У��򷵻�0.
 *			2. ����һ���ǿո��ַ��Ƿ���+/-������sign����٣�����⻹�и������ԣ��Ǿ�����c++���棬+-1��-+1�����Ͽɵģ�����-1�����ڴ������᷵��0.
 *			3. ����һ���ַ��������֣��򷵻�0. ��ȫ������С�������Ȼ�����������������Ҳ�ã�����ʡ���˲��١�
 *			4. �����һ���ַ������֣���תΪ���δ������������������з����ֳ��֣��򷵻�Ŀǰ�Ľ����
 *			5. ����Ҫ���Ǳ߽����⣬����������������ķ�Χ�����ñ߽�ֵ�����ǰֵ��
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
		
		//����ĸ����
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
