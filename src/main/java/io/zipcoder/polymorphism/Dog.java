package io.zipcoder.polymorphism;

public class Dog {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    public void speak(){
        System.out.println("Bark");
    }

}



