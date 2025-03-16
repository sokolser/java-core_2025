package lr2.Example8;

public class Example8 {
    public static void main(String[] args) {
        Dog dog = new Dog("Барон", 5, "Овчарка");
        Cat cat = new Cat("Мурка", 3, "Сухой корм");
        Bird bird = new Bird("Кеша", 2, true);

        dog.info();
        dog.makeSound();
        dog.fetch();

        cat.info();
        cat.makeSound();
        cat.purr();

        bird.info();
        bird.makeSound();
        bird.fly();
    }
}
