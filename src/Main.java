public class Main {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        Solution solution = new Solution();

        System.out.print("Input:  ");
        solution.printLinkedList(head);

        ListNode reversedHead = solution.reverseList(head);

        System.out.print("\nOutput: ");
        solution.printLinkedList(reversedHead);

    }
}