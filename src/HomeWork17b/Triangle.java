package HomeWork17b;

import HomeWork17b.Shape;

public class Triangle  extends Shape {
    private int num1;
    private int num2;
    private int num3;

    public Triangle(int num1, int num2, int num3) {
        this.num1 = num1;
        this.num2 = num2;
        this.num3 = num3;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Треугольниктин периметри = ");
        return num1 + num2 + num3;
    }
}
