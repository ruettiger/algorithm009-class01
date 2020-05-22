//1.删除排序数组中的重复项
//自己实现的版本：1.边界没有分析清楚 2.条件运用不得当
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = j + 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                if (i > j) {
                    nums[j + 1] = nums[i];
                }
                j++;
            }
        }
        return j+1;
    }
}
//删除排序数组中的重复项
//通过五毒神掌之后的默写版本
class Solution {
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return j+1;
    }
}

//2.数组翻转
//自己实现的版本：只想到了暴力破解方案
class Solution {
    public void rotate(int[] nums, int k) {
        for (int i = 0; i < k; i++) {
            int temp = nums[nums.length - 1];
            for (int j = nums.length - 1 ; j > 0; j--) {
                nums[j] = nums[j-1];
            }
            nums[0] = temp;
        }
    }
}

//3.合并两个有序链表 暴力解法
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        ListNode l3 = null;
        if (l1.val > l2.val) {
            l3 = new ListNode(l2.val);
            l2 = l2.next;
        } else {
            l3 = new ListNode(l1.val);
            l1 = l1.next;
        }
        ListNode currentNode = l3;
        while (l1 != null && l2 != null) {
            if (l1.val > l2.val) {
                while (currentNode.next != null){
                    currentNode = currentNode.next;
                }
                currentNode.next = new ListNode(l2.val);
                l2 = l2.next;
            } else {
                while (currentNode.next != null){
                    currentNode = currentNode.next;
                }
                currentNode.next = new ListNode(l1.val);
                l1 = l1.next;
            }
        }
        while (l1 != null) {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new ListNode(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            while (currentNode.next != null){
                currentNode = currentNode.next;
            }
            currentNode.next = new ListNode(l2.val);
            l2 = l2.next;
        }
        return l3;
    }
}

//两数之和
class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0;i<nums.length;++i){
            for(int j=i+1;j<nums.length;++j){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

//移动零
class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                j++;
            }
        }
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}