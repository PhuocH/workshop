package gui;

import dto.*;

public class Tester {
    /*Kiểm tra thử các trường hợp về polymophism. Thử các trường hợp
    Khai cha new cha.
    Khai cha new con.
    Khai ông nội new con.
    Khai con new cha.
    Khai con new con.
    */
    
    public static void main(String[] args) {
        //Colony là cha của BeeColony
        //Ở đây ta khai báo Colony new Beecolony thì khi obj. thằng con sẽ gọi tất
        //cả những gì thằng cha có @Override đem qua cho con xài. Nhưng những gì thuộc
        //về con sẽ không thấy.
        System.out.println("Khai cha new con Colony & BeeColony: ");
        Colony obj1 = new BeeColony(2000, "Honey", "land");
        System.out.println(obj1); //Nó sẽ lấy phần toString để in ra màn hình.
        //Nếu không có toString bên Con (BeeColony) thì nó sẽ lấy toString bên Cha (Colony) thông qua @Override.
        //Nếu bên Cha (Colony) không có toString thì nó sẽ lấy toString của ông nội (Organizations) thông qua @Override.
        //Nếu bên Ông nội (Organizations) không có toString thì mặc định JVM sẽ tự động chuyển cái vùng RAM
        //của Object thành 1 dãy số Hexa, để đại diện cho vùng RAM đó.
        obj1.grow();
        obj1.reproduce();
        /*Nhưng nếu ta ép kiểu cho con thì ta sẽ thấy được tất cả vùng RAM của con
        và vùng RAM của cha (Những hàm của con sẽ có màu đen đậm, hàm của cha 
        là màu xám nhạt.*/
        System.out.println("");
        System.out.println("====================================================================");
        System.out.println("Ep kieu de thay vung RAM cua con: ");
        ((BeeColony) obj1).getType();
        System.out.println(obj1);
        System.out.println("====================================================================");

        System.out.println("");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Khai Ong noi new chau");
        /*Tương tự như khai cha new con thì khai ông nội new cháu cũng chỉ thấy
        vùng RAM của ông nội và những gì ông nội truyền lại cho đời cháu (@Override).
        Tương tự như ở trên.
         */
        Organizations obj11 = new BeeColony(2100, "Hawaii", "island");
        obj11.setSize(3100);
        /*Nếu ta ép kiểu cho cháu thì ta sẽ thấy được vùng RAM của cháu và sử dụng nó        
         */
        ((BeeColony) obj11).setType("beach"); //Không chỉ vậy chúng ta còn có thể thấy và gọi được thằng cha
        //vì thằng con extends thằng cha, thằng cha extends ông nội. Giống như ở ngoài đời
        //Di sản sẽ được truyền qua các đời con.
        System.out.println(obj11);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("");
        
        /*Khai cha new cha. Theo em hiểu về Anonymous như sau. Class Organizations
        nó là 1 đối tượng nhưng không rõ chính xác về đặc điểm hoặc hành vi.
        Ví dụ như: Ta có một cuộc họp giành cho các tổ chức. Organization là một tổ chức, 
        giống như BeeColony, FPTUniversity là một tổ chức nhưng nó rõ ràng là một tổ chức nào, 
        tổ chức gì. Khi có một tổ chức muốn tham gia vào một cuộc họp nhưng chưa rõ đó 
        là tổ chức gì thì ta gọi nó là Anonymous để tham dự vào cuộc họp.
        Khi new cha nó sẽ cộng những phần code mở rộng của cha (Override)
         */
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Khai cha new cha.");
        Organizations obj0 = new Organizations(10) {
            @Override
            public void communicateByTool() {
                System.out.println("ANONYMOUS CLASS");
            }

            @Override
            public void output() {
                System.out.println("Size: " + size);
            }
        }; //Tại sao ở đây phải có dấu ;? Bởi vì nó phải thỏa 1 công thức VD: Colony obj1 = new BeeColony()*;*
        //Vì Anonymous Class nó không có gì cụ thể, nên không biết gì để new. Nên nó new ngay luôn vì vậy ở cuối phải ;
        obj0.setSize(1846);
        obj0.communicateByTool();
        System.out.println(obj0);        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.println("\n**********************************************************************************");
        System.out.println("*Khai con new cha:                                                               *");
//        BeeColony obj12 = new Colony(2, "Phan Thiet");
//        obj12.createWorker();
        //Không khai Con new Cha được bởi vì có vùng RAM của Cha mới con vùng RAM của con. Giống như ngoài đời
        //Không có Cha sẽ không có con. Mà Con có Cha là nghịch lý.
        System.out.println("*Khong khai con new cha duoc.                                                    *");
        System.out.println("**********************************************************************************\n");
        /*Khai con new con sẽ gọi những gì là của con và cả Ông Nội, Cha*/
        System.out.println("*************************************************************************");
        System.out.println("Khai con new con: ");
        BeeColony obj13 = new BeeColony(171830, "My Tho", "Land");
        obj13.communicateByTool();
        obj13.createWorker();
        obj13.getSize(); //Của Ông Nội (Organizations)
        obj13.getPlace(); //Của Cha (Colony)
        System.out.println(obj13);
        System.out.println("*************************************************************************");
        
        //Tương tự như trên.
        System.out.println("\nKhai cha new con University & FPT University: ");
        University obj2 = new FPTUniversity("FPT", 10000, "Can Tho");
        System.out.println(obj2);
        obj2.enroll();
        obj2.educate();
        
        //Khai Interface new BeeColony
        System.out.println("\nKhai Interface new BeeColony");
        Role df = new BeeColony(3000, "Wasp", "land");
        df.createWorker();
        
        System.out.println("\nKhai Interface new Interface: ");
        Role r = new Role() {
            @Override
            public void createWorker() {
                System.out.println("Anonymous Class");
            }
        };
        r.createWorker();
        
        System.out.println("\nKhai Colony new Interface: ");
//        Colony obj3 = new Role() {
//            @Override
//            public void createWorker() {
//                System.out.println("Cannot use.");
//            }
//        };
//        obj3.communicateByTool();
        System.out.println("Khong the khai Colony new Interface\n.");

        //Gọi biến df new FPTUniversity
        System.out.println("\nGoi bien df new FPTUniversity");
        df = new FPTUniversity("FPT", 10000, "Hanoi");
        System.out.println(df);
        df.createWorker();
    }
}