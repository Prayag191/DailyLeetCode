class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    
    ListNode(int val) {
        this.val = val;
    }
    
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int total = 0;
        int carry = 0;
        ListNode dummy = new ListNode();
        ListNode res = dummy;

        while (l1 != null || l2 != null || carry != 0) {
            total = carry;

            if (l1 != null) {
                total += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                total += l2.val;
                l2 = l2.next;
            }

            int num = total % 10;
            carry = total / 10;

            dummy.next = new ListNode(num);
            dummy = dummy.next;
        }

        return res.next;
    }

    // Helper method to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Helper method to create a linked list from an array
    public static ListNode createList(int[] arr) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        for (int num : arr) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Solution obj = new Solution();

        // Example: l1 = [2,4,3], l2 = [5,6,4]
        int[] a1 = {2, 4, 3}; // represents 342
        int[] a2 = {5, 6, 4}; // represents 465

        ListNode l1 = createList(a1);
        ListNode l2 = createList(a2);

        ListNode result = obj.addTwoNumbers(l1, l2); // should return 7 -> 0 -> 8

        System.out.print("Result: ");
        printList(result);
    }
}
