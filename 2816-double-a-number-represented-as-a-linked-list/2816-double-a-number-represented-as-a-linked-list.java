/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode doubleIt(ListNode head) {
        if(head.val==0){
            return new ListNode(0);
        }
        ArrayList<Integer> list = new ArrayList<>();
        
        ListNode temp = head;
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }
        // traverse the linked list
        int number = 0;
        for(int i = 0;i<list.size();i++){
            number = number *10+list.get(i);//add the numnber to

        }
        number = number *2;// double the numebr not return back as linkedlist
        int reversedNumber = 0;
        
        while (number != 0) {
            int digit = number % 10;  // Extract the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Append the digit to the reversed number
            number /= 10;  // Move to the next digit in the original number
        }
        ListNode dummy= new ListNode(0);
        ListNode current = dummy;
        number = reversedNumber;
        while(number>0){
            int value = number %10;
            ListNode node = new ListNode(value);
            current.next = node;
            current = current.next;
            number = number /10;
        }
        return dummy.next;
    }
}