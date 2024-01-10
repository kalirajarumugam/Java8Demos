package org.example.methodbyreference;

import java.util.Random;

public class NewPerson {

    private String name;
    private Integer age;

    public NewPerson() {

        Random ran = new Random();
        this.name = ran.ints(97, 123).
                limit(7).
                collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).
                toString();

    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
