package part2;

import java.util.*;

public class Part2 {

    private static Scanner sc = new Scanner(System.in);
    private static String pattern = "(se|Se|sE|SE)\\d{6}";

    public static String inputString() throws Exception {
        System.out.print("Input SEXXXXXX: ");
        String s = sc.nextLine();

        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("The string is: " + inputString());
                break;
            } catch (Exception e) {
                System.out.println("The string was wrong! ");
                System.out.println("Please re-enter the form SEXXXXXX E.g.(SE123456)");
            }
        }
    }
}
