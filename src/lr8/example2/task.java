package lr8.example2;

import java.io.FileWriter;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class task {
    public static void main(String[] args) {
        JSONObject taskList = new JSONObject();
        JSONArray tasks = new JSONArray();

        JSONObject task1 = new JSONObject();
        task1.put("title", "Сделать домашнее задание");
        task1.put("author", "Иванов Иван");
        task1.put("due_date", "2023-10-15");

        JSONObject task2 = new JSONObject();
        task2.put("title", "Подготовить презентацию");
        task2.put("author", "Петрова Мария");
        task2.put("due_date", "2023-10-20");

        tasks.add(task1);
        tasks.add(task2);

        taskList.put("tasks", tasks);

        try (FileWriter file = new FileWriter("src/lr8/example2/task-json.json")) {
            file.write(taskList.toJSONString());
            System.out.println("Json файл со списком задач успешно создан");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}