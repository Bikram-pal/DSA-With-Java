package Arrays;

import java.util.ArrayList;

public class ArrayListInJavaBasic {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(25);
        arr.add(30);
        System.out.println(arr);
        System.out.println(arr.get(1));

        arr.set(0,1);
        System.out.println(arr.get(0));

        int n = arr.size();
        for(int i =0 ; i<n ; i++)
        {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
        for(int ele : arr)
        {
            System.out.print(ele + " ");
        }

    }
}
