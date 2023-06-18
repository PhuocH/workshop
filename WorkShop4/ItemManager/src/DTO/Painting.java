package DTO;

import TC.IO;

public class Painting extends Item {
    /*Class dùng để nhập dữ liệu về painting bao gồm có đặc điểm
    chiều cao, chiều rộng, có màu nước hay không, có khung hay không.
    Và là class con của Item.
    */
    private int height;
    private int width;
    private boolean isWatercolour;
    private boolean isFramed;

    public Painting() {
        super();
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }
    

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed, int value, String creator) {
        super(value, creator);
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

    //Hàm yêu cầu nhập dữ liệu
    public void inputPainting() {
        //super input của class Item để có thể nhập những gì bên hàm inputItem.
        super.inputItem();
                                     //inputMsg             outputMsg          lowerBound  upBound                              
        height = IO.getAnInteger("Input the height: ", "Input the correct value", 0, 2147483647); //(2147483647 là giới hạn của Integer)
        width = IO.getAnInteger("Input the width: ", "Input the correct value", 0, 2147483647); //(2147483647 là giới hạn của Integer)
                                             //inputMsg             outputMsg
        isWatercolour = IO.getBoolean("Watercolor (true/false): ", "Only true/false");
        isFramed = IO.getBoolean("Framed (true/false): ", "Only true/false");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
    //Hàm yêu cầu xuất dữ liệu
    public void outputPainting() {
        //super output của class Item để có thể nhập những gì bên hàm outputItem.
        super.outputItem();
        System.out.println("Height: " + height);
        System.out.println("Width: " + width);
        System.out.println("Watercolour: " + isWatercolour);
        System.out.println("Framed: " + isFramed);
        System.out.println("================================================================");
        System.out.println("");
    }

}
