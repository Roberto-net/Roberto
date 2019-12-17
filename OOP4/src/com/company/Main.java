package com.company ;
public class Main {
    public static void main (String[] args){
        User user1 = new User();
        //user1.name = "Igor";
        //user1.age = 26;
        User user2 = new User();
        //user2.name = "Igor";
        //user2.age = 26;
        //user1.equals(user1);
        // user1 != user2 поскольку ссылки на экземпляры разные
        System.out.println(user1==user2);
        System.out.println(user1.equals(user2));
        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        //обязательно должно соблюдаться правило
        //если x.equals(y)== true то hash коды должны быть равны
        //но обратная логика не тождественна
        //x.equals(y)==y.equals(x); обязательное условие
        System.out.println(user1.getClass());
        System.out.println(user1.toString());
        System.out.println(user2.toString());
        user1.setName("umpa") ;
        user2.setName("lumpa");
        user1.setAge(200);
        //пример работы фабричного класса
        new UserFactory()
                .signIn("ggwfwer")
                .sendMessage("jjjuniper")
                .deactivate()
                .sendMessage("gggraaaaa")
                .activate()
                .sendMessage("yeah")
                .signOut();



    }
}
