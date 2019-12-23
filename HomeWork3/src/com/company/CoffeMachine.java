package com.company;

public abstract class CoffeMachine implements menu {
    public String name;
    public float tankWater = 0.0f;
    public float tankCoffe = 0.0f;
    public float waterLevel = tankWater;
    public float coffeLevel = tankCoffe;
    public float waterSpend = 0.0f;
    public float coffeSpend = 0.0f;

    abstract public void model();

    public void levelWater() {
        float percent = this.waterLevel * 100 / this.tankWater;
        System.out.println("Уровень воды в баке ");
        System.out.format("%.1f", percent);
        System.out.print("%");
    }

    public void levelCoffe() {
        float percent = this.coffeLevel * 100 / this.tankCoffe;
        System.out.println("Уровень кофе в баке ");
        System.out.format("%.1f", percent);
        System.out.print("%");
    }

    public void typeC(String type) {
        float coffe = 0.0f;
        float water = 0.0f;
        if (this.waterLevel < waterSpend) {
            System.out.println("Уровень воды в баке ");
            System.out.print(this.waterLevel);
            System.out.println("");
            System.out.println("Необходимо пополнить уровень воды в баке!");
            if (this.coffeLevel < coffeSpend) {
                System.out.println("Уровень кофе в баке ");
                System.out.print(this.coffeLevel);
                System.out.println("");
                System.out.println("Необходимо пополнить запас кофе!");
                return;
            }
        }
        switch (type) {
            case "Americano":
                if (this.waterLevel < waterSpend) {
                    System.out.println("Уровень воды в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println();
                    System.out.println("Необходимо пополнить уровень воды в баке!");
                    return;
                }
                if (this.coffeLevel <coffeSpend) {
                    System.out.println("Уровень кофе в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println();
                    System.out.println("Необходимо пополнить уровень кофе в баке!");
                    return;
                }
                else {
                    this.waterLevel -= waterSpend;
                    this.coffeLevel -= coffeSpend;
                    System.out.println("Заберите Ваш Американо");
                    return;
                }
            case "Espresso":
                if (this.waterLevel < water) {
                    System.out.println("Уровень воды в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println("");
                    System.out.println("Необходимо пополнить уровень воды в баке!");
                    return;
                }
                if (this.coffeLevel <(1.5f * coffeSpend)) {
                    System.out.println("Уровень кофе в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println();
                    System.out.println("Необходимо пополнить уровень кофе в баке!");
                    return;
                } else {
                    this.waterLevel -= waterSpend;
                    this.coffeLevel -= (1.5f * coffeSpend);
                    System.out.println("Заберите Ваш Эспрессо");
                    return;
                }
            case "DoubleEspresso":
                if (this.waterLevel < waterSpend) {
                    System.out.println("Уровень воды в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println();
                    System.out.println("Необходимо пополнить уровень воды в баке!");
                    return;
                }
                if (this.coffeLevel <(3.0f * coffeSpend)) {
                    System.out.println("Уровень кофе в баке ");
                    System.out.print(this.waterLevel);
                    System.out.println();
                    System.out.println("Необходимо пополнить уровень кофе в баке!");
                    return;
                }
                else {
                    this.waterLevel -= waterSpend;
                    this.coffeLevel -= (3.0f * coffeSpend);
                    System.out.println("Заберите Ваш Двойной эсперессо");
                    return;
                }
            default:
                System.out.println("Извините, такого вида кофе нет :(");
        }
    }


        public void menu () {
            System.out.println("1 " + " Текущий уровень воды и кофе");
            System.out.println("2 " + " Приготовить Американо");
            System.out.println("3 " + " Приготовить Эспрессо");
            System.out.println("4 " + " Приготовить Двойной эспрессо");
            System.out.println("5 " + " Заполнить бак водой");
            System.out.println("6 " + " Заполнить бак кофе");
            System.out.println("7 " + " Информация об устройстве");
            System.out.println("8 " + " Выключение кофемашины");
            System.out.println("Выберите команду: ");
        }
        public void off () {
            System.out.println("До скорой встречи!");
        }
        public void info () {
            System.out.println("Производитель данной кофемашины " + name);
            System.out.println("Объем бака для воды: ");
            System.out.print(tankWater);
            System.out.print(" литров" + "\n");
            System.out.println("Объем бака для кофе: ");
            System.out.print(tankCoffe);
            System.out.print(" литров");
        }
        public void fillWater () {
            float water = 0.001f;
            for (; this.waterLevel <= tankWater; this.waterLevel += water) {
            }
            System.out.print("Бак с водой заполнен");
            System.out.println();
            levelWater();
            return;
        }
        public void fillCoffe () {
            float coffe = 0.001f;
            for (; this.coffeLevel <= tankCoffe; this.coffeLevel += coffeSpend) {
            }
            System.out.print("Бак с кофе заполнен");
            System.out.println();
            levelCoffe();
            return;
        }

}

