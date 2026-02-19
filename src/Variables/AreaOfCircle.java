package Variables;
import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your radius: ");
        double r = sc.nextDouble();

        double a = 3.14*r*r;
        System.out.print("the area is: ");
        System.out.println(a);
    }
}
