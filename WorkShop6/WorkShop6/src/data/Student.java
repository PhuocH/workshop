package data;

/**
 * Class biểu thị những đặc điểm chung của một học sinh, sinh viên.
 * @author ADMIN
 */
public class Student {
    private String code;
    private String name;
    private double mark;

    /**
     * Constructor default.
     */
    public Student() {
        this.code = "";
        this.name = "";
    }

    /**
     * Constructor field with:
     * @param code
     * @param name
     * @param mark 
     */
    public Student(String code, String name, double mark) {
        this.code = code;
        this.name = name;
        this.mark = mark;
    }
    
    /**
     * Hàm trả về giá trị MSSV, MSHS.
     * @return 
     */
    public String getCode() {
        return code;
    }
    
    /**
     * Hàm thay đổi giá trị MSSV, MSHS.
     * @param code 
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * Hàm trả về tên HS, SV.
     * @return 
     */
    public String getName() {
        return name;
    }

    /**
     * Hàm thay đổi tên HS, SV.
     * @param name 
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Hàm trả về điểm số.
     * @return 
     */
    public double getMark() {
        return mark;
    }

    /**
     * Hàm thay đổi giá trị điểm số.
     * @param mark 
     */
    public void setMark(double mark) {
        this.mark = mark;
    }

    /**
     * Hàm xuất thông tin ra màn hình theo định dạng một danh sách.
     * @return 
     */
    @Override
    public String toString() {
        return String.format("|%-4s|%-25s|%5.2f|", 
                               code, name, mark);
    }
    
    
}
