public class Main {
    public static void main(String[] args) {

        System.out.println("Часть 3. Задание 1");

        Human maksim = new Human("Максим",- 35, "Минск", "бренд-менеджер. ");
        Human any = new Human("Аня",- 29,"Москва","методист образовательных программ. ");
        Human kate = new Human("Катя",- 28,"Калиниград","продакт-менеджер. ");
        Human artem = new Human("Артём",- 27,"Москва","директор по развитию бизнеса. ");
        Human vladimir = new Human("Владимир",- 21,"Казань","нигде не работаю. ");

        System.out.println("Привет! Меня зовут " + maksim.name + " Я из города " + maksim.getCity() + ". Мне " + maksim.getBirthYear() + " лет. Я работаю на должности " + maksim.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + any.name + " Я из города " + any.getCity() + ". Мне " + any.getBirthYear() + " лет. Я работаю на должности " + any.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + kate.name + " Я из города " + kate.getCity() + ". Мне " + kate.getBirthYear() + " лет. Я работаю на должности " + kate.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artem.name + " Я из города " + artem.getCity() + ". Мне " + artem.getBirthYear() + " лет. Я работаю на должности " + artem.post + " Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.name + " Я из города " + vladimir.getCity() + ". Мне " + vladimir.getBirthYear() + " лет. Я работаю на должности, " + vladimir.post + " Будем знакомы!");


        System.out.println("Часть 3. Задание 2");

        Flower rose = new Flower( null, "Голандия",35.59, 0 );
        Flower hrisantema = new Flower(null, null,15 ,5 );
        Flower pion = new Flower(null, "Англия", 69.9 , 1);
        Flower gipsofila = new Flower(null, "Турция",19.5 ,10 );

        rose.information();
        hrisantema.information();
        pion.information();
        gipsofila.information();
        System.out.println(" ");

        printCostOfFlower(rose, rose, rose, hrisantema, hrisantema, hrisantema, hrisantema, hrisantema, gipsofila  );

    }
    private static void printCostOfFlower(Flower... flowers){
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for(Flower flower : flowers) {
            if(flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;
            }
            totalCost += flower.getCost();
            flower.information();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Стоимость букета " + totalCost);
        System.out.println("Срок стояния букета " + minimumLifeSpan);
    }
}
