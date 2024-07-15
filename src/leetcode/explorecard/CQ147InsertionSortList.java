package src.leetcode.explorecard;

public class CQ147InsertionSortList {


    private static ListNode insertionSortLL(ListNode head) {
        ListNode sentinelHead = new ListNode(); // new list -> val=null & next=null
        ListNode currentNode = head; // points to original given list
        ListNode prevNode, nextNode;

        while (currentNode != null) {
            // begin search from the head
            prevNode = sentinelHead;

            // find the position to insert the current node
            while (prevNode.next != null && prevNode.next.val <= currentNode.val) {
                prevNode = prevNode.next;
            }

            nextNode = currentNode.next;
            // insert the current node to the new list
            currentNode.next = prevNode.next;
            prevNode.next = currentNode;

            // moving on to the next iteration
            currentNode = nextNode;
        }
        return sentinelHead.next;
    }


    public static void main(String[] args) {
        ListNode fourth = new ListNode(9);
        ListNode third = new ListNode(8, fourth);
        ListNode second = new ListNode(6, third);
        ListNode head = new ListNode(10, second);
        head = insertionSortLL(head);
        System.out.println(head.val);
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
