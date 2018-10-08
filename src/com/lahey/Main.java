package com.lahey;

/**
 * @author Jack Lahey
 *
 * Assignment
 * Lost and Found
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
 *
 * (make sure you can always read a full sentence even if there are no items to list - see the message above )
 * 4. Delete found items
 *
 * 6. Undelete deleted items
 *
 * For each item you will have the following:
 *
 *
 * - Item ID
 * - Name
 *
 * - Category (clothing, pet, other)
 *
 * - Lost/Found
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to the lost and found");




        Item  item01 = new Item();
        System.out.println("The item ID is " + item01.getItemID());

        Item  item02 = new Clothing();
        System.out.println("\nThe item ID is " + item02.getItemID());
        System.out.println("The item Category is " + item02.getItemCategory());





        // write your code here
    }
}
