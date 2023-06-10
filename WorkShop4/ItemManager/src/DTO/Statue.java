package DTO;

import TC.IO;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
    }

    public Statue(int weight, String coulor, int value, String creator) {
        super(value, creator);
        this.weight = weight;
        this.colour = coulor;
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
    
    public void outputStatue() {
        super.outputItem();
        System.out.printf("|%5d|%-8s|\n",
                            weight, colour);
        System.out.println("================================================================");
    }

    public void inputStatue() {
        super.inputItem();
        weight = IO.getAnInteger("Input the weight: ", "Input the correct value", 0, 2147483647);
        colour = IO.getString("Input the colour: ", "This field is required!");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
    
}
