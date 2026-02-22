package Pattern;

import java.util.Scanner;

public class NumberSquare2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int inc = 1;
        for(int i=0; i<rows; i++)
        {
            for (int j=0; j<rows; j++)
            {
                System.out.print(inc + " ");
                inc++;
            }
            System.out.println();
        }
    }
}
