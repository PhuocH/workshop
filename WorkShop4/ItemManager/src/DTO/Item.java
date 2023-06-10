package DTO;

import TC.IO;
import java.util.Scanner;

public class Item {
    protected int value;
    protected String creator;
    protected Scanner sc = new Scanner(System.in);

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
    public void outputItem() {
        System.out.printf("|%5d|%-8s",
                            value, creator);
    }
    
    public void inputItem() {        
        value = IO.getAnInteger("Input the value: ", "Input the correct value", 0, 2147483647);
        creator = IO.getString("Input the creator: ", "This field is required!");
    }
    
}
