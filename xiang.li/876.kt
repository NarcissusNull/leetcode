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
    fun middleNode(head: ListNode?): ListNode? {
        var head: ListNode? = head
        val A: Array<ListNode?> = arrayOfNulls<ListNode>(100)
        var t = 0
        while (head != null) {
            A[t++] = head
            head = head.next
        }
        return A[t / 2]
    }
}
