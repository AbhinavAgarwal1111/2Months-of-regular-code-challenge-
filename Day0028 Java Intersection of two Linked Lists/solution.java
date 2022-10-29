public class solution {
  public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    ListNode copyA = headA;
    ListNode copyB = headB;
    while (copyA != copyB) {
      copyA = copyA == null ? headB : copyA.next;
      copyB = copyB == null ? headA : copyB.next;
    }
    return copyA;
  }
}