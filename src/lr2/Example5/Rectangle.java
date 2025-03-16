package lr2.Example5;

public class Rectangle {
    private int length;
    private int width;

    // Конструктор для создания класса Rectangle
    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    // Методы для установки значения длины и ширины
    public void setLength(int length) {

        this.length = length;
    }

    public void setWidth(int width) {

        this.width = width;
    }

    // Методы для получения значения длины и ширины
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // Метод для вычисления площади прямоугольника
    public int calculateArea() {
        return length * width;
    }

    // Метод для вычисления периметра прямоугольника
    public int calculatePerimeter() {
        return 2 * (length + width);
    }
}
