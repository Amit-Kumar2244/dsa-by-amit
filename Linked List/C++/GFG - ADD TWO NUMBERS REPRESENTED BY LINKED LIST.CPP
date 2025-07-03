// GFG - Add Two Numbers Represented by Linked Lists
// QUESTION LINK - https://www.geeksforgeeks.org/problems/add-two-numbers-represented-by-linked-lists/1

class Solution {
public:
    Node* reverseLL(Node* head)
    {
        Node* next = NULL;
        Node* temp = head;
        Node* prev = NULL;
        while(temp != NULL)
        {
            next = temp->next;
            temp->next = prev;
            prev = temp;
            temp = next;
        }
        return prev;
    }

    Node* addTwoLists(Node* num1, Node* num2) {
        num1 = reverseLL(num1);
        num2 = reverseLL(num2);
        Node* ans = new Node(0);
        Node* ansCur = ans;
        int carry = 0;

        while(num1 != NULL || num2 != NULL || carry)
        {
            int sum = 0;
            if(num1 != NULL)
            {
                sum += num1->data;
                num1 = num1->next;
            }
            if(num2 != NULL)
            {
                sum += num2->data;
                num2 = num2->next;
            }
            sum += carry;
            Node* newNode = new Node(sum % 10);
            carry = sum / 10;
            ansCur->next = newNode;
            ansCur = ansCur->next;
        }

        ansCur = reverseLL(ans->next);
        delete ans; // cleanup dummy node

        // Remove leading zeros
        while(ansCur != NULL && ansCur->data == 0 && ansCur->next != NULL)
        {
            Node* temp = ansCur;
            ansCur = ansCur->next;
            delete temp;
        }

        return ansCur;
    }
};
