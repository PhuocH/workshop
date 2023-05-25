package part1;

import java.util.Scanner;

public class Part1 {
    /* Class yêu cầu nhập số >= 1, bắt lệnh không nhập chữ.    
    */
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n;
        while (true) {            
            try {
                System.out.print("Input the number (n => 1): ");
                n = Integer.parseInt(sc.nextLine());    /*Bắt chuỗi và những ký tự trong bảng mã ASCII
                                                        kể cả enter*/                                                        
                if (n < 1)                  //Bắt số nhỏ hơn 1
                    throw new Exception();  //Ném nó ra để xử lý lỗi
                break;
            } catch (Exception e) {
                System.out.println("Please input again!! Do not enter numbers < 1 and do not enter letters");
                //Xử lý ngoại lệ
            }
        }
        System.out.println("n = " + n);
    }
    
}
