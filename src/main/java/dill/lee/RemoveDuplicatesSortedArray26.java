package dill.lee;

/**
 * 删除排序数组中的重复项
 *
 * @author krisjin on 2019/10/23
 * <pre>
 *  给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 *  不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 *  示例 1:
 *
 *  给定数组 nums = [1,1,2],
 *
 *  函数应该返回新的长度 2, 并且原数组 nums 的前两个元素被修改为 1, 2。
 *
 *  你不需要考虑数组中超出新长度后面的元素。
 *  示例 2:
 *
 *  给定 nums = [0,0,1,1,1,2,2,3,3,4],
 *
 *  函数应该返回新的长度 5, 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4。
 *
 *  你不需要考虑数组中超出新长度后面的元素。
 *  说明:
 *
 *  为什么返回数值是整数，但输出的答案是数组呢?
 *
 *  请注意，输入数组是以“引用”方式传递的，这意味着在函数里修改输入数组对于调用者是可见的。
 *
 *  你可以想象内部操作如下:
 *
 *  // nums 是以“引用”方式传递的。也就是说，不对实参做任何拷贝
 *  int len = removeDuplicates(nums);
 *
 *  // 在函数里修改输入数组对于调用者是可见的。
 *  // 根据你的函数返回的长度, 它会打印出数组中该长度范围内的所有元素。
 *  for (int i = 0; i < len; i++) {
 *      print(nums[i]);
 *  }
 *
 *  链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 *  </pre>
 */
public class RemoveDuplicatesSortedArray26 {

    /**
     * 首先注意数组是有序的，那么重复的元素一定会相邻。
     * <p>
     * 要求删除重复元素，实际上就是将不重复的元素移到数组的左侧。
     * 利用两个指针i, j,初始化值为0和1，当两个指针对应的值相等时，指针j+1，继续执行循环；
     * 而当两个指针对应的值不相等时，将指针i+1，并将指针j对应的值赋值给指针i，然后指针j+1，继续向下执行循环，直到循环结束。
     *
     * @param nums
     * @return
     */
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j];
            }
        }
        return i + 1;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
//        int[] nums = new int[]{0, 1, 2, 3, 4};
        RemoveDuplicatesSortedArray26 removeDuplicatesSortedArray26 = new RemoveDuplicatesSortedArray26();
        int i = removeDuplicatesSortedArray26.removeDuplicates(nums);
        System.err.println(i);
    }
}
