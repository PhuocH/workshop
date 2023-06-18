package dto;

public class University extends Organizations {
    /*Class University kế thừa class Organizations và có đặc điểm riêng là name.*/
    protected String name;

    public University() {
        super();
        this.name = "";
    }

    public University(int size, String name) {
        super(size);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Encourage the advancement and development of knowledge";
    }

    @Override
    public void communicateByTool() {
        System.out.println("In the university, people communicate by voice");
    }

    public void enroll() {
        System.out.println("The registrantion for enrollment is only valid when "
                + "the University has received all enrollment documents and enrollment fees");
    }

    public void educate() {
        System.out.println("Provide education at university standard");
    }

    @Override
    public void output() {
        System.out.println("Size: " + size);
        System.out.println("Name: " + name);
    }

}
