package main;

import data.Car;

public class Tester {
    /*Chạy chương trình cho ra một đối tượng xe hoàn chỉnh.    
    */
    public static void main(String[] args) {
        Car c = new Car();
        //c là một Object. c new một constructor default, các giá trị sẽ về NULL
        c.pressStartButton();           
        c.pressAccesleratorButton();
        c.output();
        
        System.out.println("");
        
        Car c2 = new Car("red", 100, true, true);
        //c2 là một Object. c2 new một constructor và gán các giá trị vào phễu.
        c2.pressAccesleratorButton();
        c2.setColour("black"); //c2 thay đổi giá trị màu đỏ -> đen
        System.out.println("Colour of c2: " + c2.getColour());
        c2.output();
    }
}