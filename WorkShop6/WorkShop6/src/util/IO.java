package util;

import java.util.Scanner;

/**
 * Class kiểm tra lỗi những kiểu dữ liệu nhập vào bao gồm:
 * Integer, Double, ID, String.
 * @author ADMIN
 */
public class IO {

    public static Scanner sc = new Scanner(System.in);

    /**
     * Hàm yêu cầu nhập vào một số nguyên và giới hạn số nhập vào, nhập sai
     * sẽ báo lỗi yêu cầu nhập lại.
     * @param inputMsg
     * @param errorMsg
     * @param lowerBound
     * @param upBound
     * @return 
     */
    public static int getAnInteger(String inputMsg, String errorMsg, int lowerBound, int upBound) {
        int n, t;
        if (lowerBound > upBound) {
            t = lowerBound;
            lowerBound = upBound;
            upBound = t;
        }

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerBound || n > upBound)
                    throw new Exception();
                else
                    return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    /**
     * Hàm yêu cầu nhập vào số thực và giới hạn số thực nhập vào, nhập sai sẽ 
     * báo lỗi yêu cầu nhập lại.
     * @param inputMsg
     * @param errorMsg
     * @param lowerBound
     * @param upBound
     * @return 
     */
    public static double getADouble(String inputMsg, String errorMsg, double lowerBound, double upBound) {
        double n, t;
        if (lowerBound > upBound) {
            t = lowerBound;
            lowerBound = upBound;
            upBound = t;
        }

        while (true) {
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerBound || n > upBound)
                    throw new Exception();
                else
                    return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    /**
     * Hàm nhập yêu cầu nhập mã số HS, SV theo format, nếu nhập sai sẽ báo lỗi
     * yêu cầu nhập lại.
     * @param inputMsg
     * @param errorMsg
     * @param format
     * @return 
     */
    public static String getID(String inputMsg, String errorMsg, String format) {
        String code;
        boolean match;
        while (true) {            
            System.out.print(inputMsg);
            code = sc.nextLine().trim().toUpperCase();
            match = code.matches(format);
            //Báo lỗi nếu code rỗng hoặc độ dài = 0 hoặc format sai.
            if (code.isEmpty() || code.length() == 0 || match == false)
                System.out.println(errorMsg);
            else
                return code;
        }            
    }
    
    /**
     * Hàm yêu cầu nhập chuỗi ký tự, nếu người dùng bỏ trống không nhập thì 
     * yêu cầu nhập lại.
     * @param inputMsg
     * @param errorMsg
     * @return 
     */
    public static String getString(String inputMsg, String errorMsg) {
        String s;
        while (true) {            
            System.out.print(inputMsg);
            s = sc.nextLine();
            //Hàm báo lỗi nếu s rỗng hoặc độ dài trong chuỗi = 0.
            if (s.isEmpty() || s.length() == 0)
                System.out.println(errorMsg);
            else
                return s;
        }
    } 
}
