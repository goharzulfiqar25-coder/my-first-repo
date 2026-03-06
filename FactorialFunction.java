import java.util.Scanner; //ZULFIQAR GAUHAR SAP ID: 76579
public class FactorialFunction {
    public static long calculateFactorial(int n) {
        if (n < 0) {
            return -1;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) { //ZULFIQAR GAUHAR SAP ID: 76579
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative number: ");
        int num = scanner.nextInt();

        long factorial = calculateFactorial(num);
        if (factorial == -1) {
            System.out.println("Factorial is not defined for negative number");
        } else {
            System.out.println("The Factorial of " + num + " is " + factorial);
        }
    }
}