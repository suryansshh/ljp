
class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true; // Empty list or single node list is a palindrome
        }

        ListNode current = head;
        Stack<Integer> stack = new Stack<>();

        // Push values of nodes into the stack
        while (current != null) {
            stack.push(current.val);
            current = current.next;
        }

        // Compare values from the stack with values from the list
        current = head;
        while (current != null) {
            int top = stack.pop();
            if (top != current.val) {
                return false; // Not a palindrome
            }
            current = current.next;
        }

        return true; // Palindrome
    }
}