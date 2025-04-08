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
        StringBuilder sb = new StringBuilder();
        ListNode current = l1;
        while (current != null) {
            sb.append(current.val);
            current = current.next;
        }
        int num = Integer.parseInt(sb.toString());
        StringBuilder sb1 = new StringBuilder();


        ListNode current1 = l2;
        while (current1 != null) {
            sb1.append(current1.val);
            current1 = current1.next;
        }
        int num2 = Integer.parseInt(sb1.toString());

        return numberToLinkedList(num+num2);




    }
    public static ListNode numberToLinkedList(int number) {
        String numStr = String.valueOf(number);
        ListNode newnew = new ListNode(0);
        ListNode current = newnew;

        for (char digitChar : numStr.toCharArray()) {
            int digit = digitChar - '0';
            current.next = new ListNode(digit);
            current = current.next;
        }

        ListNode finalL = null;
        ListNode currenty = newnew.next;
        while (currenty != null) {
            ListNode nextTemp = currenty.next;
            currenty.next = finalL;
            finalL = currenty;
            currenty = nextTemp;
        }

        return finalL;
    }
}