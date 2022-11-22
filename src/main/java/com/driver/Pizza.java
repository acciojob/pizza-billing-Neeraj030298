package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
            System.out.println("Base Price Of The Pizza: 300");
            price+= 300;
        } else {
            System.out.println("Base Price Of The Pizza: 400");
            price+= 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        System.out.println("Extra Cheese Added: 80");
          price+= 80;
    }

    public void addExtraToppings(){
       if(isVeg){
           System.out.println("Extra Toppings Added: 70");
           price+= 70;
       }
       else {
           System.out.println("Extra Toppings Added: 120");
           price+= 120;
       }
    }

    public void addTakeaway(){
        System.out.println("Paperbag Added: 20");
        price+=20;
    }

    public String getBill(){
        bill = "Total Price: "+this.getPrice();
          return this.bill;
    }
}
