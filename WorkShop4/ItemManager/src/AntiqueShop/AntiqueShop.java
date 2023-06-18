package AntiqueShop;

import DTO.*;
import TC.IO;

public class AntiqueShop {

    public static void main(String[] args) {
        Item item = null;    
        int op;
        //Lặp đến khi nào người dùng nhập số 5 để ngừng.
        do {
            menu();
                 //Khai báo class IO của packge TC và gọi hàm getAnInteger để nhập dữ liệu.
                 //                 inputMsg                    outputMsg       lowerBound  upBound
            op = IO.getAnInteger("Input your choice: ", "PLEASE INPUT FROM 1..5", 1, 5);
            switch (op) {
                case 1:
                    //Khai báo cha new con.
                    item = new Vase();
                    //Ép kiểu Vase để có thể gọi hàm inputVase.
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    //Khai báo cha new con.
                    item = new Statue();
                    //Ép kiểu Statue để có thể gọi hàm inputStatue.
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    //Khai báo cha new con.
                    item = new Painting();
                    //Ép kiểu Painting để có thể gọi hàm inputPainting.
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    //Nếu thằng item có dữ liệu thì
                    if (item != null) {
                        //xem thằng item có phải dòng họ gì với Vase không nếu phải
                        //chạy outputVase().
                        if (item instanceof Vase)
                            ((Vase)item).outputVase();
                        //xem thằng item có phải dòng họ gì với Statue không nếu phải
                        //chạy outputStatue().
                        else if (item instanceof Statue)
                            ((Statue)item).outputStatue();
                        //xem thằng item có phải dòng họ gì với Painting không nếu phải
                        //chạy outputPainting().
                        else if(item instanceof Painting)
                            ((Painting)item).outputPainting();
                    }
                    //Ngược lại nếu thằng item không có dữ liệu thì in ra màn hình
                    //yêu cầu người dùng tạo một Object.
                    else
                        System.out.println("You need to create an object");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (op != 5);
        
    }
    
    //Hàm menu
    public static void menu() {
        System.out.println("1. Create a Vase.");
        System.out.println("2. Create a Statue.");
        System.out.println("3. Create a Painting.");
        System.out.println("4. Display the Item.");
        System.out.println("5. Exit.");        
    }
    
}