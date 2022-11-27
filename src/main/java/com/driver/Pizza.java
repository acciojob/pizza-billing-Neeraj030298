package com.driver;

public class Pizza {

    private int price =0;
    private Boolean isVeg;
    private String bill;
    boolean extracheese = false;
    boolean extratopping = false;
    boolean takeaway = false;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        if (isVeg) {
           // System.out.println("Base Price Of The Pizza: 300");
            price+= 300;
        } else {
                 price+= 400;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        //System.out.println("Extra Cheese Added: 80");
         if(!extracheese) {
             price+= 80;
             extracheese = true;
         }
    }

    public void addExtraToppings() {
        if (!extratopping) {
            if (isVeg) {
               // System.out.println("Extra Toppings Added: 70");
                price+= 70;
            } else {
                //System.out.println("Extra Toppings Added: 120");
                price+= 120;
            }
        }
        extratopping = true;
    }

    public void addTakeaway() {
      //  System.out.println("Paperbag Added: 20");
        if (!takeaway) {
            price += 20;
            takeaway = true;
        }
    }

    public String getBill(){
        if(isVeg)    System.out.print("Base Price Of The Pizza: 300\n");
         else        System.out.print("Base Price Of The Pizza: 400\n");
if(extracheese)  System.out.print("Extra Cheese Added: 80\n");
if(extratopping) {
    if(isVeg)  System.out.print("Extra Toppings Added: 70\n");

    else  System.out.print("Extra Toppings Added: 120\n");
}
if(takeaway)         System.out.print("Paper bag Added: 20\n");

        bill = "Total Price: "+this.getPrice()+"\n";
          return bill;
    }
}
