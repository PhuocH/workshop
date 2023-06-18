package DTO;

import TC.IO;
import java.util.Scanner;

public class Item {
    /*Class Item dùng để khai báo những giá trị và tên người lập ra dự án
    và đây cũng là Class cha trong package DTO
    */
    protected int value;
    protected String creator;
    protected Scanner sc = new Scanner(System.in);

    public Item() {
        this.creator = "";
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
    
    //Hàm xuất ra dữ liệu Value và Creator.
    public void outputItem() {
        System.out.println("Value: " + value);
        System.out.println("Creator: " + creator);
    }
    
    //Hàm nhập dữ liệu từ bàn phím
    public void inputItem() {
                                 //inputMsg             outputMsg          lowerBound  upBound(2147483647
                                 //                                                             là giới hạn của Integer)
        value = IO.getAnInteger("Input the value: ", "Input the correct value", 0, 2147483647);
        creator = IO.getString("Input the creator: ", "This field is required!");
    }
    
}
