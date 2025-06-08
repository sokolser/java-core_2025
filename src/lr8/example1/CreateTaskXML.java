package lr8.example1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class CreateTaskXML {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder docBuilder = docFactory.newDocumentBuilder();

            // Создание корневого элемента
            Document doc = docBuilder.newDocument();
            Element rootElement = doc.createElement("tasks");
            doc.appendChild(rootElement);

            // Создание первой задачи
            addTaskToXML(doc, rootElement, "Завершить проект", "Иван Иванов", "2023-12-31");

            // Создание второй задачи
            addTaskToXML(doc, rootElement, "Подготовить презентацию", "Петр Петров", "2023-11-15");

            // Запись XML-файла
            writeXMLToFile(doc, "src/lr8/example1/tasks.xml");

            System.out.println("XML-файл с задачами успешно создан!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void addTaskToXML(Document doc, Element rootElement, String title, String assignee, String dueDate) {
        Element task = doc.createElement("task");
        rootElement.appendChild(task);

        Element titleElement = doc.createElement("title");
        titleElement.appendChild(doc.createTextNode(title));
        task.appendChild(titleElement);

        Element assigneeElement = doc.createElement("assignee");
        assigneeElement.appendChild(doc.createTextNode(assignee));
        task.appendChild(assigneeElement);

        Element dueDateElement = doc.createElement("dueDate");
        dueDateElement.appendChild(doc.createTextNode(dueDate));
        task.appendChild(dueDateElement);
    }

    public static void writeXMLToFile(Document doc, String filePath) throws Exception {
        doc.setXmlStandalone(true);
        doc.normalizeDocument();
        TransformerFactory tf = TransformerFactory.newInstance();
        Transformer transformer = tf.newTransformer();
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        transformer.setOutputProperty(OutputKeys.STANDALONE, "yes");
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(new File(filePath));
        transformer.transform(source, result);
    }
}