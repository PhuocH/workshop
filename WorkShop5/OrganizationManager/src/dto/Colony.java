package dto;

public class Colony extends Organizations{
    /*Class con Colony extends class Cha. Class này sẽ được thừa hưởng về size
    qua modifier protected. Trong class này có thêm đặc điểm và hành vi (place,
    gow(), reproduce() định nghĩ riêng cho class này.
    */
    protected String place;

    public Colony() {
        super();
        this.place = "";
    }

    public Colony(int size, String place) {
        super(size);
        this.place = place;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }
    
    /*Hàm communicateByTool được cha truyền lại theo phương thức Override và
    tự định nghĩa riêng theo cách của nó.*/
    @Override
    public void communicateByTool() {
        System.out.println("The colony communicate by sound.");
    }
    
    public void grow() {
        System.out.println("An annual cycle of growth that begins in spring");
    }
    
    public void reproduce() {
        System.out.println("Colony can reproduce itself through a process");
    }

    @Override
    public String toString() {
        return  "The colony size is: " + size + ", the colony's place is: " + place;
    }
    
    /*Hàm output được cha truyền lại theo phương thức Override và
    tự định nghĩa riêng theo cách của nó.*/
    @Override
    public void output() {
        System.out.println("Size: " + size);
        System.out.println("Place: " + place);
    }
}
