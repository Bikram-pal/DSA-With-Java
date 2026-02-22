package Pattern;

import java.util.Scanner;

public class HollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for(int i=0; i<m; i++)
        {
            for (int j=0; j<n; j++)
            {
                if(i==0 || i==m-1 || j==0 || j == n-1 )
                {
                    System.out.print("x ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

    }
}
