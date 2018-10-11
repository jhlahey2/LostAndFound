package com.lahey;

/**
 * @author jack lahey
 *
 * - Item ID
 * - Name
 * - Category (clothing, pet, other)
 * - Lost/Found
 *
 */
public class Item {

    private static int itemIDCounter = 0;
    private int itemID = 0;
    private String itemCategory = "";

    private String itemName = "";
    private boolean bIsLost = true;
    private boolean bIsDeleted = false;

    //Override Default Constructor
    Item() {

        itemID = ++itemIDCounter;

    }


    public int getItemID(){

        return this.itemID;
    }


    public void setItemCategory(String category){

        this.itemCategory = category;
    }

    public String getItemCategory(){

        return this.itemCategory;
    }


    public void setItemName(String name){

        this.itemName = name;
    }

    public String getItemName(){

        return this.itemName;
    }

    public void setBIsLost(boolean lost){

        this.bIsLost = lost;
    }
    public boolean getBIsLost(){

        return this.bIsLost;
    }

    public void setBIsDeleted(boolean value){

        this.bIsDeleted = value;
    }
    public boolean getBIsDeleted(){

        return this.bIsDeleted;
    }

    //equals method
    public boolean equals(Item item)
    {
        if(this.getItemCategory().equals(item.getItemCategory()) && this.getItemName().equals(item.getItemName())){

            return true;
        }
        else
        {
            return false;
        }
    }

}
