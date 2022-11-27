package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        this.addExtraCheese();
       this.addExtraToppings();
    }

  //  @Override
//    public void addExtraCheese() {
//        //super.addExtraCheese();
//    }

  //  @Override
//    public void addExtraToppings() {
//        //super.addExtraToppings();
//    }
}
