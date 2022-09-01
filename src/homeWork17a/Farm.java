package homeWork17a;

import homeWork17a.*;

import java.util.Arrays;

public class Farm {

    private String adders;
    private Animal[] animals;
    private String OwnerName;


    public Farm(String adders, String OwnerName,Animal[] animals) {
        this.adders = adders;
        this.OwnerName = OwnerName;
        this.animals = animals;
    }
    public Farm() {
    }


    public void setAdders(String adders) {
        this.adders = adders;
    }
    public void setOwnerName(String ownerName) {
        OwnerName = ownerName;
    }
    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getAdders() {
        return adders;
    }
    public String getOwnerName() {
        return OwnerName;
    }
    public void getAnimals() {
        int sum = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Sheep) {
                if (i == 0) {
                    System.out.println("-----Овцы-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum++;
            } else if (animals[i] instanceof Cow) {
                if (i == 3) {
                    System.out.println("-----Коровы-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum1++;
            } else {
                if (i == 8) {
                    System.out.println("-----Лошади-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum2++;
            }
        }
        System.out.println("Овец "+sum+"\n"+"Коров "+sum1+"\n"+"Лошади "+sum2+"\n");

    }

    public void getAnimal() {
        int sum = 0, sum1 = 0, sum2 = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Sheep) {
                if (i == 0) {
                    System.out.println("-----Овцы-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum++;
            } else if (animals[i] instanceof Cow) {
                if (i == 3) {
                    System.out.println("-----Коровы-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum1++;
            } else {
                if (i == 8) {
                    System.out.println("-----Лошади-----");
                }
                System.out.println("Вес = "+animals[i].getWeight() );
                System.out.println("Возраст = "+animals[i].getAge() );
                System.out.println("Цвет = "+animals[i].getColour() );
                System.out.println("Пол = "+animals[i].getGender() );
                System.out.println("-----------------------");
                sum2++;
            }
        }
        System.out.println("Овец "+sum+"\n"+"Коров "+sum1+"\n"+"Лошади "+sum2+"\n");
    }

    @Override
    public String toString() {
        return  "adders = " + adders + '\n' +
                "OwnerName = " + OwnerName + '\n' +
                "Animals = " + Arrays.toString(animals) + '\n';
    }

}
