package homeWork17a;

public class Main {
    public static void main(String[] args) {
        /**Класс Cow (weight, age, gender, nickName)
         ±Класс homeWork17a.Sheep(weight, age, gender, nickName)
         ±Класс homeWork17a.Horse(weight, age, color, gender, nickName)
         ±Класс homeWork17a.Farm(address, cows, horses, sheep, OwnerName)
         ±2 homeWork17a.Farm тузунуз.
         ±1-Farmда 3 sheep, 5 cows, 2 horses болсун.
         ±2-Farmда 1 sheep, 1 cow, 1 horse болсун.*/

        Animal animal1 = new Sheep(45,3,"Белый","Эркек");
        Animal animal2 = new Sheep(79,2,"Белый","Ургаачы");
        Animal animal3 = new Sheep(135,2,"Черный","Эркек");
        Animal animal4 = new Sheep(135,2,"Черный","Эркек");


        Animal animal11 = new Cow(769,4,"Коричневый","Ургаачы");
        Animal animal22 = new Cow(687,2,"Коричневый","Ургаачы");
        Animal animal33 = new Cow(993,3,"Коричневый","Ургаачы");
        Animal animal44 = new Cow(764,4,"Коричневый","Ургаачы");
        Animal animal55 = new Cow(1002,2,"Коричневый","Ургаачы");
        Animal animal66 = new Cow(1002,2,"Коричневый","Ургаачы");


        Animal animal111 = new Horse(350,5,"Серебристый","Эркек");
        Animal animal222 = new Horse(300,4,"Черный","Ургаачы");
        Animal animal333 = new Horse(300,4,"Черный","Ургаачы");

        Animal[] animals1 = {animal1,animal2,animal3,animal11,animal22,animal33,animal44,animal55,animal111,animal222};
        Animal[] animals2 = {animal4,animal66,animal333};
        Farm farm1 = new Farm("Сокулук","Cултангази",animals1);
        Farm farm2 = new Farm("Токмок","Элдияр",animals2);
        System.out.println("Первая Ферма\n"+farm1.getAdders()+"\n"+farm1.getOwnerName()+"\n\n");
        farm1.getAnimals();
        System.out.println("\n\n");
        System.out.println("Вторая Ферма\n"+farm1.getAdders()+"\n"+farm1.getOwnerName()+"\n\n");
        farm2.getAnimal();
    }
    }

