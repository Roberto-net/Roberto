package com.company;
import java.lang.String;
import java.util.Date;


public class Main {
    public static void main(String [] args){
        User user = new User();
        user.language = Language.RU;
        switch (user.language){
            case EN:
                System.out.println("Иностранный язык");
                break;
            case CH:
                System.out.println("Это иностранный язык");
                break;
            case BY:
            case RU:
                System.out.println("НЕ инсотранный");
                break;
            default:
                    System.out.println("Родственный язык");
        }
        System.out.println(user.language);
        user.color= Color.BLACK;
        System.out.println(user.color.getValue());
        Math m=Math.SUM;
        System.out.println(m.action(7,9));
        m=Math.MULTIPLY;
        System.out.println(m.action(7,9));

        //String

        StringBuilder st= new StringBuilder("yyy");
        //добавляет в конец строки
        st.append("uut");
        String s="  mO Ki ";
        System.out.println(s.charAt(3));
        System.out.println(s.codePointCount(0,2));
        s="hhH";
        System.out.println();
        byte [] b;
        b = s.getBytes();
        for (int i = 0;i<b.length;i++){
            System.out.println(b[i]);
        }
        //преобразование массива байт в строку
        String bytetostring=new String(b);
        System.out.println(bytetostring);
        s.indexOf(55);//возвращает индекс символа по номеру ASCII таблицы
        //split разделяет строку по определителю(строка или символ)
        s.split(" ");
        //форматирование строк
        /* флаги форматирования
        %s - string
        %d - digit(любое целое число int, long)
        %f - double/float
        %b - boolean
        %c - char
        %t - date (year, month)
        %% - вывод символа процента
        \n - переход на новую строку
        \t - символ табуляции
        \b - удаляет предыдущий символ
        \\- выводит  \
        */
        float high = 185.1f;
        /*String sFormat = new String.format(
                "My name is %s.I am %d years old.\nMy high %f sm.\nI will know JAVA at 100%%.",
                "Ctulhu", 31, high);
        System.out.println(sFormat);*/
        Date d = new Date();
        System.out.println(d);
        String sFormat2= String.format(
                "Мое счастливое число  - %2$d. Мой любимый цвет %1$s",
                "red", 24);
        System.out.println(sFormat2);
        // преобразование нестркоовых объектов в строки
        //String sa= String.valueOf(high);
        System.out.println(String.valueOf(high));


    }
}
