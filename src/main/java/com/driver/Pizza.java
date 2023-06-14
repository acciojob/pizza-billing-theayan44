package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean cheeseAdded = false;
    private boolean toppingAdded = false;
    private boolean takeAway = false;

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
        }
    }

    public void addExtraToppings(){
        addExtraCheese();
        if(!toppingAdded){
            if(isVeg)
                price += 70;
            else
                price += 120;
            toppingAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeAway){
            price += 20;
            takeAway = true;
        }
    }

    public String getBill(){
        bill = "Total Price: " + price;
        return this.bill;
    }
}
