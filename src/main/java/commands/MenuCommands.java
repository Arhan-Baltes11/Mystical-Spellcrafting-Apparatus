package src.main.java.commands;

import java.util.Scanner;

import src.main.java.spellcrafting.Spellcrafter;

public class MenuCommands {
    public void menuCommandReader(int commandNum, Scanner comm) {
        switch (commandNum) {
            case 1:
                Spellcrafter.craftSpellMenu(comm);
                break;
            case 2:
                // Do 2.
                break;
            case 3:
                System.out.println("Goodbye!");
                System.exit(0);
                break;
        }
        return;
    }
}
