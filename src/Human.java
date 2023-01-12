public class Human {


    private String name;
    private int age;
    private String city;


    Human(String name, int age, String city) {
        this.name = name;
        this.age = age;
        this.city = city;
    }

    void say() {
        System.out.println("Привет! Меня зовут" + name + " Я из города " + city + "Мне " + age + " лет. Будем знакомы!");
    }


    private String name1;
    private int age1;

    private String city1;
    private String post;



    Human(String name, int age, String city, String post) {
        this.name1 = name;
        this.age1 = age;
        this.city1 = city;
        this.post = post;
    }

    void say1() {
        System.out.println("Привет! Меня зовут" + name1 + " Я из города " + city1 + "Мне " + age1 + " лет. Я работаю на должности" + post + " Будем знакомы!");
    }
}


