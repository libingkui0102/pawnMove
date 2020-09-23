package site.wentailai.example.pawnMove.simplesample.interview;

/**
 * User: libingkui
 * Date: 2020/9/18
 * Description:
 */
public class SingleNumber {
    public int singleNum(int[] arr) {
        int n = 0;
        for(int i = 0; i < arr.length; i++) {
            n = n ^ arr[i];
        }
        return n;
    }

    public static void main(String[] args) {
        SingleNumber s = new SingleNumber();

        System.out.println(s.singleNum(new int[]{1, 2, 2, 3, 3}));
    }
}
