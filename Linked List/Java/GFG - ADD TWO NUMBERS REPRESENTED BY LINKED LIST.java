// GFG - Add Two Numbers Represented by Linked Lists
// QUESTION LINK - https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

class Solution {

    Node reverseLL(Node head) {
        Node prev = null;
        Node temp = head;
        Node next = null;

        while (temp != null) {
            next = temp.next;
            temp.next = prev;
            prev = temp;
            temp = next;
        }

        return prev;
    }

    Node addTwoLists(Node num1, Node num2) {
        num1 = reverseLL(num1);
        num2 = reverseLL(num2);

        Node ans = new Node(0);
        Node ansCur = ans;
        int carry = 0;

        while (num1 != null || num2 != null || carry != 0) {
            int sum = 0;

            if (num1 != null) {
                sum += num1.data;
                num1 = num1.next;
            }

            if (num2 != null) {
                sum += num2.data;
                num2 = num2.next;
            }

            sum += carry;
            Node newNode = new Node(sum % 10);
            carry = sum / 10;

            ansCur.next = newNode;
            ansCur = ansCur.next;
        }

        ansCur = reverseLL(ans.next);
        ans.next = null; // Help GC clean up the dummy node

        // Remove leading zeros
        while (ansCur != null && ansCur.data == 0 && ansCur.next != null) {
            ansCur = ansCur.next;
        }

        return ansCur;
    }
}
