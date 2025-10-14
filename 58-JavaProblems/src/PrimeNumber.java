import java.util.ArrayList;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        boolean primeNo = isPrime(scan.nextInt());
        System.out.println("\n" + primeNo);

        System.out.print(findPrimes(0, 1000));

    }

    // checking prime number
    static boolean isPrime(int n) {
        if (n < 2 || n == 4) return false;
        if (n == 2 || n == 3) return true;
        for (int i = 2; i * i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // counting prime numbers from a to b
    public static ArrayList<Integer> findPrimes(int start, int end) {
        ArrayList<Integer> primes = new ArrayList<Integer>();

        for (int n = start; n < end; n++) {
            boolean prime = true;

            int i = 2;
            while (i <= n / 2) {
                if (n % i == 0) {
                    prime = false;
                    break;
                }
                i++;
            }
            if (prime) {
                primes.add(n);
            }
        }
        return primes;
    }


}
