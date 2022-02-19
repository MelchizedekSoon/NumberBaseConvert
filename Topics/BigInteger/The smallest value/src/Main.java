import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void smallestValue() {
        Scanner scanner = new Scanner(System.in);
        BigInteger m = new BigInteger(scanner.next());
        BigInteger factorial = new BigInteger("2");
        int factorialCounter = 2;
        while (factorial.compareTo(m) < 0) {
            factorial = factorial.multiply(BigInteger.valueOf(factorialCounter + 1));
            factorialCounter++;
        }
        System.out.println(factorialCounter);
    }

    public static void main(String[] args) {
        smallestValue();
    }
}