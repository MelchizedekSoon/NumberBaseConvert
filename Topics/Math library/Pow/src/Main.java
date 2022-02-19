import java.util.Scanner;

class Main {

    public static void pow() {
        Scanner scanner = new Scanner(System.in);
        String[] inputs = scanner.nextLine().split(" ");
        double a = Double.parseDouble(inputs[0]);
        double b = Double.parseDouble(inputs[1]);
        System.out.println(Math.pow(a, b));
    }

    public static void main(String[] args) {
        pow();
    }
}