import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        final double tenFive = 10.5;
        final double fourFour = 4.4;
        final double twoTwo = 2.2;
        System.out.println(a * tenFive + b * fourFour + (c + d) / twoTwo);
    }
}
