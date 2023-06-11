package DTO;

import TC.IO;

public class Statue extends Item {

    private int weight;
    private String colour;

    public Statue() {
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
    
    public void outputStatue() {
        super.outputItem();
        System.out.println("Weight: " + weight);
        System.out.println("Colour: " + colour);
        System.out.println("================================================================");
        System.out.println("");
    }

    public void inputStatue() {
        super.inputItem();
        weight = IO.getAnInteger("Input the weight: ", "Input the correct value", 0, 2147483647);
        colour = IO.getString("Input the colour: ", "This field is required!");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
    
}