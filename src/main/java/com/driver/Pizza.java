package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded = false;
    private boolean toppingAdded = false;
    private boolean takeAway = false;
    private boolean billDone = false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
            setPrice(300);
        else
            setPrice(400);
        // your code goes here
    }

    public void setPrice(int price) {
        this.price = price;
        bill = "Base Price Of The Pizza: " + price + "\n";
    }

//    public Boolean getVeg() {
//        return isVeg;
//    }
//
//    public void setVeg(Boolean veg) {
//        isVeg = veg;
//    }

//    public void setBill(String bill) {
//        this.bill = bill;
//    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!cheeseAdded){
            price += 80;
            cheeseAdded = true;
            bill += "Extra Cheese Added: 80\n";
        }
    }

    public void addExtraToppings(){
        addExtraCheese();
        if(!toppingAdded){
            if(isVeg) {
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            }
            else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            toppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeAway){
            price += 20;
            takeAway = true;
            bill += "Paperbag Added: 20\n";
        }
    }

    public String getBill(){
        if(!billDone){
            bill += "Total Price: " + price +"\n";
            billDone = true;
            return this.bill;
        }
        return "";
    }
}
