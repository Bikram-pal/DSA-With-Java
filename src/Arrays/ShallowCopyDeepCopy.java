package Arrays;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    public static void main(String[] args) {
        int[] arr = {12,23,34};
//        int [] x = arr; // x is shallow copy of arr
//        x[1] = 2;
//        System.out.println(arr[1]);

        int[] y = Arrays.copyOf(arr,arr.length);// deep copy
        System.out.println(arr[1]);
        y[1] = 99;
        System.out.println(arr[1]);
        System.out.println(y[1]);
    }
}
