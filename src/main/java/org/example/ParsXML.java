//Работа с xml в котором 1 объект
package org.example;

import javax.xml.bind.*;
import java.io.File;

public class ParsXML {
    public static void main(String[] args) {

        File file = new File("C:\\Users\\Aleksey\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\ClassXML.xml");

        try {
            JAXBContext content = JAXBContext.newInstance(ClassXML.class);
            Unmarshaller unmarshaller = content.createUnmarshaller();
            ClassXML news = (ClassXML)unmarshaller.unmarshal(file);
            System.out.println(news.getName());
            System.out.println(news.getAge());
            System.out.println(news.getHobbies());
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }
    }
}