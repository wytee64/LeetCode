package medium;


class ListNode {
 int val;
      ListNode next;
      ListNode() {}
     ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
public class AddTwoNumbers_2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode temp = head;
        int carry = 0;

        while (l1 != null || l2 != null) {
            int num1 = 0;
            int num2 = 0;

            if (l1 != null) {
                num1 = l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                num2 = l2.val;
                l2 = l2.next;
            }

            int total = num1 + num2 + carry;
            carry = total / 10;

            ListNode newNode = new ListNode(total % 10);
            temp.next = newNode;
            temp = temp.next;
        }

        if (carry > 0) {
            temp.next = new ListNode(carry);
        }

        return head.next;
    }
}
