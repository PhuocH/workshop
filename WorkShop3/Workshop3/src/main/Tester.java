package main;

import data.Guitar;

public class Tester {
    /*Chạy chương trình về Guitar    
    */
    public static void main(String[] args) {
        Guitar obj1 = new Guitar();
        //obj1 là một Object. obj1 new một constructor default, các giá trị sẽ về NULL
        Guitar obj2 = new Guitar("G123", 200, "Sony", "Model123", "hardWood", "softWood");
        //obj2 là một Object. obj2 new một constructor và gán các giá trị vào phễu.
        System.out.println("State of obj1: ");
        obj1.createSound(); //obj1 gọi hàm createSound();
        
        System.out.println("");
        System.out.println("State of obj2: ");
        obj2.createSound(); ///obj2 gọi hàm createSound();
        
        System.out.println("Set price = 300 of obj1");
        obj1.setPrice(300); //obj1 thay đổi giá trị tiền là 300
        System.out.println("Get price of obj1: " + obj1.getPrice());
        
        System.out.println("Obj2 state after being changed: ");
        System.out.println("Set serial number = G124");
        obj2.setSerialNumber("G124");
        obj2.createSound();
        
//        obj1.setSerialNumber("6"); //obj1 thay đổi mã số là 6 nhưng vì hàm SerialNumber
                                   //có điều kiện nên JVM sẽ giết app nếu 
                                   //không có lệnh try catch (Xử lý ngoại lệ)
    }
    
}
