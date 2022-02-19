import java.math.BigInteger;
import java.util.Scanner;

class DoubleFactorial {

    public static BigInteger calcDoubleFactorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        BigInteger result = BigInteger.valueOf(n);
        BigInteger factorial = BigInteger.valueOf(n);
        while (factorial.compareTo(BigInteger.ONE) > 0) {
            factorial = factorial.subtract(BigInteger.TWO);
            if (factorial.compareTo(BigInteger.ZERO) > 0) {
                result = result.multiply(factorial);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(calcDoubleFactorial(n));
    }
}