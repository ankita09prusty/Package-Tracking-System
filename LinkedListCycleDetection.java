import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}

public  class LinkedListCycleDetection {

    public static boolean hasCycle(ListNode head) {
        // Create a HashSet to store visited nodes
        HashSet<ListNode> visited = new HashSet<>();

        // Traverse the linked list
        while (head != null) {
            // If the current node is already visited, there's a cycle
            if (visited.contains(head)) {
                return true;
            }
            // Add the current node to the HashSet
            visited.add(head);
            // Move to the next node
            head = head.next;
        }

        // If the loop completes without finding a cycle, return false
        return false;
    }

    public static void main(String[] args) {
        // Create linked list for Example 1
        ListNode head1 = new ListNode(20);
        head1.next = new ListNode(30);
        head1.next.next = new ListNode(40);
        head1.next.next.next = new ListNode(60);
        head1.next.next.next.next = new ListNode(80);
        // Create a cycle
        head1.next.next.next.next.next = head1.next.next;

        // Create linked list for Example 2
        ListNode head2 = new ListNode(6);
        head2.next = new ListNode(4);
        head2.next.next = new ListNode(2);
        head2.next.next.next = new ListNode(8);

        // Check for cycles and print the result
        System.out.println("Example 1 Output: " + hasCycle(head1));
        System.out.println("Example 2 Output: " + hasCycle(head2));
    }
}


