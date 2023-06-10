package TC;

import java.util.Scanner;

public class IO {
    private static Scanner sc = new Scanner(System.in);

    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.print(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
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
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        while (true) {            
            try {
                System.out.print(inputMsg);
                n = Double.parseDouble(sc.nextLine());
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
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
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }

    public static Boolean getBoolean(String inputMsg, String errorMsg, boolean bound) {
        boolean n;
        while (true) {            
            try {
                System.out.print(inputMsg);
                n = Boolean.parseBoolean(sc.nextLine());
                if (bound != true || bound != false)
                    throw new Exception();
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    
    public static String getString (String inputMsg, String errorMsg) {
        String s;
        while (true) {            
            System.out.print(inputMsg);
            s = sc.nextLine();
            if (s.length() == 0 || s.isEmpty())
                System.out.println(errorMsg);
            else
                return s;
        }
    }
    
}