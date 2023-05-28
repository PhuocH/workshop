package part2;

import java.util.*;

public class Part2_2 {

    /*Class yêu cầu mã số sinh viên ngành SE, kiểm tra và bắt lỗi không
    cho JVM giết app và yêu cầu nhập lại. Phiên bản có hàm bên ngoài.
     */

    private static Scanner sc = new Scanner(System.in);     //Yêu cầu nhập từ bàn phím
    private static String pattern = "(se|Se|sE|SE)\\d{6}";  //Bắt lỗi

    public static String inputString() throws Exception {
        System.out.print("Input SEXXXXXX: ");
        String s = sc.nextLine();
        /*Nhập chuỗi và sau đó xuống dòng if check xem có đúng nằm trong phạm vi pattern
        không. Nếu đúng nó sẽ quăng lỗi xuống và xử lý lệnh, không giết app nếu nhập sai
         */
        if (!s.matches(pattern)) {
            throw new Exception();
        }
        return s;
    }

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.println("The string is: " + inputString().toUpperCase());
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
