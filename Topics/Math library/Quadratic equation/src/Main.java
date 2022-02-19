import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Main {
    public static void quadraticEquation() {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double quadMid = (Math.sqrt(Math.pow(b, 2) - (4 * a * c)));
        double xOne = (-b + quadMid) / (2 * a);
        double xTwo = (-b - quadMid) / (2 * a);
        List<Double> ascendList = new ArrayList<>();
        ascendList.add(xOne);
        ascendList.add(xTwo);
        Collections.sort(ascendList);
        System.out.print(ascendList.get(0) + " " + ascendList.get(1));
    }

    public static void main(String[] args) {
        quadraticEquation();
    }
}