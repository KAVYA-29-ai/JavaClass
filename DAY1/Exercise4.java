import java.util.Arrays;

public class Exercise4 {

    // Helper method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to generate an array of the first n prime numbers
    public static int[] generatePrimes(int n) {
        if (n <= 0) {
            return new int[0];
        }

        int[] primes = new int[n];
        int count = 0;
        int num = 2;

        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }

    public static void main(String[] args) {
        int numberOfPrimes = 10;
        int[] primeArray = generatePrimes(numberOfPrimes);
        
        System.out.println("First " + numberOfPrimes + " prime numbers:");
        System.out.println(Arrays.toString(primeArray));
    }
}