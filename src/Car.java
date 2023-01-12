public class Car {

    private String mark;

    private String model;

    private String engineСapacity;

    private String bodyСolor;

    private String yearOfProduction;

    private String countryOfAssembly;

    Car(String mark, String model, String engineСapacity, String bodyСolor, String yearOfProduction, String countryOfAssembly) {
        this.mark = mark;
        this.model = model;
        this.engineСapacity = engineСapacity;
        this.bodyСolor = bodyСolor;
        this.yearOfProduction = yearOfProduction;
        this.countryOfAssembly = countryOfAssembly;
    }
    void carInformation() {
        System.out.println( mark + " " + model + ", " + yearOfProduction + " год выпуска, " + " сборка в " + engineСapacity  + ", " + bodyСolor + " цвета," + " обьем двигателя" + countryOfAssembly);

    }

}
