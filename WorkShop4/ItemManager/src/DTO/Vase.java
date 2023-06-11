package DTO;

import TC.IO;

public class Vase extends Item{
    private int height;
    private String material;
       
    public Vase() {
        this.material = "";
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public Vase(int height, String material, int value, String creator) {
        super(value, creator);
        this.height = height;
        this.material = material;
    }
    
    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Vase{" + "height=" + height + ", material=" + material + '}';
    }
    
    public void outputVase() {
        super.outputItem();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
        System.out.println("================================================================");
        System.out.println("");
    }
    
    public void inputVase() {
        super.inputItem();
        height = IO.getAnInteger("Input the height: ", "Input the correct value", 0, 2147483647);
        material = IO.getString("Input the material: ", "This field is required!");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
}
