package org.example.stream;

class Employee {

    // attributes of an Employee
    String name;
    int age;

    // constructor
    Employee(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Override toString to print
    // provided content when an Object
    // is printed
    @Override public String toString()
    {
        return "Employee [name=" + name + "]";
    }
}
