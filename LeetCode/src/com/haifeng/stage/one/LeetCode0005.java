package com.haifeng.stage.one;

import org.junit.Test;

public class LeetCode0005 {

	public String longestPalindrome(String s) {
        
		String longestStr = "";
		int longestStrLength = -1;
		String tempPalindStr = "";
		
		for (int palindromeLength = 2; palindromeLength <= s.length(); palindromeLength++) {
			
			for(int index = 0; index < s.length() - palindromeLength + 1; index++){
				
				if(isPalindrome((tempPalindStr = s.substring(index, index + palindromeLength)))) {
					
					if(tempPalindStr.length() > longestStrLength) {
						
						longestStr = tempPalindStr;
						longestStrLength = longestStr.length();
						
					}
					
				}
				
			}
			
		}
		
		if(longestStr.equals("")) {
			
			return s.charAt(0) + "";
			
		}
		
		return longestStr;
		
    }
	
	public boolean isPalindrome(String s) {
		
		boolean flag = true;
		
		int sLength = s.length();
		
		int medianIndex = (sLength - 1) / 2;
		
		for(int i = 0; i <= medianIndex; i++) {
			
			if(!("" + s.charAt(i)).equals("" + s.charAt(sLength - i - 1))) {
				
				flag = false;
				break;
				
			}
			
		}
		
		return flag;
	}
	
	@Test
	public void testIsPalindrome() {
		
		System.out.println(longestPalindrome("anugnxshgonmqydttcvmtsoaprxnhpmpovdolbidqiyqubirkvhwppcdyeouvgedccipsvnobrccbndzjdbgxkzdbcjsjjovnhpnbkurxqfupiprpbiwqdnwaqvjbqoaqzkqgdxkfczdkznqxvupdmnyiidqpnbvgjraszbvvztpapxmomnghfaywkzlrupvjpcvascgvstqmvuveiiixjmdofdwyvhgkydrnfuojhzulhobyhtsxmcovwmamjwljioevhafdlpjpmqstguqhrhvsdvinphejfbdvrvabthpyyphyqharjvzriosrdnwmaxtgriivdqlmugtagvsoylqfwhjpmjxcysfujdvcqovxabjdbvyvembfpahvyoybdhweikcgnzrdqlzusgoobysfmlzifwjzlazuepimhbgkrfimmemhayxeqxynewcnynmgyjcwrpqnayvxoebgyjusppfpsfeonfwnbsdonucaipoafavmlrrlplnnbsaghbawooabsjndqnvruuwvllpvvhuepmqtprgktnwxmflmmbifbbsfthbeafseqrgwnwjxkkcqgbucwusjdipxuekanzwimuizqynaxrvicyzjhulqjshtsqswehnozehmbsdmacciflcgsrlyhjukpvosptmsjfteoimtewkrivdllqiotvtrubgkfcacvgqzxjmhmmqlikrtfrurltgtcreafcgisjpvasiwmhcofqkcteudgjoqqmtucnwcocsoiqtfuoazxdayricnmwcg"));
		
	}
	
}
