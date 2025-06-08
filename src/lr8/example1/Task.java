package lr8.example1;

public class Task {
    private String title;
    private String assignee;
    private String dueDate;

    public Task(String title, String assignee, String dueDate) {
        this.title = title;
        this.assignee = assignee;
        this.dueDate = dueDate;
    }

    // Геттеры
    public String getTitle() { return title; }
    public String getAssignee() { return assignee; }
    public String getDueDate() { return dueDate; }

    @Override
    public String toString() {
        return "Название: " + title + ", Исполнитель: " + assignee + ", Срок: " + dueDate;
    }
}
