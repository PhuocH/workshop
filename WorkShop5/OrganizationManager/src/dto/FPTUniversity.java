package dto;

public class FPTUniversity extends University implements Role{
    /*Class FPTUniversity kế thừa class University và có thêm những hành vi ở class 
    Interface Role.*/
    private String address;

    public FPTUniversity() {
        super();
        this.address = "";
    }

    public FPTUniversity(String name, int size, String address) {
        super(size, name);
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "FPTU has four campuses Hanoi, HCM, DaNang, CanTho, QuyNhon.";
    }
    
    @Override
    public void output() {
        super.output();
        System.out.println("Address: " + address);
    }

    @Override
    public void createWorker() {
        System.out.println("Providing human resources.");
    }
}
