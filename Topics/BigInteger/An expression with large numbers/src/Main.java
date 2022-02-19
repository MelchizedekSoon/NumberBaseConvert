import java.math.BigInteger;
import java.util.Scanner;

class Main {
    public static void mathDoer() {
        Scanner scanner = new Scanner(System.in);
        BigInteger a, b, c, d;
        a = new BigInteger(scanner.next());
        b = new BigInteger(scanner.next());
        c = new BigInteger(scanner.next());
        d = new BigInteger(scanner.next());
        BigInteger result;
        result = a.negate().multiply(b);
        result = result.add(c);
        result = result.subtract(d);
        System.out.println(result);
    }

    public static void main(String[] args) {
        mathDoer();
    }
}