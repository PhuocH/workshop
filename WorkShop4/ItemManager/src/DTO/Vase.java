package DTO;

import TC.IO;

public class Vase extends Item{
    /*Class dùng để nhập dữ liệu về Vase bao gồm có đặc điểm
    chiều cao, chất liệu và là class con của Item.
    */
    private int height;
    private String material;
       
    public Vase() {
        super();
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
    
    //Hàm yêu cầu xuất dữ liệu
    public void outputVase() {
        //super output của class Item để có thể nhập những gì bên hàm outputItem.
        super.outputItem();
        System.out.println("Height: " + height);
        System.out.println("Material: " + material);
        System.out.println("================================================================");
        System.out.println("");
    }
    
    //Hàm yêu cầu nhập dữ liệu
    public void inputVase() {
        //super input của class Item để có thể nhập những gì bên hàm inputItem.
        super.inputItem();
                                   //inputMsg             outputMsg          lowerBound  upBound  
        height = IO.getAnInteger("Input the height: ", "Input the correct value", 0, 2147483647); //(2147483647 là giới hạn của Integer)
                                   //inputMsg             outputMsg
        material = IO.getString("Input the material: ", "This field is required!");
        System.out.println("Data import successful!!\n");
        System.out.println("");
    }
}
