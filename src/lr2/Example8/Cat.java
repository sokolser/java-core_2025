package lr2.Example8;

public class Cat extends Animal {
    private String foodType;

    public Cat(String name, int age, String foodType) {
        super(name, age);
        this.foodType = foodType;
    }

    @Override
    public void makeSound() {
        System.out.println("Кошка мяукает: Мяу-мяу!");
    }

    public void purr() {
        System.out.println(name + " мурлычет");
    }
}
