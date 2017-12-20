package com.heili.q0001;

import java.util.HashMap;
import java.util.Map;

/*
 * Description:
 * 	Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *	You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * 
 */
public class LeetCode0001 {

	public int[] twoSum(int[] nums, int target) {
        
		Map<Integer, Integer> numsMap = new HashMap<>();
		
		int index = 0;
		for (Integer num : nums) {
			
			numsMap.put(num, index++);
			
		}
		
		for (int i = 0; i < nums.length; ++i) {
			
			int temp = target - nums[i];
			
			if (numsMap.containsKey(temp) && numsMap.get(temp) != i) {
				
				return new int[]{numsMap.get(temp), i};
				
			}
			
		}
		
		return null;
		
    }
	
}
