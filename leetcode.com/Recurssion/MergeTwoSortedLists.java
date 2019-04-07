package Recursion;

public class MergeTwoSortedLists 
{
	public ListNode mergeTwoLists(ListNode a, ListNode b) 
    {
          ListNode result = null; 
  
          /* Base cases */
          if (a == null)  
          {
              return(b); 
          }
          else if (b == null)  
          {
              return(a); 
          }

          /* Pick either a or b, and recur */
          if (a.val <= b.val)  
          { 
             result = a; 
             result.next = mergeTwoLists(a.next, b); 
          } 
          else 
          { 
             result = b; 
             result.next = mergeTwoLists(a, b.next); 
          } 
          return(result);
    }
}
