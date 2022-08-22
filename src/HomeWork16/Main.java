package HomeWork16;

import HomeWork16.Animal;
import HomeWork16.Eagle;
import HomeWork16.Shark;
import HomeWork16.Turtle;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Shark shark = new Shark();
        Turtle turtle = new Turtle();
        Eagle eagle = new Eagle();
        Animal[] animals = {shark, turtle, eagle};
        Shark [] sharks ={shark};
        Turtle [] turtles ={turtle};
        Eagle [] eagles ={eagle};
        for (Animal i : animals) {
            if (i instanceof Shark){
                System.out.println(sharks.getClass().getSimpleName());
            }else if(i instanceof Eagle) {
               System.out.println(turtles.getClass().getSimpleName());
            } else if (i instanceof Turtle) {
                System.out.println(eagles.getClass().getSimpleName());
            }
            System.out.println(i.getClass().getSimpleName());
            i.Attack();
                System.out.println("--------------------------------");
            }
        }
    }

