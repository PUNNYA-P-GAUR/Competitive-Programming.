/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    bool hasCycle(ListNode *head) {
        ListNode* A1=head;
        ListNode* A2=head;
        bool ans=false;
        while(A1!=NULL && A1->next!=NULL){
            A1=A1->next->next;
            A2=A2->next;
            if(A1==A2){
                return true;
            }
            // else{
            //     ans=false;
            // }
        }
        return false;
        
    }
};