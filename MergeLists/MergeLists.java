package AISD_HW.MergeLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeLists {
    public static void main(String[] args) {
        ListNode[] lists = {
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode fff = Solution.mergeKLists(lists);
        while(fff != null) {
            arr.add(fff.val);
            fff = fff.next;
        }
        System.out.println(arr);
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {
        this.val = val;
    }
    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

class Solution {
    public static ListNode mergeKLists(ListNode[] lists) {
        List<Integer> arr = new ArrayList<>();
        for (ListNode check : lists) {
            while (check != null) {
                arr.add(check.val);
                check = check.next;
            }
        }

        Collections.sort(arr);

        ListNode head = new ListNode(0);
        ListNode b = head;
        for (int i : arr) {
            ListNode t = new ListNode(i);
            b.next = t;
            b = b.next;
        }
        b.next = null;
        return head.next;
    }
}
