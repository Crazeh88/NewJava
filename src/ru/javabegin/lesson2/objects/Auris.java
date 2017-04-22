package ru.javabegin.lesson2.objects;

public class Auris extends Camry {
    public Auris(){

    }

    public Auris(String name, double volume){
        super(name, volume);
        System.out.println("Auris constructor");
    }
}
