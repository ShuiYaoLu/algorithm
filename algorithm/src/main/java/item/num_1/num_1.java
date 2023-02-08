package item.num_1;

/**
 * @Description
 * @create 2023/2/6 15:42:37
 * @Author by zhaoxiaodong
 */

import java.util.Scanner;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target 的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 * 提示：
 * 2 <= nums.length <= 10⁴
 * -10⁹ <= nums[i] <= 10⁹
 * -10⁹ <= target <= 10⁹
 * 只会存在一个有效答案
 * 进阶：你可以想出一个时间复杂度小于 O(n²) 的算法吗？
 */
public class num_1 {

    /**
     * 解题思路写清楚,我需要看明白你的想法
     * ACM在结束之后会让你们出题解，我不需要你写详尽的题解，但是需要你把解题思路写到让我能看明白
     * LeetCode第一题，今天先练个简单的
     * 注意：
     * 1、你参数和方法的命名要让我看懂
     * 2、不要让idea给你报一些低级错误
     * 3、这题相当简单，写完去LeetCode上提交一下试试，看看自己有没有漏掉的情况
     *
     * @param nums   源数组
     * @param target 目标数据
     * @return int[]
     */

    public static int[] towSum(int[] nums, int target) {
        // 在这里实现你的算法
        int n = nums.length;//取nums数组的长度

        // 你这样不会数组越界么？数组长度是5的话， num.length的值是5，但是你的下标最大是4，正确遍历数组应该是 i< n-1
        // 你这里用++i的用意我也不是很理解，建议你搜一下i++和++i的区别，然后贴到这里
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    // 我没看明白你的算法啥意思，所以我也没理解为啥你要在这返回，建议你先把思路写到下面，然后我可以按照你的思路捋你的代码
                    return new int[]{i};//不知道返回什么结果
                }
            }
        }
        return null;
    }

    //在这运行
    public static void main(String[] args) {
        int[] nums1;
        int target1;//不知道怎么输入nums1数组和target1的值

        // 输入不需要你现在通过键盘输入，你只需要显式的在代码里初始化你的输入数据即可
        // 你就这么写：
        // int[] nums1 = {1,2,3};
        // int target1 = 2;

        // 从键盘录入在下面给你写了个例子，你抄过来直接用就好

        // 关于这里为啥会报红，因为你的变量定义之后没有初始化，想想我给你说的关于初始化的内容，必须要在物理内存里真的申请了空间才能使用
        // 把鼠标放到红线上你就看见错误信息了Variable 'target1' might not have been initialized

        // 这个方法的返回值是个数组，你又使用一个int类型来接他的返回值，我不是很理解，
        // 我觉得是你没理解Java里的方法，这块你看下是不是还需要给你讲一下
        // 我寻思你学过C语言的话应该能懂Java里的方法，但是现在看你这行代码我感觉你没懂
        int h = towSum(nums1, target1);
        int g = h + 1;

        // 直接把数组放这里就会带着方括号，你可以自己试试
        System.out.println("[" + h + "," + g + "]");
    }

    /**
     * 在这写你的题解：两次遍历使数组中所有的数进行相加
     *问题：如果让数组存入hash表
     */

    /**
     * 在这里教给你怎么从键盘录入数据
     *
     * Scanner scanner = new Scanner(System.in);
     * int i = scanner.nextInt();
     *
     */
}
