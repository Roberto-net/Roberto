package com.company;

public class Jura extends CoffeMachine {
    public Jura () {
            super.name="Jura";
            super.tankWater = 40.0f;
            super.tankCoffe = 10.0f;
            super.waterLevel = tankWater;
            super.coffeLevel = tankCoffe;
            super.waterSpend = 0.035f;
            super.coffeSpend = 0.015f;
        }
        public void model (){
            System.out.println("Ваша кофе машина марки - " + name);
            System.out.print(" Версия 1.01");
        };
}
