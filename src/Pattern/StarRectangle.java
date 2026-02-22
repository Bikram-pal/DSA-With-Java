package Pattern;

import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<cols; j++)
            {
                System.out.print("x ");
            }
            System.out.println();
        }

    }
}
