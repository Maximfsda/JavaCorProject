package OOP;

public class Car {
    String mark, model, bodyColour, assemblyCountry;
    int yearManufacture;
    double engineCapacity;


    public Car() {
        System.out.println("default");
    }
    public Car(String bodyColour, int yearManufacture,double engineCapacity) {
        System.out.println("default");
    }

    public Car(String mark, String model, String bodyColour, String assemblyCountry, int yearManufacture, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.bodyColour = bodyColour;
        this.assemblyCountry = assemblyCountry;
        this.yearManufacture = yearManufacture;
        this.engineCapacity = engineCapacity;
        System.out.println(mark + " " + model + "," + yearManufacture + " год выпуска," + assemblyCountry + "," + bodyColour + ",обьем двигателя -  " + engineCapacity + "л.");
    }

    public Car(String mark, String model, String bodyColour, String assemblyCountry, int yearManufacture) {
        this.mark = mark;
        this.model = model;
        this.bodyColour = bodyColour;
        this.assemblyCountry = assemblyCountry;
        this.yearManufacture = yearManufacture;
        this.engineCapacity = 1.5;
        System.out.println(mark + " " + model + "," + yearManufacture + " год выпуска," + assemblyCountry + "," + bodyColour + ",обьем двигателя -  " + engineCapacity + "л.");
    }

    public Car(String mark, String model, String assemblyCountry, int yearManufacture, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.bodyColour = "белый";
        this.assemblyCountry = assemblyCountry;
        this.yearManufacture = yearManufacture;
        this.engineCapacity = engineCapacity;
        System.out.println(mark + " " + model + "," + yearManufacture + " год выпуска," + assemblyCountry + "," + bodyColour + ",обьем двигателя -  " + engineCapacity + "л.");
    }

    public Car(String mark, String model,String bodyColour, String assemblyCountry, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.bodyColour = bodyColour;
        this.assemblyCountry = assemblyCountry;
        this.yearManufacture = 2000;
        this.engineCapacity = engineCapacity;
        System.out.println(mark + " " + model + "," + yearManufacture + " год выпуска," + assemblyCountry + "," + bodyColour + ",обьем двигателя -  " + engineCapacity + "л.");
    }
}

