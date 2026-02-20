package Loops;

import java.util.Scanner;
public class ReverseOfNum {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter your number");
         int n = sc.nextInt();
         int ans = 0;
         int rem = 0;
         while(n!=0)
         {
             rem = n%10;
             ans = ans*10 + rem;
             n/=10;
         }

        System.out.println(ans);

    }
}
