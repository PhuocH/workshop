package DTO;

import TC.IO;

public class Painting extends Item{
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
        this.isFramed = isFramed;
    }

    @Override
    public String toString() {
        return "Painting{" + "height=" + height + ", width=" + width + ", isWatercolour=" + isWatercolour + ", isFramed=" + isFramed + '}';
    }

    public void inputPainting() {
        super.inputItem();
        height = IO.getAnInteger("Input the height: ", "Input the correct value", 0, 2147483647);
        width = IO.getAnInteger("Input the width: ", "Input the correct value", 0, 2147483647);
        System.out.print("Watercolor (true/false): ");
        isWatercolour = sc.nextBoolean();
        System.out.print("Framed (true/false): ");
        isFramed = sc.nextBoolean();
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }

    public void outputPainting() {
        super.outputItem();
        System.out.printf("|%5d|%5d|%-5s|%-5s|\n",
                            height, width, isWatercolour, isFramed);
        System.out.println("================================================================");
    }
    
    
}
