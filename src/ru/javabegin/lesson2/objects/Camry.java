package ru.javabegin.lesson2.objects;

public class Camry extends Toyota{
    private Toyota toy;

    public Camry(){

    }

    public Camry(String name, double volume)
    {
        super(name, volume);
        System.out.println("Camry constructor");
    }

    public Camry(String name) {
        super(name);
    }

    public Camry(double volume) {
        super(volume);
    }

    private void showName(){
        System.out.println("Hi i am camry!");
    }

}
