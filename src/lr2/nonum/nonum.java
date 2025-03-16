package lr2.nonum;

public class nonum {
    public static void main(String[] args) {
        // Создание объектов фигур
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);
        Triangle triangle = new Triangle(3.0, 4.0, 5.0);

        // Вычисление и вывод площади и периметра для каждой фигуры
        System.out.println("Круг - Площадь: " + circle.calculateArea() + ", Периметр: " + circle.calculatePerimeter());
        System.out.println("Квадрат - Площадь: " + square.calculateArea() + ", Периметр: " + square.calculatePerimeter());
        System.out.println("Треугольник - Площадь: " + triangle.calculateArea() + ", Периметр: " + triangle.calculatePerimeter());
    }
}
