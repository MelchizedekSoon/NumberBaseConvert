import java.util.Scanner;

class Main {

    public static void heronsFormula() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double s = (a + b + c) / 2;
        System.out.println(Math.sqrt(s * (s - a) * (s - b) * (s - c)));
    }

    public static void main(String[] args) {
        heronsFormula();
    }
}