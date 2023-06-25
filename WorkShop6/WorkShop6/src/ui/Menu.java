package ui;

import java.util.ArrayList;
import util.Validation;

/**
 * Lớp cho một menu từ 1 lựa chọn và thêm vào danh sách.
 * @author ADMIN
 */
public class Menu {
    private String menuTile;
    private ArrayList<String> optionList = new ArrayList<>();

    /**
     * Default constructor.
     */
    public Menu() {
        this.menuTile = "";
    }
        
    /**
     * Hàm khởi tạo tên của app, tên của menu.
     * @param menuTile 
     */
    public Menu(String menuTile) {
        this.menuTile = menuTile;
    }
    
    /**
     * Bổ sung một lựa chọn vào menu.
     * @param newOption 
     */
    public void addNewOption(String newOption) {
        optionList.add(newOption);
    }
    
    /**
     * Hàm xuất menu ra màn hình.
     */
    public void printMenu() {
        if (optionList.isEmpty()) {
            System.out.println("There is no item in the menu");
            return;
        }
        System.out.println("\n--------------------------------");
        System.out.println(menuTile);
        for (String x : optionList) {
            System.out.println(x);
        }
    }
    
    /**
     * Hàm trả về con số người dùng chọn ứng với chức năng mà người dùng muốn nhập
     * @return 
     */
    public int getChoice() {
        int maxOption = optionList.size();
        //Lựa chọn lớn nhất là số thứ tự ứng với số mục chọn
        String inputMsg = "Choose [1.." + maxOption + "]: ";
        String errorMsg = "You are required to choose the option 1.." + maxOption;
        return Validation.getAnInteger(inputMsg, errorMsg, 1, maxOption);
    }
}
