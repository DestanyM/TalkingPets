package io.zipcoder.polymorphism;

public class Cat {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;
    public void speak(){
        System.out.println("Meow");
    }
}
