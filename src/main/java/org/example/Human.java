package org.example;

import javax.xml.bind.annotation.XmlElement;

public class Human {
    private int age;
    private String name;
    private String hobbies;

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

    public String toString() {
        return "\n Name: " + getName() + "\n Age: " + age + "\n Hobbies: " + hobbies;
    }
}