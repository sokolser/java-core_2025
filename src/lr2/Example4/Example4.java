package lr2.Example4;

public class Example4 {

    public static void main(String[] args) {

        // Создание объекта класса Person
        Person person1 = new Person("Сергей", 22, 'M');

        // Вывод информации о человеке
        System.out.println("Имя: " + person1.getName());
        System.out.println("Возраст: " + person1.getAge());
        System.out.println("Пол: " + person1.getGender());

        // Изменение данных
        person1.setName("Ольга");
        person1.setAge(20);
        person1.setGender('Ж');

        // Проверим работоспособность
        System.out.println("Смена информации");

        // Вывод обновленной информации
        System.out.println("Обновленное имя: " + person1.getName());
        System.out.println("Обновленный возраст: " + person1.getAge());
        System.out.println("Обновленный пол: " + person1.getGender());
    }
}
