package part2;

import java.util.Scanner;

public class Part2 {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        double n1, n2;
        while (true){
        try {
            System.out.print("Input the number 1: ");
            n1 = Double.parseDouble(sc.nextLine());
            System.out.print("Input the number 2: ");
            n2 = Double.parseDouble(sc.nextLine());
            break;
        } catch (Exception e) {
            System.out.println("Please enter number, not letter!!");
        }
        }

        System.out.print("Input the operator: ");
        String op = sc.nextLine();
        switch (op) {
            case "+": {
                System.out.printf("%.2f + %.2f = %.2f\n", n1, n2, (n1 + n2));
                break;
            }
            case "-": {
                System.out.printf("%.2f - %.2f = %.2f\n", n1, n2, (n1 - n2));
                break;
            }
            case "*": {
                System.out.printf("%.2f * %.2f = %.2f\n", n1, n2, (n1 * n2));
                break;
            }
            case "/": {
                if (n2 == 0) {
                    System.out.println("Error: division by zero!");
                } else {
                    System.out.printf("%.2f / %.2f = %.2f\n", n1, n2, (n1 / n2));
                }
                break;
            }
            default: {
                System.out.println("Invalid operator");
                break;
            }
        }
    }
}
