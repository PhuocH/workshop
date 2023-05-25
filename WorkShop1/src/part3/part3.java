package part3;

import java.util.Scanner;

public class part3 {

    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        String name;
        int n;
        while (true) {
            try {
                System.out.print("Enter the number of students: ");
                n = Integer.parseInt(sc.nextLine());
               break;
            } catch (Exception e) {
                System.out.println("Try again! Don't input character.");
            }
        }
        String[] arr = new String[n];       
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Input the student #" + (i + 1) + "/" + arr.length + ": ");
            name = sc.nextLine();
            String[] list = name.split(" ");
            String name1 = "";
            for (String x : list) {
                name1 = name1 + (x.substring(0, 1).toUpperCase() + x.substring(1));
                name1 = name1 + " ";
            }
            System.out.println("Name converted to uppercase first letter: " + name1);
            System.out.println("Name converted to uppercase: " + name.toUpperCase());
        }
    }
}
