package lr8.example2;

import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class tasks {
    private static final String FILE_PATH = "src/lr8/example2/task-json.json";
    private static JSONObject taskList;
    private static JSONArray tasks;

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        try {
            // Чтение файла
            readJsonFile();

            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("\nМеню:");
                System.out.println("1. Показать все задачи");
                System.out.println("2. Найти задачи по автору");
                System.out.println("3. Добавить новую задачу");
                System.out.println("4. Удалить задачу по названию");
                System.out.println("5. Выход");
                System.out.print("Выберите действие: ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // consume newline

                switch (choice) {
                    case 1:
                        showAllTasks();
                        break;
                    case 2:
                        System.out.print("Введите автора для поиска: ");
                        String author = scanner.nextLine();
                        findTasksByAuthor(author);
                        break;
                    case 3:
                        System.out.print("Введите название задачи: ");
                        String title = scanner.nextLine();
                        System.out.print("Введите автора задачи: ");
                        String taskAuthor = scanner.nextLine();
                        System.out.print("Введите срок выполнения (гггг-мм-дд): ");
                        String dueDate = scanner.nextLine();
                        addNewTask(title, taskAuthor, dueDate);
                        break;
                    case 4:
                        System.out.print("Введите название задачи для удаления: ");
                        String taskToRemove = scanner.nextLine();
                        removeTaskByTitle(taskToRemove);
                        break;
                    case 5:
                        System.out.println("Выход из программы.");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Неверный выбор. Попробуйте снова.");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readJsonFile() throws Exception {
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(new FileReader(FILE_PATH));
        taskList = (JSONObject) obj;
        tasks = (JSONArray) taskList.get("tasks");
    }

    private static void saveJsonFile() throws Exception {
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            file.write(taskList.toJSONString());
        }
    }

    private static void showAllTasks() {
        System.out.println("\nСписок всех задач:");
        for (Object o : tasks) {
            JSONObject task = (JSONObject) o;
            printTaskDetails(task);
        }
    }

    private static void findTasksByAuthor(String author) {
        System.out.println("\nРезультаты поиска по автору '" + author + "':");
        boolean found = false;
        for (Object o : tasks) {
            JSONObject task = (JSONObject) o;
            if (task.get("author").toString().equalsIgnoreCase(author)) {
                printTaskDetails(task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Задачи автора '" + author + "' не найдены.");
        }
    }

    @SuppressWarnings("unchecked")
    private static void addNewTask(String title, String author, String dueDate) throws Exception {
        JSONObject newTask = new JSONObject();
        newTask.put("title", title);
        newTask.put("author", author);
        newTask.put("due_date", dueDate);

        tasks.add(newTask);
        taskList.put("tasks", tasks);
        saveJsonFile();
        System.out.println("Задача успешно добавлена.");
    }

    @SuppressWarnings("unchecked")
    private static void removeTaskByTitle(String title) throws Exception {
        boolean removed = false;
        for (int i = 0; i < tasks.size(); i++) {
            JSONObject task = (JSONObject) tasks.get(i);
            if (task.get("title").toString().equalsIgnoreCase(title)) {
                tasks.remove(i);
                removed = true;
                break;
            }
        }

        if (removed) {
            taskList.put("tasks", tasks);
            saveJsonFile();
            System.out.println("Задача '" + title + "' успешно удалена.");
        } else {
            System.out.println("Задача с названием '" + title + "' не найдена.");
        }
    }

    private static void printTaskDetails(JSONObject task) {
        System.out.println("\nЗадача:");
        System.out.println("Название: " + task.get("title"));
        System.out.println("Автор: " + task.get("author"));
        System.out.println("Срок выполнения: " + task.get("due_date"));
    }
}