package com.lahey;
import java.util.Scanner;
import java.util.ArrayList;

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

public class LostAndFound {

    public void initializeArray(ArrayList<Item> list){
        System.out.println("\nInitialize Array");

        Clothing a = new Clothing();
        a.setItemName("shirt");
        a.setBIsLost(true);
        a.setBIsDeleted(false);
        list.add(a);

        Clothing b = new Clothing();
        b.setItemName("shirt");
        b.setBIsLost(true);
        b.setBIsDeleted(false);
        list.add(b);

        Clothing c = new Clothing();
        c.setItemName("shirt");
        c.setBIsLost(true);
        c.setBIsDeleted(false);
        list.add(c);

        Pet d = new Pet();
        d.setItemName("cat");
        d.setBIsLost(true);
        d.setBIsDeleted(false);
        list.add(d);

        Pet e = new Pet();
        e.setItemName("dog");
        e.setBIsLost(true);
        e.setBIsDeleted(false);
        list.add(e);

        Other f = new Other();
        f.setItemName("hat");
        f.setBIsLost(true);
        f.setBIsDeleted(false);
        list.add(f);

        Other g = new Other();
        g.setItemName("hat");
        g.setBIsLost(true);
        g.setBIsDeleted(false);
        list.add(g);

    }//end public void initializeArray(ArrayList<Item> list)


    public void displayLostItem(Item item){

        System.out.println("\nView Lost Items");
        System.out.print("ItemID: " + item.getItemID() + " is in the " + item.getItemCategory() + " category "
                + ", named " + item.getItemName() );
        if(item.getBIsLost() == true)
            System.out.print(", and is lost ");
        else
            System.out.print(", and is not lost ");
        if(item.getBIsDeleted() == true)
            System.out.print(", and is deleted ");
        else
            System.out.print(", and is not deleted ");

        System.out.println("\n");
    }//end public void displayLostItem(Item item)


    public void viewLostItems(ArrayList<Item> list){

        System.out.println("\nView Lost Items");

        for (Item temp : list) {
            displayLostItem(temp);
        }
    }//end public void viewLostItems(ArrayList<Item> list)


    public void displayCategoryCount(ArrayList<Item> list){

        System.out.println("\nView Lost Items");

        int iClothing = 0;
        int iPets = 0;
        int iOther = 0;

        for (Item temp : list) {

//            displayLostItem(temp);
            if (temp.itemCategory.equals("Clothing")) {
                iClothing++;
            } else if (temp.itemCategory.equals("Pet")) {
                iPets++;
            } else if (temp.itemCategory.equals("Other")) {
                iOther++;

            }//end if

        }//end for (Item temp : list)

        System.out.print("There are ");

        if(iClothing > 0)
        {
            System.out.print(iClothing + " items of clothing ");
        }

        if(iPets > 0)
        {
            System.out.print(iPets + " pets ");
        }

        if(iOther > 0)
        {
            System.out.print("and " +iOther + " Other items");
        }//end if
        System.out.println(" missing");

    }//end     public void displayCategoryCount(ArrayList list)

    public void reportLostItem( ArrayList<Item> list, Scanner scan){

        System.out.println("\nReport Lost Item");

        String sInputString = "";
        char categorySelection = ' ';
        char deleteSelection = ' ';
        Item newItem = null;
//        String newItemCategory = "";
//        String inputItemName = "";

        //get category of lost item
        do {
            System.out.println("Please Choose Category of your lost item, \"C\" Clothing or \"P\" Pet, or \"O\" Other");

            categorySelection = Character.toLowerCase(scan.next().charAt(0));
            scan.nextLine();

            //create new
            if (categorySelection == 'c') {

                newItem = new Clothing();

            } else if (categorySelection == 'p') {

                newItem = new Pet();

            } else if (categorySelection == 'o') {

                newItem = new Other();

            }//end if (categorySelection == 'c')

        }while( !(categorySelection == 'c') &&  !(categorySelection == 'p') &&  !(categorySelection == 'o') );

        //get name of lost item
        System.out.println("What is the name of your lost item?");

        sInputString = scan.nextLine();
        newItem.setItemName(sInputString);

        list.add(newItem);

    }//end public void reportLostItem(ArrayList<Item> list, Scanner keyboard)

    public void findLostItems(ArrayList<Item> list, Scanner scan){

        System.out.println("\nFind Lost Items");

//        String sInputString = "";
//        char categorySelection = ' ';
//        char deleteYesNo = ' ';
//        Item foundItem = null;
////        String newItemCategory = "";
////        String inputItemName = "";
//
//        //get category of lost item
//        do {
//            System.out.println("Please Choose Category of your lost item, \"C\" Clothing or \"P\" Pet, or \"O\" Other");
//
//            categorySelection = Character.toLowerCase(scan.next().charAt(0));
//            scan.nextLine();
//
////            //create new
////            if (categorySelection == 'c') {
////
////                newItem = new Clothing();
////
////            } else if (categorySelection == 'p') {
////
////                newItem = new Pet();
////
////            } else if (categorySelection == 'o') {
////
////                newItem = new Other();
////
////            }//end if (categorySelection == 'c')
//
//        }while( !(categorySelection == 'c') &&  !(categorySelection == 'p') &&  !(categorySelection == 'o') );
//
//        //get name of lost item
//        System.out.println("What is the name of your lost item?");
//
//
//
//
//
//        //get category of lost item
//        do {
//
//            System.out.println("Do you want to delete this item?  Enter, \"Y\" or \"N\" ");
//
//            deleteYesNo = Character.toLowerCase(scan.next().charAt(0));
//            scan.nextLine();
//
//        }while( !(deleteYesNo == 'y') &&  !(deleteYesNo == 'n') );
//
//
//
//
//        if( (deleteYesNo == 'y') )
//            foundItem.setBIsDeleted(true);
//        else if(deleteYesNo == 'n') )
//            foundItem.setBIsDeleted(false);

    }//end public void findLostItems(ArrayList<Item> list, Scanner scan)


    public static  void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String sInput = "";
        char chMenuChoice = ' ';

        LostAndFound  coatCheck = new LostAndFound();

        ArrayList<Item>items = new ArrayList<Item>();

        coatCheck.initializeArray(items);

        System.out.println("Welcome to the lost and found");

//        while (!(chMenuChoice == 'v') && !(chMenuChoice == 'r') && !(chMenuChoice == 'f') && !(chMenuChoice == 'q')) {
        while (!(chMenuChoice == 'q')) {

            System.out.println("\t\n\nPlease choose an option: "
                    + "\n\t\"V\" to View all lost and found items "
                    + "\n\t\"S\" to View a summary of lost and found items "
                    + "\n\t\"R\" to Report a lost item "
                    + "\n\t\"F\" to Find your lost item "
                    + "\n\t\"Q\" to Quit\n");

            chMenuChoice = Character.toLowerCase(keyboard.next().charAt(0));
            keyboard.nextLine();

            if (chMenuChoice == 'v') {

                //view lost and found items
                coatCheck.viewLostItems(items);

            } else if (chMenuChoice == 's') {

                //Report lost item
                coatCheck.displayCategoryCount(items);

            } else if (chMenuChoice == 'r') {

                //Report lost item
                coatCheck.reportLostItem(items , keyboard);

            } else if (chMenuChoice == 'f') {

                //find lost item
                coatCheck.findLostItems(items , keyboard);

            } else if (chMenuChoice == 'q') {
                //quit
            }

//        Item  item01 = new Item();
//        System.out.println("The item ID is " + item01.getItemID());
//
//        Item  item02 = new Clothing();
//        System.out.println("\nThe item ID is " + item02.getItemID());
//        System.out.println("The item Category is " + item02.getItemCategory());

        }//end while( !(chMenuChoice == 'v') && !(chMenuChoice == 'r') && !(chMenuChoice == 'f') && !(chMenuChoice == 'q') )

    }//end public static void main(String[] args)


}//end public class LostAndFound
