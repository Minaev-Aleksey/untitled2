package org.example;

import javax.xml.bind.annotation.XmlElement;

//@XmlRootElement(name = "person")
public class Human {
    private int age;
    private String name;
    private String hobbies;
//    private List<ReadPersons> person;

//    public Person() {
//    }
//
//    public Person(String name, int age, String hobbies) {
//        this.name = name;
//        this.age = age;
//        this.hobbies = hobbies;
//    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @XmlElement
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    @XmlElement
    public int getAge() {
        return age;
    }

    public String getHobbies() {
        return hobbies;
    }

//    @XmlElement
//    public List<ReadPersons> getPerson() {
//        return person;
//    }
//
//    public void setPerson(List<ReadPersons> person) {
//        this.person = person;
//    }

    public String toString() {
        return "\n Name: " + getName() + "\n Age: " + age + "\n Hobbies: " + hobbies;
    }
}