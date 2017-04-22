package ru.javabegin.lesson2.objects;

public class Human implements Info{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Human(){

    }

    public Human(String name){
        this.name = name;
    }

    public void sayHello(){
        System.out.println("Hello!");
    }

    public void showInfo(){
        System.out.println("Name is " + this.name);
    }

    public static void showMe(Info info){
        info.showInfo();
    }
}
