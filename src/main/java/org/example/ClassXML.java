package org.example;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ClassXML {
    private String name;
    private int age;
    private String hobbies;

    @XmlElement
    public void setName(String name) {this.name=name;}
    @XmlElement
    public void setAge(int age) {this.age=age;}
    @XmlElement
    public void setHobbies(String hobbies) {this.hobbies=hobbies;}

    public String getName() {return name;}
    public int getAge() {return age;}
    public String getHobbies() {return hobbies;}
}
