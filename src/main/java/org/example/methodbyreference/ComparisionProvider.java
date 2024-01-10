package org.example.methodbyreference;

public class ComparisionProvider {

    // Method 1
    // To compare with name
    public int compareByName(Person a, Person b)
    {
        return a.getName().compareTo(b.getName());
    }

    // Method 2
    // To compare with age
    public int compareByAge(Person a, Person b)
    {
        return a.getAge().compareTo(b.getAge());
    }
}
