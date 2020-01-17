package com.company;

public class User  {
    private int money ;

    public int getMoney() {
        return this.money;
    }
    public void setMoney(int money) {
        this.money = money;
    }
    @Override
    public String toString(){
        return String.valueOf(this.money);
    }

}
