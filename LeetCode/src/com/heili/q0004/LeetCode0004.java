package com.heili.q0004;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class LeetCode0004 {

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		List<Integer> sortedList = new ArrayList<>();
		
		int cursor1 = 0;
		int cursor2 = 0;
		
		int nums1Size = nums1.length;
		int nums2Size = nums2.length;
		
		int medianIndex = (nums1Size + nums2Size - 1) / 2;
		
		while((cursor1) < nums1Size && cursor2 < nums2Size) {
			
			if (nums1[cursor1] < nums2[cursor2]) {
				
				sortedList.add(nums1[cursor1]);
				cursor1++;
			} else if (nums1[cursor1] == nums2[cursor2]) {
				
				sortedList.add(nums1[cursor1]);
				sortedList.add(nums2[cursor2]);
				cursor1++;
				cursor2++;
				
			} else {
				
				sortedList.add(nums2[cursor2]);
				cursor2++;
				
			}
			
			
		}
		
		if (cursor1 <= nums1Size - 1) {
			
			for(int i = cursor1; i < nums1Size; i++) {
				
				sortedList.add(nums1[i]);
				
				
			}
			
		}
		
		if (cursor2 <= nums2.length - 1) {
			
			for(int i = cursor2; i < nums2Size; i++) {
				
				sortedList.add(nums2[i]);
				
			}
			
		}
		
		if((nums1Size + nums2Size) % 2 == 0){
			
			return (sortedList.get(medianIndex) + sortedList.get(medianIndex + 1)) * 1.0 / 2;
			
		} else {
			
			return sortedList.get(medianIndex) * 1.0;
			
		}
	
	}
	
	@Test
	public void testFindMedianSortedArrays() {
		
		int[] nums1 = new int[]{1, 3};
		int[] nums2 = new int[]{2};
		
		System.out.println(findMedianSortedArrays(nums1, nums2));
		
		int[] nums3 = new int[]{1, 5, 8};
		int[] nums4 = new int[]{3};
		
		System.out.println(findMedianSortedArrays(nums3, nums4));
		
	}
	
}
