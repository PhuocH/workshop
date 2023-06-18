package data;

public class Guitar {

    /*Class Tạo những đặc điểm chung cho đối tượng là Guitar
    bao gồm mã số, giá tiền, thiết kế, mẫu mã, phần phía sau của Guitar, 
    phần trên của Guitar.
     */
    
    private String serialNumber;        //Đặc điểm của Object
    private double price;               //Instance variable
    private String builder, model;
    private String backWood, topWood;

    public Guitar() {
        this.serialNumber = "";
        this.builder = "";
        this.model = "";
        this.backWood = "";
        this.topWood = "";
    }
    //Constructor không có dữ liệu => NULL, con trỏ sẽ đưa về dưới đáy RAM.
    
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood) {
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    //Constructor tạo những đặc điểm chung để tạo ra 1 chiếc xe mới dựa trên constructor.
    
    public String getSerialNumber() {
        return serialNumber;
    }
    //Giá trị sẽ trả về mã số khi được gọi ra.
    
    public void setSerialNumber(String serialNumber) {
        if (!this.serialNumber.isEmpty()) {
            this.serialNumber = serialNumber;
        }
    }
    //Giá trị thay đổi không được rỗng, nếu rỗng JVM sẽ giết app không chạy nữa.
    
    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getBuilder() {
        return builder;
    }

    public void setBuilder(String builder) {
        this.builder = builder;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBackWood() {
        return backWood;
    }

    public void setBackWood(String backWood) {
        this.backWood = backWood;
    }

    public String getTopWood() {
        return topWood;
    }

    public void setTopWood(String topWood) {
        this.topWood = topWood;
    }

    public void createSound() {
        System.out.printf("|%-5s|%9.3f|%-7s|%-10s|%-10s|%-10s|\n",
                serialNumber, price, builder, model, backWood, topWood);
    }

}
