import java.util.Scanner;

class Main {
    public static void vectorAngle() {
        Scanner scanner = new Scanner(System.in);
        int result;
        double c = scanner.nextInt();
        double d = scanner.nextInt();
        double e = scanner.nextInt();
        double f = scanner.nextInt();
        result = (int) ((Math.acos(((c * e) + (d * f)) / (Math.sqrt((c * c) + (d * d)) * Math.sqrt((e * e) + (f * f)))) * 360) / (Math.PI * 2));
        System.out.println(result);
    }

    public static void main(String[] args) {
        vectorAngle();
    }
}