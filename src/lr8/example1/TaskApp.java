package lr8.example1;

import java.util.List;
import java.util.Scanner;

public class TaskApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nМеню:");
            System.out.println("1. Показать все задачи");
            System.out.println("2. Добавить задачу");
            System.out.println("3. Удалить задачу");
            System.out.println("4. Найти задачи по исполнителю");
            System.out.println("5. Найти задачи по сроку выполнения");
            System.out.println("0. Выход");
            System.out.print("Выберите действие: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            try {
                switch (choice) {
                    case 1:
                        showAllTasks();
                        break;
                    case 2:
                        addNewTask(scanner);
                        break;
                    case 3:
                        deleteTask(scanner);
                        break;
                    case 4:
                        findTasksByAssignee(scanner);
                        break;
                    case 5:
                        findTasksByDueDate(scanner);
                        break;
                    case 0:
                        System.out.println("Выход из программы.");
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            } catch (Exception e) {
                System.out.println("Ошибка: " + e.getMessage());
            }
        }
    }

    private static void showAllTasks() throws Exception {
        List<Task> tasks = TaskManager.getAllTasks();
        if (tasks.isEmpty()) {
            System.out.println("Список задач пуст.");
        } else {
            System.out.println("\nСписок всех задач:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void addNewTask(Scanner scanner) throws Exception {
        System.out.print("Введите название задачи: ");
        String title = scanner.nextLine();

        System.out.print("Введите исполнителя: ");
        String assignee = scanner.nextLine();

        System.out.print("Введите срок выполнения (гггг-мм-дд): ");
        String dueDate = scanner.nextLine();

        TaskManager.addTask(new Task(title, assignee, dueDate));
        System.out.println("Задача успешно добавлена.");
    }

    private static void deleteTask(Scanner scanner) throws Exception {
        System.out.print("Введите название задачи для удаления: ");
        String title = scanner.nextLine();

        TaskManager.deleteTask(title);
        System.out.println("Задача успешно удалена.");
    }

    private static void findTasksByAssignee(Scanner scanner) throws Exception {
        System.out.print("Введите имя исполнителя: ");
        String assignee = scanner.nextLine();

        List<Task> tasks = TaskManager.findTasksByAssignee(assignee);
        if (tasks.isEmpty()) {
            System.out.println("Задачи для исполнителя '" + assignee + "' не найдены.");
        } else {
            System.out.println("\nНайденные задачи:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }

    private static void findTasksByDueDate(Scanner scanner) throws Exception {
        System.out.print("Введите срок выполнения (гггг-мм-дд): ");
        String dueDate = scanner.nextLine();

        List<Task> tasks = TaskManager.findTasksByDueDate(dueDate);
        if (tasks.isEmpty()) {
            System.out.println("Задачи на срок '" + dueDate + "' не найдены.");
        } else {
            System.out.println("\nНайденные задачи:");
            for (Task task : tasks) {
                System.out.println(task);
            }
        }
    }
}