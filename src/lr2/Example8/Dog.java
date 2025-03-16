package lr2.Example8;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Собака лает: Гав-гав!");
    }

    public void fetch() {
        System.out.println(name + " приносит палку");
    }
}
