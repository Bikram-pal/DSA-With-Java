package Arrays;

public class PassingArrayToMethod {
    public static void main(String[] args) {
        int[] x = {12,23,34};
        System.out.println(x[1]);
        changes(x);
        System.out.println(x[1]);
    }

    public static void changes(int[] y)
    {
        y[1] = 99;
    }
}
