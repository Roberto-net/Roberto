package com.company;

public class Siemens extends CoffeMachine  {

    public Siemens () {
        super.name="Siemens";
        super.tankWater = 20.0f;
        super.tankCoffe = 7.0f;
        super.waterLevel = tankWater;
        super.coffeLevel = 0.0f;
        super.waterSpend = 0.03f;
        super.coffeSpend = 0.01f;
    }
    public void model (){
        System.out.println("Ваша кофе машина марки - " + name);
        System.out.print("----Enjoy----");
    }


}

