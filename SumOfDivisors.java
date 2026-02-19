import java.util.Scanner;

public class SumOfDivisors {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i * i <= n; i++) {

            if (n % i == 0) {

                sum += i;

                if (i != n / i) {
                    sum += n / i;
                }
            }
        }

        System.out.println("Sum of divisors of " + n + " is: " + sum);

        sc.close();
    }
}
