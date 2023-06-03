package data;

public class Car {
    /*Tạo những đặc điểm chung cho đối tượng là xe
    bao gồm màu xe, mã lực, có mui xe không, có phanh xe không.
    */
    private String colour;          //Đặc điểm của Object
    private int enginePower;        //Instance variable
    private boolean convertible;
    private boolean parkingBrake;   

    public Car() {
    }
    //Constructor không có dữ liệu => NULL, con trỏ sẽ đưa về dưới đáy RAM.
    
    public Car(String colour, int enginePower, boolean convertible, boolean parkingBrake) {
        this.colour = colour;
        this.enginePower = enginePower;
        this.convertible = convertible;
        this.parkingBrake = parkingBrake;
    }
    //Constructor tạo những đặc điểm chung để tạo ra 1 chiếc xe mới dựa trên constructor.
    
    public String getColour() {
        return colour;
    }
    //Giá trị sẽ trả về màu khi được gọi ra.

    public void setColour(String colour) {
        this.colour = colour;
    }
    //Giá trị sẽ được thay đổi khi gọi ra.

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isParkingBrake() {
        return parkingBrake;
    }

    public void setParkingBrake(boolean parkingBrake) {
        this.parkingBrake = parkingBrake;
    }
    
    public void pressStartButton() {
        System.out.println("You have pressed the start button");
    }
    
    public void pressAccesleratorButton() {
        System.out.println("You have pressed the Accelerator button");
    }

    @Override
    public String toString() {
        return "Car{" + "colour=" + colour + ", enginePower=" + enginePower + ", convertible=" + convertible + ", parkingBrake=" + parkingBrake + '}';
    }
           
    public void output() {
        System.out.printf("|%-10s|%3d|%-5s|%-5s|\n",
                            colour, enginePower, convertible, parkingBrake);
    }
    
}
