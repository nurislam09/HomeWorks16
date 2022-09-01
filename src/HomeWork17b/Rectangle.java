package HomeWork17b;

import java.awt.*;

public class Rectangle extends Shape {
    private int num1;
    private int num2;
    private int num3;
    private int num4;

    public Rectangle(int num1, int num2, int num3, int num4) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
        this.num4 = num4;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Прямоугольниктин периметри = ");
        return num1 + num2 + num3 + num4;
    }
        }
