package lr2.Example8;

public class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Животное издает звук");
    }

    public void info() {
        System.out.println("Имя: " + name + ", Возраст: " + age);
    }
}
