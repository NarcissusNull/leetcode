/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun getDecimalValue(head: ListNode?): Int {
        var cur: ListNode? = head
        var ans = 0
        while (cur != null) {
            ans = ans shl 1
            ans += cur.`val`
            cur = cur.next
        }
        return ans
    }
}
