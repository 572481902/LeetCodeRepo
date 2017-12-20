package com.haifeng.stage.one;

public class LeetCode0006 {

	public static String convert(String s, int numRows) {
        
		String[][] result = new String[1000][1000];
		
		//ÿһ����ַ�����
		int groupSize = (numRows == 1 ? numRows : (2 * numRows - 2));
		int groupCow = (numRows > 2 ? numRows -1 : 1);
		
		int row, col;
		
		for (int i = 0, j = 0; i < s.length() ; i++) {
			
			while (i >= groupSize * j) {
				
				++j;
				
			}
			
			//������, 0��ʼ
			int groupIndex = --j;
			
			//����ƫ����, 0��ʼ
			int groupOffset = i % groupSize;
			
			//���������к���
			if(groupOffset + 1 <= numRows) {
				
				row = groupOffset;
				col = groupIndex * groupCow;
				
			} else {
				
				//row = numRows - (groupOffset - numRows) + 1;
				row = numRows - 1 - (groupOffset - numRows + 1);
				col = groupIndex * groupCow + 1 + (groupOffset - numRows);
				
			}
			
			System.out.println(s.charAt(i) + "---" + row + "---" + col);
			
			result[row][col] = "" + s.charAt(i);
			
		}
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++){
			
			for (int j = 0; j < s.length(); j++) {
				
				if(result[i][j] != null && !result[i][j].equals("")) {
					
					sb.append(result[i][j]);
					
				}
				
			}
			
		}
		
		return sb.toString();
	
	}
	
	public static void main(String[] args) {
		
		System.out.println(convert("ABCDE", 3));
		
	}
	
}
