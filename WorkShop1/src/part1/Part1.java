package part1;

import java.util.Scanner;

public class Part1 {

    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int rows, cols;
        int matrix[][];
        while (true) {
            try {
                System.out.print("Input number of rows: ");
                rows = Integer.parseInt(sc.nextLine());
                System.out.print("Input number of column: ");
                cols = Integer.parseInt(sc.nextLine());
                matrix = new int[rows][cols];
                break;
            } catch (Exception e) {
                System.out.println("Input please try again!");
            }
        }

        if (rows == 0 && cols == 0) {
            System.out.println("No value at all");
        }
        while (true) {
            try {
                System.out.println("Enter the maxtrix: ");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        System.out.printf("[%d][%d]: ", (i + 1), (j + 1));
                        matrix[i][j] = Integer.parseInt(sc.nextLine());
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println("Try again. Don't input character");
            }
        }

        System.out.println("Matrix inputted: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println("");
        }

        double sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum = " + sum);

        double avg = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                avg = sum / (rows * cols);
            }
        }
        System.out.printf("Avg = %5.2f", avg);
        System.out.println("");
    }
}
