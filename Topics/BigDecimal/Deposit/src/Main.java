import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void deposit() {
        Scanner scanner = new Scanner(System.in);
        BigDecimal startAmount = scanner.nextBigDecimal();
        BigDecimal interestRate = scanner.nextBigDecimal();
        int numOfYears = scanner.nextInt();
        BigDecimal oneHundred = new BigDecimal("100");
        BigDecimal interestPart = interestRate.divide(oneHundred, 2, RoundingMode.CEILING);
        BigDecimal finalAmount = startAmount.multiply(BigDecimal.ONE.add(interestPart).pow(numOfYears));
        System.out.println("Amount of money in the account: " + finalAmount.setScale(2, RoundingMode.CEILING));
    }

    public static void main(String[] args) {
        deposit();
    }
}