
//删除排序数组中的重复项
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