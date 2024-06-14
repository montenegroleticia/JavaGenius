package Quizz.entities;

public abstract class Person {
    public String name;

    public Person(String name) {
        this.name = name;
    }
    public Person(){

    }
    public String getName() {
        return name;
    }
    public abstract void Cumprimentar();
    
}
