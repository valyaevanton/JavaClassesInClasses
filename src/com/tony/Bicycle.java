package com.tony;

/**
 * Пример нестатического вложенного класса ([non-static] nested classes) ->
 * внутренний класс (inner classes)
 *
 * Источник:
 * https://javarush.ru/groups/posts/2181-vlozhennihe-vnutrennie-klassih
 */
public class Bicycle {

    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;
    }

    public void start() {
        System.out.println("Поехали!");
    }

    /**
     * Руль
     */
    public class SteeringWheel {

        public void right() {
            System.out.println("Руль вправо!");
        }

        public void left() {
            System.out.println("Руль влево!");
        }
    }

    public class Seat {

        public void up() {
            System.out.println("Сиденье поднято выше!");
        }

        public void down() {
            System.out.println("Сиденье опущено ниже!");
        }

        public void getSeatParam() {
            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }
}
