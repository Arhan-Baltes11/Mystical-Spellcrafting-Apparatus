package src.main.java;

import java.util.Scanner;

import src.main.java.commands.MenuCommands;

public class Menu {

    public static void startMenu() {
        MenuCommands menuComms = new MenuCommands();
        Scanner comm = new Scanner(System.in);
        while (true) {
            System.out.println("This is the main menu. Please type a number:");
            System.out.println("1. Spellcrafting");
            System.out.println("2. Spellbook");
            System.out.println("3. Quit");
            String issuedCommand = comm.nextLine();
            menuComms.menuCommandReader(Integer.parseInt(issuedCommand), comm);
        }
    }
}
