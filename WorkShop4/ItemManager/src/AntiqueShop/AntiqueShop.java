package AntiqueShop;

import DTO.*;
import TC.IO;
import java.util.*;

public class AntiqueShop {
    
    public static void main(String[] args) {
        Item item = null;
        Scanner sc = new Scanner(System.in);        
        int op;
        do {
            menu();
            op = IO.getAnInteger("Input your choice: ", "PLEASE INPUT FROM 1..5", 1, 5);
            switch (op) {
                case 1:
                    item = new Vase();
                    ((Vase)item).inputVase();
                    break;
                case 2:
                    item = new Statue();
                    ((Statue)item).inputStatue();
                    break;
                case 3:
                    item = new Painting();
                    ((Painting)item).inputPainting();
                    break;
                case 4:
                    if (item != null) {
                        if (item instanceof Vase)
                            ((Vase)item).outputVase();
                        else if (item instanceof Statue)
                            ((Statue)item).outputStatue();
                        else if(item instanceof Painting)
                            ((Painting)item).outputPainting();
                    }
                    else
                        System.out.println("You need to create an object");
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    break;
            }
        } while (op != 5);
        
    }
    
    public static void menu() {
        System.out.println("1. Create a Vase.");
        System.out.println("2. Create a Statue.");
        System.out.println("3. Create a Painting.");
        System.out.println("4. Display the Item.");
        System.out.println("5. Exit.");        
    }
    
}