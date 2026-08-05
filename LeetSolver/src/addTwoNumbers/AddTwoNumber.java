package addTwoNumbers;

import java.util.*;

class ListNode{
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

class Solution {
    public ListNode sol(ListNode l1, ListNode l2) {

        //initializing head and carry objects;
        ListNode lHead = new ListNode(0);
        // To represent where the point is. we used a variable current;
        ListNode current = lHead;
        int carry = 0;
        int x, y;

        // iterating over the Linked List.
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                x = l1.val;
            } else {
                x = 0;
            }
            if (l2 != null) {
                y = l2.val;
            } else {
                y = 0;
            }

            int sum = x + y + carry;
            carry = sum / 10; // 15+89 -> 9+5=14,--vv

            // This variable is used to put the value of 1s part
            // 15+89 -> 9+5 = 14, the one's (4) part of this number should be added to node
            // and ten's (1) part should be the carry.
            // this is the part of the sum that stays in the current column, while carry is the part that moves to the next.
            int NodeDigit = sum % 10;

            // Create the new node and attach it to the result list
            // current acts like a pointer. initially is was holding head (lHead). we have updated it now.

            current.next = new ListNode(NodeDigit);
            // to update a pointer current location.
            current = current.next;

            //checking is the list is still has data or not.
            if (l1 != null) {
                l1 = l1.next;
            }

            if (l2 != null) {
                l2 = l2.next;
            }

        }

        // after the summation, if list holds a carry still. Then, we have to create a new node
        if (carry > 0) {
            current.next = new ListNode(carry);
        }
        return lHead.next;
    }
}
public class AddTwoNumber {

    public static void printList(ListNode listNode){
        System.out.print("[");
        while (listNode != null){
            System.out.print(listNode.val);
            if(listNode.next != null){
                System.out.print(", ");
            }
            listNode = listNode.next;
        }
        System.out.print("]");
    }


    static void main() {

        //We can either do like this.
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

//        //Or like this, by using for loop
//        // initialized head and pointer(current)
//        ListNode headNode = new ListNode(0);
//        ListNode current = headNode;
//
//        int[] values = new int[100];
//        for(int i=0;i<values.length;i++){
//
//            // Storing each values of node in val variable
//            int val = values[i];
//
//            // storing the val in ListNodes
//            current.next= new ListNode(val);
//
//            //pointing towards next node
//            current = current.next;
//        }

        Solution finalAnswer = new Solution();

        printList(l1);
        System.out.println("");
        printList(l2);
        System.out.println("");
        ListNode result = finalAnswer.sol(l1, l2);
        printList(result);

    }

}
