package part2;

import java.util.*;

public class Part2 {

    /*Class yêu cầu mã số sinh viên ngành SE, kiểm tra và bắt lỗi không
    cho JVM giết app và yêu cầu nhập lại. Phiên bản không tạo hàm ngoài.
     */
    private static Scanner sc = new Scanner(System.in);     //Yêu cầu nhập từ bàn phím
    private static String pattern = "(se|Se|sE|SE)\\d{6}";  //Bắt lỗi

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Input SEXXXXXX: ");
                String s = sc.nextLine();
                if (!s.matches(pattern)) {
                    throw new Exception();
                }
                System.out.println("The string is: " + s.toUpperCase());
                /*Yêu cầu nhập chuỗi đến khi nào nhập đúng thì vòng lập while sẽ gặp
                câu lệnh break và dừng nhập lệnh*/
                break;
            } catch (Exception e) {
                System.out.println("The string was wrong! ");
                System.out.println("Please re-enter the form SEXXXXXX E.g.(SE123456)");
            }
        }
    }
}
