package Arrays;

public class SecLargestElement {
    public static void main(String[] args)
    {
        int[] arr = {12, 23, 34, 43,21};
        int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            if(max<arr[i])
            {
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            if(max2<arr[i]&&arr[i]!=max)
            {
                max2 = arr[i];
            }
        }
        System.out.print("2nd max element is: " + max2);
    }

}
