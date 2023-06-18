package TC;

import java.util.Scanner;

public class IO {
    /*Class dùng để bắt các lệnh ngoài lề, những trường hợp không phù hợp với trường
    đó và yêu cầu nhập lại. Không để JVM giết app.
    */
    
    private static Scanner sc = new Scanner(System.in);

    //Hàm dùng để yêu cầu nhập một kiểu dữ liệu số nguyên và báo lỗi in ra dòng báo lỗi 
    //không phải là số nguyên.
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());   //Nhập n số nguyên và lấy hết những gì là chuỗi ký tự
                return n;
            } catch (Exception e) {                    //Nếu là ký tự sẽ xuống đây và báo lỗi
                System.out.println(errorMsg);          //yêu cầu nhập lại
            }
        }
    }

    //Hàm dùng để yêu cầu nhập một kiểu dữ liệu số nguyên và báo lỗi in ra dòng báo lỗi
    //không phải là số nguyên và giới hạn các chặn.
    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upBound) {
        int n, t;
        if (lowerBound > upBound) {             //swap nếu viết code có truyền dữ liệu
            t = lowerBound;                     //của lowerBound > upBound
            lowerBound = upBound;               //ví dụ như String inputMsg, String errorMsg, 1, 0
            upBound = t;                        //thì trường hợp này sẽ đổi lại thành 0, 1
        }

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerBound || n > upBound) {    //Nếu ngoài lề thì sẽ xử lý ngoài lề
                    throw new Exception();
                }
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
 
    //Hàm dùng để kiểm tra những trường hợp chỉ nhập true/false. Nếu nhập ngoài true/false
    //thì báo lỗi và yêu cầu nhập lại
    public static Boolean getBoolean(String inputMsg, String errorMsg) {
        boolean isValid = false;  
        boolean result = false;

        while (!isValid) {
            try {
                System.out.print(inputMsg);
                String s = sc.nextLine();

                if (s.equalsIgnoreCase("true")) {
                    result = true;
                    isValid = true;
                } else if (s.equalsIgnoreCase("false")) {
                    result = false;
                    isValid = true;
                } else {
                    throw new Exception();
                }
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
        return result;
    }
    
    //Hàm dùng để kiểm tra chuỗi nhập vào, không cho phép rỗng, bỏ trống. Nếu có thì
    //bắt nhập lại chứ không lấy ký tự enter.
    public static String getString(String inputMsg, String errorMsg) {
        String s;
        while (true) {
            System.out.print(inputMsg);
            s = sc.nextLine();
            if (s.length() == 0 || s.isEmpty()) {
                System.out.println(errorMsg);
            } else {
                return s;
            }
        }
    }
}
