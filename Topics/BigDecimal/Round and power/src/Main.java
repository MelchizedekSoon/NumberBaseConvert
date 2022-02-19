import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {

    public static void roundAndPower() {
        Scanner scanner = new Scanner(System.in);
        int power = scanner.nextInt();
        int scale = scanner.nextInt();
        BigDecimal bigNum = scanner.nextBigDecimal().setScale(scale, RoundingMode.FLOOR);
        bigNum = bigNum.pow(power);
        System.out.println(bigNum);
    }

    public static void main(String[] args) {
        roundAndPower();
    }
}