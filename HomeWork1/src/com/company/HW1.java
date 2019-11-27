package com.company;

public class HW1 {

    public static void main(String[] args) {
	    int year = 2054;
	        if (year % 400 == 0) {
                if (year > 0 && year <= 3000)
                    System.out.println("Високостный год");
                else
                    System.out.println("Укажите год между 1 и 3000");
            }else if (year % 4 == 0) {
            if (year > 0 && year <= 3000)
                System.out.println("Високостный год");
            else
                System.out.println("Укажите год между 1 и 3000");
        }
            else {
                if (year > 0 && year<= 3000)
	                System.out.println("Это не високостный год");
                 else
                    System.out.println("Укажите год между 1 и 3000");
                }
        }

    }

