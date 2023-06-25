package data;

import java.util.ArrayList;
import util.Validation;
import ui.Menu;

/**
 * Class dùng để xử lý những hàm như: addAStudent, searchAStudent, updateName,
 * updateMark, removeStudent, listAll. Bằng phương thức ArrayList để chứa thông
 * tin HS, SV đó.
 *
 *
 * @author ADMIN
 */
public class StudentList extends ArrayList<Student> {

    /**
     * Default constructor.
     */
    public StudentList() {
        super();
    }

    /**
     * Hàm yêu cầu nhập một sinh viên.
     */
    public void addAStudent() {
        String code;
        int pos;
        do {
            code = Validation.getID("Input ID(SXXX): ", "Student code must be in format (SXXX)"
                    + ". X is a digit.", "^(S|s)\\d{3}$");
            pos = searchStudent(code);
            if (pos > -1) {
                System.out.println("Duplicated id. Input another one!");
            }
        } while (pos != -1);

        String name = Validation.getString("Input name: ", "This field is required!");
        double mark = Validation.getADouble("Input a mark: ", "Only input a mark [0..10].", 0, 10);
        this.add(new Student(code, name, mark));
        System.out.println("Data entered successful!");
    }

    /**
     * Hàm add Student sẵn để test code khi chạy đỡ mắc công phải nhập từ bàn
     * phím mỗi khi test code.
     */
    public void addAllStudent() {
        Student st = new Student("S001", "Huynh Minh Phuoc", 9.2);
        this.add(st);
        Student st1 = new Student("S002", "Nguyen Tran Hoang Anh Thu", 10);
        this.add(st1);
        Student st2 = new Student("S003", "Dang Le Hoang Phuc", 6);
        this.add(st2);
        Student st3 = new Student("S004", "Truong Thanh Dat", 2);
        this.add(st3);
        Student st4 = new Student("S005", "Le Tuan Hung", 0);
        this.add(st4);
        Student st5 = new Student("S006", "Ton Ngo Khong", 5);
        this.add(st5);
        System.out.println("Data entered successful!");
    }

    /**
     * Hàm tìm đối tượng SV bằng mã HS, SV và trả về một đối tượng là HS, SV.     *
     * @param code
     * @return
     */
    public Student searchObjectStudent(String code) {
        if (this.isEmpty()) {
            return null;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code)) {
                return this.get(i);
            }
        }
        return null;
    }

    /**
     * Hàm yêu cầu nhập mã HS, SV và xem có ai trong danh sách không, nếu có thì
     * in ra màn hình.
     */
    public void searchStudent() {
        if (this.isEmpty()) {
            System.out.println("=============================================");
            System.out.println("The list is emty.");
            System.out.println("=============================================");
        } else {
            String keyword = Validation.getID("Input ID(SXXX) to search: ", "Student code must be in format (SXXX)"
                    + ". X is a digit.", "^(S|s)\\d{3}$");;
            Student st = searchObjectStudent(keyword);
            if (st == null) {
                System.out.println("No one on the list.");
            } else {
                System.out.println("\t\t\t+----+-------------------------+-----+");;
                System.out.printf("\t\t\t|%-4s|%-25s|%5s|\n",
                        "Code", "Name", "Mark");
                System.out.println("\t\t\t+----+-------------------------+-----+");
                System.out.println("\t\t\t" + st);
                System.out.println("\t\t\t+----+-------------------------+-----+");;
            }
        }
    }

    /**
     * Hàm phụ trợ Hàm kiểm tra xem mã HS, SV có tồn tại không và trả về giá trị
     * có trong mảng Quy ước: -1 là không tìm thấy (Vì mảng bắt đầu là 0 nên quy
     * ước là -1) >=0 trả về giá trị i có trong mảng.
     *
     *
     * @param code
     * @return
     */
    private int searchStudent(String code) {
        int pos;
        if (this.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equalsIgnoreCase(code)) {
                return i;
            }
        }
        return -1;
    }

    /**
     * In toàn bộ danh sách sinh viên ra màn hình Xét điều kiện danh sách có
     * rỗng không nếu có in ra dòng chữ "No one on the list".
     */
    public void printAll() {
        if (this.isEmpty()) {
            System.out.println("=============================================");
            System.out.println("No one on the list.");
            System.out.println("=============================================");
            return;
        }
        System.out.println("\t\t\t+----+-------------------------+-----+");;
        System.out.printf("\t\t\t|%-4s|%-25s|%5s|\n",
                "Code", "Name", "Mark");
        System.out.println("\t\t\t+----+-------------------------+-----+");
        for (Student x : this) {
            System.out.println("\t\t\t" + x);
        }
        System.out.println("\t\t\t+----+-------------------------+-----+");
        System.out.println("\t\t\tTotal: " + this.size() + " student(s)");
    }

    /**
     * Hàm update thông tin cơ bản của sinh viên như: Tên và điểm số, code là
     * key nên không thể thay đổi Linh hoạt trong việc thay đổi bằng cách sử
     * dụng menu để lựa chọn.
     */
    public void updateStudent() {
        if (this.isEmpty()) {
            System.out.println("=============================================");
            System.out.println("The list is emty.");
            System.out.println("=============================================");
        } else {
            Menu menu = new Menu();
            menu.addNewOption("1. Update for name.");
            menu.addNewOption("2. Update for mark.");
            menu.addNewOption("3. Exit.");
            String tName;
            double tMark;
            Student x;
            int choice;
            String code = Validation.getID("Input ID(SXXX) to update: ", "Student code must be in format (SXXX)"
                    + ". X is a digit.", "^(S|s)\\d{3}$");;
            x = searchObjectStudent(code);
            if (x == null) {
                System.out.println("--------------------------------------");
                System.out.println("The student " + code + " doesn't existed.");
            } else {
                do {
                    menu.printMenu();
                    choice = menu.getChoice();
                    switch (choice) {
                        case 1: {
                            System.out.println("Here is the student before updating: ");
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.printf("\t\t\t|%-4s|%-25s|%5s|\n",
                                    "Code", "Name", "Mark");
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.println("\t\t\t" + x);
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.println("You required input your name");
                            tName = Validation.getString("Input student name: ", "This field is required.");
                            x.setName(tName);
                            System.out.println("Data updated successful!");
                            break;
                        }
                        case 2: {
                            System.out.println("Here is the student before updating: ");
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.printf("\t\t\t|%-4s|%-25s|%5s|\n",
                                    "Code", "Name", "Mark");
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.println("\t\t\t" + x);
                            System.out.println("\t\t\t+----+-------------------------+-----+");
                            System.out.println("You required input your mark");
                            tMark = Validation.getADouble("Input student mark: ", "Only update [0..10]", 0, 10);
                            x.setMark(tMark);
                            System.out.println("Data updated successful!");
                            break;
                        }
                        case 3:
                            break;
                    }
                } while (choice != 3);
            }
        }
    }

    /**
     * Hàm remove một HS, SV Hàm kiểm tra danh sách có ai không? Nếu có thì sẽ
     * yêu cầu nhập ID nếu không có đối tượng trong danh sách thì sẽ không tìm
     * thấy ngược lại thì sẽ hỏi bạn chắc chắn xóa HS, SV đó không nếu chọn "y"
     * thì xóa đối tượng không thì sẽ không xóa.
     */
    public void removeStudent() {
        if (this.isEmpty()) {
            System.out.println("=============================================");
            System.out.println("The list is emty.");
            System.out.println("=============================================");
        } else {
            String code = Validation.getID("Input ID(SXXX) to remove: ", "Student code must be in format (SXXX)"
                    + ". X is a digit.", "^(S|s)\\d{3}$");
            Student x = searchObjectStudent(code);
            if (x == null) {
                System.out.println("Student " + code + " doesn't existed.");
            } else {
                String choice = Validation.getID("Are you sure? (Y/N): ", "Only YES(Y) or NO(N) can be selected",
                        "(y|Y|n|N)");
                if (choice.equalsIgnoreCase("y")) {
                    this.remove(x);
                    System.out.println("Student " + code + " has been removed.");
                } else {
                    return;
                }
            }
        }
    }
}