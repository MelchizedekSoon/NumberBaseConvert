import java.util.Scanner;

class Main {
    public static void firstCharacters() {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        String word = input[0];
        int numOfChars = Integer.parseInt(input[1]);
        if (numOfChars > word.length()) {
            System.out.println(word);
        } else {
            System.out.println(word.substring(numOfChars) + word.substring(0, numOfChars));
        }
    }

    public static void main(String[] args) {
        firstCharacters();
    }
}