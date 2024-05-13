package src.main.java.spellcrafting;

import java.util.Scanner;

import src.main.java.commands.CommandHandler;

public class Spellcrafter {
    public static void craftSpellMenu(Scanner comm) {
        while (true) {
            System.out.println("This is the Spellcrafting Menu. Please type a number:");
            System.out.println("1. Make a new spell");
            System.out.println("2. Edit existing spell");
            System.out.println("3. Return to menu");
            Integer issuedCommand = Integer.parseInt(comm.nextLine());

            if (issuedCommand == 3) {
                return;
            } else {
                CommandHandler.spellcrafterCommandReader(issuedCommand, comm);
            }
        }
    }
}
