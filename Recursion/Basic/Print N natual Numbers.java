import java.util.Scanner;

public class NaturalNumbers {
    static void printNaturalNumbers(int n) {
        if (n <= 0)
            return;

        printNaturalNumbers(n - 1);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = scanner.nextInt();

        System.out.print("First " + n + " natural numbers: ");
        printNaturalNumbers(n);
        System.out.println();
    }
}
