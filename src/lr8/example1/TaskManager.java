package lr8.example1;

import org.w3c.dom.*;
import javax.xml.parsers.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.*;
import javax.xml.transform.stream.*;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static final String FILE_PATH = "src/lr8/example1/tasks.xml";

    public static List<Task> getAllTasks() throws Exception {
        List<Task> tasks = new ArrayList<>();
        Document doc = getDocument();
        NodeList nodeList = doc.getElementsByTagName("task");

        for (int i = 0; i < nodeList.getLength(); i++) {
            Node node = nodeList.item(i);
            if (node.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) node;
                tasks.add(new Task(
                        element.getElementsByTagName("title").item(0).getTextContent(),
                        element.getElementsByTagName("assignee").item(0).getTextContent(),
                        element.getElementsByTagName("dueDate").item(0).getTextContent()
                ));
            }
        }
        return tasks;
    }

    public static void addTask(Task task) throws Exception {
        Document doc = getDocument();
        Element rootElement = doc.getDocumentElement();

        Element newTask = doc.createElement("task");

        Element title = doc.createElement("title");
        title.appendChild(doc.createTextNode(task.getTitle()));
        newTask.appendChild(title);

        Element assignee = doc.createElement("assignee");
        assignee.appendChild(doc.createTextNode(task.getAssignee()));
        newTask.appendChild(assignee);

        Element dueDate = doc.createElement("dueDate");
        dueDate.appendChild(doc.createTextNode(task.getDueDate()));
        newTask.appendChild(dueDate);

        rootElement.appendChild(newTask);
        saveDocument(doc);
    }

    public static void deleteTask(String taskTitle) throws Exception {
        Document doc = getDocument();
        NodeList tasks = doc.getElementsByTagName("task");

        for (int i = 0; i < tasks.getLength(); i++) {
            Node task = tasks.item(i);
            if (task.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) task;
                String currentTitle = element.getElementsByTagName("title").item(0).getTextContent();
                if (currentTitle.equals(taskTitle)) {
                    element.getParentNode().removeChild(element);
                    saveDocument(doc);
                    return;
                }
            }
        }
        throw new Exception("Задача с названием '" + taskTitle + "' не найдена.");
    }

    public static List<Task> findTasksByAssignee(String assignee) throws Exception {
        return filterTasks("assignee", assignee);
    }

    public static List<Task> findTasksByDueDate(String dueDate) throws Exception {
        return filterTasks("dueDate", dueDate);
    }

    private static List<Task> filterTasks(String field, String value) throws Exception {
        List<Task> filteredTasks = new ArrayList<>();
        List<Task> allTasks = getAllTasks();

        for (Task task : allTasks) {
            if ((field.equals("assignee") && task.getAssignee().equals(value))) {
                filteredTasks.add(task);
            } else if ((field.equals("dueDate") && task.getDueDate().equals(value))) {
                filteredTasks.add(task);
            }
        }
        return filteredTasks;
    }

    private static Document getDocument() throws Exception {
        DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            return dBuilder.parse(file);
        } else {
            Document doc = dBuilder.newDocument();
            doc.appendChild(doc.createElement("tasks"));
            return doc;
        }
    }

    private static void saveDocument(Document doc) throws Exception {
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(FILE_PATH));
        transformer.transform(source, result);
    }
}
