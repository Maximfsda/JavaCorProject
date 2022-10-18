package OOP;

public class Person {

    int date;
    String name;
    String city;
    String position;

    public Person(int date) {
        if (date > 0) {
            this.date = date;
        } else {
            this.date = 0;
        }
        System.out.println("Информация не указана” при выводе в консоль.");
    }

    public Person(int date, String name, String city, String position) {
        if (date > 0) {
            this.date = date;
        } else {
            this.date = 0;
        }
        this.name = name;
        this.city = city;
        this.position = position;
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + city + ". Я родился в " + date + " году. Я работаю на должности " + position + ". Будем знакомы!");
    }
}


