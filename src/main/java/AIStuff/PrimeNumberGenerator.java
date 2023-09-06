package AIStuff;

public class PrimeNumberGenerator {
    public static void main(String[] args) {
        int numberOfPrimes = 10;
        int[] primeNumbers = generateFirstNPrimes(numberOfPrimes);

        System.out.println("Die ersten " + numberOfPrimes + " Primzahlen sind:");
        for (int prime : primeNumbers) {
            System.out.print(prime + " ");
        }
    }

    // Methode zur Generierung der ersten N Primzahlen
    public static int[] generateFirstNPrimes(int n) {
        int[] primeNumbers = new int[n];
        int count = 0;
        int num = 2; // Beginnen Sie mit der Prüfung der Primzahlen ab 2

        while (count < n) {
            if (isPrime(num)) {
                primeNumbers[count] = num;
                count++;
            }
            num++;
        }

        return primeNumbers;
    }

    // Methode zur Überprüfung, ob eine Zahl eine Primzahl ist
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // 0 und 1 sind keine Primzahlen
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Wenn num durch i teilbar ist, ist es keine Primzahl
            }
        }

        return true; // Wenn keine Teiler gefunden werden, ist es eine Primzahl
    }
}
