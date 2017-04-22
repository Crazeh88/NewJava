package ru.javabegin.lesson2.objects;

public class Person {
    private String name = "n/a";
    private int age = 0;
    private String adress = "n/a";

    public Person(){
    }

    public Person(String name, int age, String adress){
        this.name = name;
        this.age = age;
        this. adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void descriptionOfPerson(){
        System.out.println("----------------------------");
        System.out.print("Hello! My name is " + name);
        System.out.println(", i am " + age + " years old");
        System.out.println("and my adress is " +adress);

    }
}