package com.company;

public interface ATM {
    boolean checkPin (String cardId, String pin);
    float getBalance ();
    void getCash(float cash);
    void addCash (float cash);
    void reject ();

}
