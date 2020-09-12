package site.wentailai.example.pawnMove.simplesample.interview;

/**
 * User: libingkui
 * Date: 2020/9/12
 * Description:  快速排序
 */
public class QuickSort {
    public void sort(int[] arr, int start, int end) {
        int oldStart = start;
        int oldEnd = end;
        int s = arr[start];
        while(start < end) {
            while(s < arr[end]) {
                end --;
            }
            if(start < end) {
                arr[start] = arr[end];
                arr[end] = s;
                start ++;
            }

            while(arr[start] < s) {
                start ++;
            }
            if(start < end) {
                arr[end] = arr[start];
                arr[start] = s;
                end --;
            }
        }
        if(oldStart < start) {
            sort(arr, oldStart, start - 1);
        }
        if(start < oldEnd) {
            sort(arr, start + 1, oldEnd);
        }
    }

    public static void main(String[] args) {
//        int[] arr = {3, 1, 4, 1, 5, 9, 2, 6};
//        int[] arr = {11, 12, 9, 333, 3, 1, 4, 1, 5, 9, 2, 6};
//        int[] arr = {1};
//        int[] arr = {1, 2};
        int[] arr = {2, 1};
        QuickSort quickSort = new QuickSort();
        quickSort.sort(arr, 0, arr.length - 1);
        for(int i : arr) {
            System.out.println(i);
        }
    }
}
