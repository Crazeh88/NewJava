package ru.javabegin.lesson2.objects;

public class Animal implements Info{

    public int id;

    public Animal(){

    }

    public  Animal(int i){
        this.id = i;
    }

    public void sleep(){
        System.out.println("I'm sleeping...");
    }

    public void showInfo(){

        System.out.println("ID is " + this.id);
    }


}
