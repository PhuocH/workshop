package DTO;

import TC.IO;

public class Statue extends Item {
    /*Class dùng để nhập dữ liệu về Statue bao gồm có đặc điểm
    cân nặng, màu và là class con của Item.
    */
    private int weight;
    private String colour;

    public Statue() {
        super();
        this.colour = "";
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Statue(int weight, String colour, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getCoulor() {
        return colour;
    }

    public void setCoulor(String colour) {
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Statue{" + "weight=" + weight + ", coulor=" + colour + '}';
    }
    //Hàm xuất ra dữ liệu Weight và Colour.
    public void outputStatue() {
        //super output của class Item để có thể nhập những gì bên hàm outputItem.
        super.outputItem();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
        System.out.println("================================================================");
        System.out.println("");
    }

    public void inputStatue() {
        //super input của class Item để có thể nhập những gì bên hàm inputItem.
        super.inputItem();
                                  //inputMsg             outputMsg          lowerBound  upBound                              
        weight = IO.getAnInteger("Input the weight: ", "Input the correct value", 0, 2147483647); //(2147483647 là giới hạn của Integer)
        colour = IO.getString("Input the colour: ", "This field is required!");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
    
}