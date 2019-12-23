package com.company;


import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Bankomat bankomat=new Bankomat();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вставьте карту");
        String cardId = scanner.nextLine();
        boolean success = false;
        for (int i = 0; i <3;i++){
            System.out.println("Введите пин-код");
            String cardPin = scanner.nextLine();
            if(bankomat.checkPin(cardId,cardPin)){
                success=true;
                break;
            }
        }
        if(!success){
            System.out.println("Ваша карта заблокирована");
            return;
        }
        while (true){
            System.out.println("Главное меню");
            System.out.println("1 Показать баланс");
            System.out.println("2 Снять наличные");
            System.out.println("3 Пополнить счет");
            System.out.println("4 Завершить работу");
            int menu= scanner.nextInt();
            switch (menu) {
                case 4:
                    bankomat.reject();
                    System.out.println("Заберите вашу карту");
                    return;
                case 1:
                    float balance= bankomat.getBalance();
                    System.out.println(balance);
                    break;
                case 2:
                    System.out.println("Введите сумму");
                    float cash = scanner.nextFloat();
                    bankomat.getCash(cash);
                    break;
                case 3:
                    System.out.println("Введите сумму");
                    float cashAdd = scanner.nextFloat();
                    bankomat.addCash(cashAdd);
                    break;

            }
        }





    }
}
