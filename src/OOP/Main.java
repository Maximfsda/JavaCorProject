package OOP;


public class Main {

    public static void main(String[] args) {

        Person maksim = new Person(1987, "Максим", "Минск","бренд-менеджером");
        Person any = new Person(1991, "Аня", "Москва","методистом образовательных программ");
        Person kate = new Person(1992, "Катя", "Калининград","продакт-менеджером");
        Person artem = new Person(1993, "Артем", "Москва","директором по развитию бизнеса");


        Car ladaGranta = new Car ("Lada", "Granta", "желтого цвета","сборка в России",2015, 1.7);
        Car audi = new Car ("Audi", "A8 50 L TDI quattro", "черный цвет кузова","сборка в Германии",2020, 3.0);
        Car bmw = new Car ("BMW", "Z8", "черный цвет кузова","сборка в Германии",2021, 3.0);
        Car kia = new Car ("Kia", "Sportage 4-го поколения", "цвет кузова — красный","сборка в Южной Корее",2018, 2.4);
        Car hyundai = new Car ( "Avante", "цвет кузова — оранжевый","сборка в Южной Корее",2016, 1.6);
    }
}
