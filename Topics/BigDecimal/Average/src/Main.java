import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void average() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal first = scanner.nextBigDecimal();
        BigDecimal second = scanner.nextBigDecimal();
        BigDecimal third = scanner.nextBigDecimal();
        BigDecimal three = new BigDecimal("3");
        System.out.println(first.add(second).add(third).divide(three, 0, RoundingMode.DOWN));
    }

    public static void main(String[] args) {
        average();
    }
}