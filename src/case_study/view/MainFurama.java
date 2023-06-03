package case_study.view;

import case_study.controller.impl.FuramaController;

public class MainFurama {
    public static void main(String[] args) {
        FuramaController furamaController=new FuramaController();
        System.out.println("Welcome to the project management program Furama :\n" +
                "please select option :");
        furamaController.displayMainMenu();
    }
}
