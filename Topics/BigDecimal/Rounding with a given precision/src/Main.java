import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void rounding() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal bigNum = scanner.nextBigDecimal();
        int newScale = scanner.nextInt();
        bigNum = bigNum.setScale(newScale, RoundingMode.HALF_DOWN);
        System.out.println(bigNum);
    }

    public static void main(String[] args) {
        rounding();
    }
}