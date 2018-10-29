// simple array random
class Solution {

  List<Integer> list = new ArrayList<>();
  Random r = new Random(System.currentTimeMillis());

  /**
   * @param head The linked list's head. Note that the head is guaranteed to be not null, so it contains at least one
   * node.
   */
  public Solution(ListNode head) {
      while (head != null) {
          list.add(head.val);
          head = head.next;
      }
  }

  /**
   * Returns a random node's value.
   */
  public int getRandom() {
      return list.get(r.nextInt(list.size()));
  }
}


// reservior sampling 
class Solution {

  Random r = new Random(System.currentTimeMillis());
  ListNode head;

  /**
   * @param head The linked list's head. Note that the head is guaranteed to be not null, so it contains at least one
   * node.
   */
  public Solution(ListNode head) {
      this.head = head;
  }

  /**
   * Returns a random node's value.
   */
  public int getRandom() {
      ListNode node = head;
      int res = node.val;
      for (int i = 1; node != null; i++) {
          int j = r.nextInt(i);
          if (j == 0) {
              res = node.val;
          }
          node = node.next;
      }
      return res;
  }
