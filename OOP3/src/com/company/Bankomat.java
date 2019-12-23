package com.company;

public class Bankomat implements ATM {
    public Bankomat() {
        //создаем базу даннных карточек
        this._cards = new Card[]{
                new Card("1111111", "3345", 223.51f),
                new Card("1111112", "3445", 6655.1f),
                new Card("1111113", "3545", 557.54f),
                new Card("1111114", "3343", 10.5f)};

    }

    private Card[] _cards;
    private Card _usercard;

    public boolean checkPin(String cardId, String pin) {
        int i = 0;
        for (; i < _cards.length; i++) {
            if (this._cards[i].id.equals(cardId))
                this._usercard = this._cards[i];
            break;
        }
        // ! - инвертирует логическое значение
        if (this._usercard == null) {
            System.out.println("Неверный Id карточки");
            return false;
        }
        if (this._cards[i].pin.equals(pin)) {
            return true;
        }
        return false;


    }

    public void reject() {
        this._usercard = null;
    }

    public float getBalance() {
        return this._usercard.money;
    }

    public void getCash(float cash) {
        if (cash > this._usercard.money) {
            System.out.println("Недостаточно средств");
        } else {
            this._usercard.money -= cash;
        }
    }

    public void addCash(float cash) {
        this._usercard.money += cash;
    }

    class Card {
        String id;
        String pin;
        float money;

        public Card(String id, String pin, float money) {
            this.id = id;
            this.pin = pin;
            this.money = money;
        }
    }
}
