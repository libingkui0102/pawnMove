package site.wentailai.example.pawnMove.simplesample.interview.leetcode;

/**
 * User: libingkui
 * Date: 2020/9/23
 * Description:
 * 给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现了三次。找出那个只出现了一次的元素。
 *
 * 说明：
 *
 * 你的算法应该具有线性时间复杂度O(n)。 使用o(1)的空间
 */
public class SingleNumber2 {
    public int singleNumber(int[] arr) {
        int seenOnce = 0;
        int seenTwice = 0;
        for(int num: arr) {
            seenOnce = ~seenTwice & (seenOnce ^ num);
            seenTwice = ~seenOnce & (seenTwice ^ num);
        }
        return seenOnce;
    }

    public static void main(String[] args) {
        SingleNumber2 s = new SingleNumber2();
        System.out.println(
                s.singleNumber(new int[]{1, 1, 1, 2, 2, 2, 20})
        );
    }
}
