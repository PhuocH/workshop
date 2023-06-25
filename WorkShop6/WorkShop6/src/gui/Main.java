package gui;

import data.StudentList;
import ui.Menu;

/**
 * Class xử lý tất cả những thông tin của class khác, chạy chương trình.
 * @author ADMIN
 */
public class Main {
    
    /**
     * Hàm xử lý tất cả thông tin, hàm chạy chương trình.
     * @param args 
     */
    public static void main(String[] args) {
        Menu menu = new Menu("Welcome to Student Management.");
        menu.addNewOption("1. Add new student.");
        menu.addNewOption("2. Search a student by ID.");
        menu.addNewOption("3. Update student information.");
        menu.addNewOption("4. Remove a student.");
        menu.addNewOption("5. Print the entire list of students.");
        menu.addNewOption("6. Exit.");
        int choice;
        StudentList st = new StudentList();
        do {
            menu.printMenu();
            choice = menu.getChoice();
            switch (choice) {
                case 1:                    
                    st.addAStudent();
//                    st.addAllStudent(); //Add đối tượng có sẵn.
                    break;
                case 2:
                    st.searchStudent();
                    break;
                case 3:
                    st.updateStudent();
                    break;
                case 4:
                    st.removeStudent();
                    break;
                case 5:
                    st.printAll();
                    break;
                case 6:
                    break;
            }
        } while (choice != 6);
    }    
}
