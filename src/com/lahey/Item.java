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
    protected int itemID = 0;
    protected String itemCategory = "";

    protected String itemName = "";
    protected boolean bIsLost = true;
    protected boolean bIsDeleted = false;

    //Override Default Constructor
    Item() {
        itemID = ++itemIDCounter;
    }

    //get itemID
    public int getItemID(){
        return this.itemID;
    }

    //itemCategory
    public void setItemCategory(String category){
        this.itemCategory = category;
    }

    public String getItemCategory(){
        return this.itemCategory;
    }

    //itemName
    public void setItemName(String name){
        this.itemName = name;
    }

    public String getItemName(){
        return this.itemName;
    }

    //isLost
    public void setBIsLost(boolean lost){
        this.bIsLost = lost;
    }
    public boolean getBIsLost(){
        return this.bIsLost;
    }

    //isLost
    public void setBIsDeleted(boolean value){
        this.bIsDeleted = value;
    }
    public boolean getBIsDeleted(){
        return this.bIsDeleted;
    }

}
