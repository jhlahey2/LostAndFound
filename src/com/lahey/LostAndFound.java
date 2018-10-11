package com.lahey;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * @author jack lahey
 */
public class LostAndFound {

    public static final ArrayList<Item> lostItemList = new ArrayList<Item>();

    //default constructor
    public LostAndFound() {

        initializeArray(lostItemList);
        System.out.println("Welcome to the lost and found!");
    }


    private void initializeArray(ArrayList<Item> list){

        Clothing a = new Clothing();
        a.setItemName("blouse");
        a.setBIsLost(true);
        a.setBIsDeleted(false);
        list.add(a);

        Clothing b = new Clothing();
        b.setItemName("skirt");
        b.setBIsLost(true);
        b.setBIsDeleted(false);
        list.add(b);

        Clothing c = new Clothing();
        c.setItemName("shoes");
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
        f.setItemName("wallet");
        f.setBIsLost(true);
        f.setBIsDeleted(false);
        list.add(f);

        Other g = new Other();
        g.setItemName("boat");
        g.setBIsLost(true);
        g.setBIsDeleted(false);
        list.add(g);

    }//end public void initializeArray(ArrayList<Item> list)


    public void displayItem(Item item){

        System.out.println("\nDisplay Lost Items");

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



    public void viewLostItems(){

        System.out.println("\nView Lost Items");

        for (Item temp : lostItemList) {

            displayItem(temp);
        }
    }//end public void viewLostItems(ArrayList<Item> list)



    public void displayCategoryCount(){

        System.out.println("\nView Lost Items");

        int iClothing = 0;
        int iPets = 0;
        int iOther = 0;

        for (Item temp : lostItemList) {

            if (temp.getItemCategory().equals("Clothing")) {
                iClothing++;
            } else if (temp.getItemCategory().equals("Pet")) {
                iPets++;
            } else if (temp.getItemCategory().equals("Other")) {
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


    public void addLostItem(Scanner scan){

        System.out.println("\nReport Lost Item");

        String sInputString = "";
        char categorySelection = ' ';
        char deleteSelection = ' ';
        Item newItem = null;
        Item foundItem = null;

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

        sInputString = scan.nextLine().toLowerCase();
        newItem.setItemName(sInputString);

        foundItem = findItem(newItem);
        if( foundItem == null ){

            lostItemList.add(newItem);
            System.out.println("Your item has been added");
        }
        else{

            System.out.println("Sorry, your item is already in the lost and found. .");
        }

    }//end public void addLostItem(Scanner scan)


    public void seekLostItem(Scanner scan){

        System.out.println("\nFind Lost Items");

        String sIinputItemName = "";
        char categorySelection = ' ';
        char deleteYesNo = ' ';
        Item searchItem = null;
        Item foundItem = null;
//        Item newItem = null;//        boolean bFalse = false;

        //get category of lost item
        do {
            System.out.println("Please Choose Category of your lost item, \"C\" Clothing or \"P\" Pet, or \"O\" Other");

            categorySelection = Character.toLowerCase(scan.next().charAt(0));
            scan.nextLine();

        }while( !(categorySelection == 'c') &&  !(categorySelection == 'p') &&  !(categorySelection == 'o') );

            //create new
            if (categorySelection == 'c') {

                searchItem = new Clothing();

            } else if (categorySelection == 'p') {

                searchItem = new Pet();

            } else if (categorySelection == 'o') {

                searchItem = new Other();

            }//end if (categorySelection == 'c')

        //get name of lost item
        System.out.println("What is the name of your lost item?");
        sIinputItemName = scan.nextLine();

        searchItem.setItemName(sIinputItemName);

        //does new item equal an item in the arraylist?
        //if so return the item
        //else return null
        foundItem = findItem(searchItem);
        if( !(foundItem == null) ){

            System.out.println("Your item is found!");
            displayItem(searchItem);
        }
        else{

            System.out.println("Sorry, your item was not found in the Lost & Found.");
        }


        do {

            if( foundItem.getBIsDeleted() == false){

                System.out.println("Do you want to DELETE this item?  Enter, \"Y\" or \"N\" ");

            }
            else
            {
                System.out.println("Do you want to UN-DELETE this item?  Enter, \"Y\" or \"N\" ");

            }

            deleteYesNo = Character.toLowerCase(scan.next().charAt(0));
            scan.nextLine();

        }while( !(deleteYesNo == 'y') &&  !(deleteYesNo == 'n') );


        if( foundItem.getBIsDeleted() == false){

            if( (deleteYesNo == 'y') ){

                foundItem.setBIsDeleted(true);
            }
        }
        else
        {
            if( (deleteYesNo == 'y') ){

                foundItem.setBIsDeleted(false);
            }

        }//if( foundItem.getBIsDeleted() == false)

    }//end public void seekLostItem(Scanner scan)


    public Item findItem(Item item){

        for( Item arrayItem : lostItemList ){

            if(arrayItem.equals(item)) {

                System.out.println("got here 1");

                return arrayItem;
            }

        }//end for( Item arrayItem : lostItemList )
        System.out.println("got here 1");

        //if not found return null
        return null;

    }//end public Item FindLostItem(Item item)

}//end public class LostAndFound
