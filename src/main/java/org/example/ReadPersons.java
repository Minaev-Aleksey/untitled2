//Работа с xml в котором несколько объектов

package org.example;

import java.io.File;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class ReadPersons {
    public static void main(String[] args) {

        try {

            File file = new File("C:\\Users\\Aleksey\\IdeaProjects\\untitled2\\src\\main\\java\\org\\example\\ClassXML.xml");
            JAXBContext jaxbContext = JAXBContext.newInstance(Persons.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
//            Person que = (Person) jaxbUnmarshaller.unmarshal(file);
            Persons que = (Persons) jaxbUnmarshaller.unmarshal(file);

//            que.getHumans().forEach(System.out::println);

            printHuman(que,23);


//           System.out.println(que.getAge());
//
//            System.out.println(que.getName());
//            System.out.println("Answers:");
//            List<ReadPersons> list=que.getPerson();
//            for(ReadPersons ans:list)
//
//                System.out.println(ans.toString());

        } catch (JAXBException e) {
            e.printStackTrace();
        }

    }

    private static void printHuman(Persons que, int age) {
        que.getHumans().stream().filter(human -> human.getAge() == age).forEach(System.out::println);
    }
}

