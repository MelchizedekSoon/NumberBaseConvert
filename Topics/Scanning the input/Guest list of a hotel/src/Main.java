import java.util.*;

class Main {
    public void guestListDisplayer() {
        List<String> guestList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            guestList.add(scanner.next());
        }
        Collections.reverse(guestList);
        for (String guest : guestList) {
            System.out.println(guest);
        }
    }

    public static void main(String[] args) {
        Main one = new Main();
        one.guestListDisplayer();
    }
}