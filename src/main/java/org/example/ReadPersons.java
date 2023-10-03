//Работа с xml в котором несколько объектов

package org.example;

import java.io.File;
import java.sql.Driver;
import java.sql.SQLException;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadPersons {


    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        try {
            File file = new File("C:\\Users\\Aleksey\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\ClassXML.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);
            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Persons que = (Persons) jaxbUnmarshaller.unmarshal(file);
            printHuman(que, 23);
//            printAllHumans(que);
        } catch (JAXBException e) {
            throw new RuntimeException(e);
        }

        Class <Driver> driverCkass = Driver.class;

    }

    private static void printHuman(Persons que, int age) {
        que.getHumans().stream().filter(human -> human.getAge() == age).forEach(System.out::println);
    }

    private static void printAllHumans(Persons que) {
        que.getHumans().forEach(System.out::println);
    }
}

