package site.wentailai.example.pawnMove.simplesample.interview.leetcode;

/**
 * User: libingkui
 * Date: 2020/9/26
 * Description:
 *
 * You are climbing a stair case. It takes n steps to reach to the top.
 *
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 *
 * Example 1:
 *
 * Input: 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * Example 2:
 *
 * Input: 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 *  
 *
 * Constraints:
 *
 * 1 <= n <= 45
 *
 */
public class ClimbStairs {
    public int climbStairs(int n) {
        int max2 = n / 2;
        int count = 1;
        for(int twoNumber = 1; twoNumber <= max2; twoNumber++) {
            int oneNumber = n - twoNumber * 2;
            for(int i = 0; i < oneNumber; i++) {
                for(int j = twoNumber; j > 0; j--) {
                    count = count + oneNumber - j + 1;
                }
            }

        }
        return count;
    }

    public static void main(String[] args) {
        ClimbStairs c = new ClimbStairs();
        System.out.println(c.climbStairs(3));
    }
}
