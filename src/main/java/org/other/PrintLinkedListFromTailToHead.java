package org.other;

import org.leetcode.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *  从尾到头反过来打印出每个结点的值。
 *
 *
 * </pre>
 */
public class PrintLinkedListFromTailToHead {


    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);

        node1.next = new ListNode(2);
        node1.next.next = new ListNode(3);

        List<Integer> nums = printListFromTailToHead(node1);
        nums.forEach(item -> {
            System.out.print(item + " ");
        });

    }

    public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        if (listNode != null) {
            ret.addAll(printListFromTailToHead(listNode.next));
            ret.add(listNode.val);
        }
        return ret;
    }
}