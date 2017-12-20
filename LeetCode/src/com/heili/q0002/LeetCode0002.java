package com.heili.q0002;

import org.junit.Test;

class ListNode {
	int val;
	ListNode next;
	ListNode(int x) {
		val = x;
	}
}

public class LeetCode0002 {

	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode cursor1 = l1;
		ListNode cursor2 = l2;
		ListNode resultListNode = null;
		ListNode resultCursor = null;
		
		boolean firstFlag = true;


		// 记录是否产生进位
		int flag = 0;
		while (cursor1 != null && cursor2 != null) {

			if (firstFlag) {

				resultListNode = new ListNode((cursor1.val + cursor2.val + flag) % 10);
				resultCursor = resultListNode;
				
				flag = flag + cursor1.val + cursor2.val >= 10 ? 1 : 0;
				
				cursor1 = cursor1.next;
				cursor2 = cursor2.next;
				
				firstFlag = false;
				
				continue;
				
			}

			resultCursor.next = new ListNode((cursor1.val + cursor2.val + flag) % 10);
			resultCursor = resultCursor.next;
			
			flag = flag + cursor1.val + cursor2.val >= 10 ? 1 : 0;

			cursor1 = cursor1.next;
			cursor2 = cursor2.next;
			
		}

		while (cursor1 != null) {

			resultCursor.next = new ListNode((cursor1.val + flag) % 10);

			flag = flag + cursor1.val >= 10 ? 1 : 0;

			cursor1 = cursor1.next;
			resultCursor = resultCursor.next;
		}

		while (cursor2 != null) {

			resultCursor.next = new ListNode((cursor2.val + flag) % 10);

			flag = flag + cursor2.val >= 10 ? 1 : 0;

			cursor2 = cursor2.next;
			resultCursor = resultCursor.next;
		}

		if (flag == 1) {
			
			resultCursor.next = new ListNode(flag);
			
		}
		
		return resultListNode;
	}

	@Test
	public void testAddTwoNumbers() {
		
		ListNode node2 = new ListNode(4);
		ListNode node3 = new ListNode(3);
		
		ListNode node5 = new ListNode(6);
		ListNode node6 = new ListNode(4);
		
		ListNode l1 = new ListNode(2);
		l1.next = node2;
		node2.next = node3;
		
		ListNode l2 = new ListNode(5);
		l2.next = node5;
		node5.next = node6;
		
		ListNode resultCursor = addTwoNumbers(l1, l2);
		
		while (resultCursor != null) {
			
			if (resultCursor.next == null) {
				
				System.out.print(resultCursor.val);
				
			} else {
				
				System.out.print(resultCursor.val + "-->");
				
			}
			
			resultCursor = resultCursor.next;
			
		}
		
	}
	
}
