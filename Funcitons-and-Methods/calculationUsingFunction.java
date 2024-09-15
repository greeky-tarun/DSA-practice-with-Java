import java.util.*;

public class calculationUsingFunction {
    // using parameters
    public static int SumOfNumbers(int num1, int num2) { // parameters or formal parameters
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1: ");
        int a = sc.nextInt();
        System.out.println("Enter num2: ");
        int b = sc.nextInt();
        int sum = SumOfNumbers(a, b); // arguments or actual paramters
        System.out.println("sum is: " + sum);
    }
}
