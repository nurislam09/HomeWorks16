package HomeWork17b;

public class Circle extends Shape {
    private double number1 = 3.14;
    private double number2;

    public Circle(double number2) {
        this.number2 = number2;
    }

    @Override
    public double getPerimeter() {
        System.out.print("Кругтун периметри = ");
        return 2 * number2 * number1;
    }

}
