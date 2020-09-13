package site.wentailai.example.pawnMove.simplesample.interview;

import java.util.HashMap;
import java.util.Map;

/**
 * User: libingkui
 * Date: 2020/9/13
 * Description: 给定一个整数数组arr，一个整数n。求arr中两数之和为n的两个下标。
 */
public class TwoSum {
    public static void main(String[] args) {
        TwoSum t = new TwoSum();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6};
        t.twoSum(arr, 7);

    }
    public int[] twoSum(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < arr.length; i++) {
            int t = n - arr[i];
            if(map.get(t) != null) {
                System.out.println(" " + i + ", " + map.get(t));
                return new int[]{i, map.get(t)};
            }
            else {
                map.put(arr[i], i);
            }
        }
        return null;
    }
}
