package Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12, 23, 34, 45, 1, 56, 33};
        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
        System.out.println();
        int i=0;
        int j= arr.length -1;
        while(j>i)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        for(int ele : arr)
        {
            System.out.print(ele+ " ");
        }
    }
}
