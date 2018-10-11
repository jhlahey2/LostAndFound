package com.lahey;
import java.util.Scanner;

/**
 * @author jhlahey
 *
 * Assignment
 * You are going to create an application to keep track of lost and found items.
 *
 * This appliation is going to allow you to:
 *
 * 1. Add a lost item
 *
 * 2. Mark an exsting item as lost OR found
 *
 * 3. Show a count of items in each category (clothing, pet, other)  as follows:
 *
 * There are 3 item(s) of clothing, 4 pet(s) and 3 other items missing
 *
 * There are 4 item(s) of clothing and 1 other item missing
 *
 * (make sure you can always read a full sentence even if there are no items to list - see the message above )
 *
 * 4. Delete found items
 *
 * 6. Undelete deleted items
 *
 *
 *
 * For each item you will have the following:
 *
 * - Item ID
 *
 * - Name
 *
 * - Category (clothing, pet, other)
 *
 * - Lost/Found
 */
public class Main {

    public static  void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String sInput = "";
        char chMenuChoice = ' ';

        LostAndFound  coatCheck = new LostAndFound();

        while (!(chMenuChoice == 'q')) {

            System.out.println("\t\n\nPlease choose an option: "
                    + "\n\t\"V\" to View all lost and found items "
                    + "\n\t\"S\" to View a summary of lost and found items "
                    + "\n\t\"A\" to Add a lost item "
                    + "\n\t\"F\" to Find a lost item "
                    + "\n\t\"Q\" to Quit\n");

            chMenuChoice = Character.toLowerCase(keyboard.next().charAt(0));
            keyboard.nextLine();

            if (chMenuChoice == 'v') {

                //view lost and found items
                coatCheck.viewLostItems();

            } else if (chMenuChoice == 's') {

                //Report lost item
                coatCheck.displayCategoryCount();

            } else if (chMenuChoice == 'a') {

                //Report lost item
                coatCheck.addLostItem(keyboard);

            } else if (chMenuChoice == 'f') {

                //find lost item
                coatCheck.seekLostItem(keyboard);

            } else if (chMenuChoice == 'q') {
                //quit
            }

        }//end while (!(chMenuChoice == 'q'))

    }//end public static void main(String[] args)

}//end public class Main
