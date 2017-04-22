package ru.javabegin.lesson2.start;

import ru.javabegin.lesson2.objects.House;
import ru.javabegin.lesson2.objects.Person;

public class Main {
    public static void main(String[] args) {


        Person p1 = new Person();
        Person p2 = new Person();

        House h = new House();
        h.setAdress("1street");

        p1.setName("Ivan");
        p1.setAge(25);
        h.settlePerson(p1);
        p2.setName("Perte");
        p2.setAge(33);
        h.settlePerson(p2);

        p1.descriptionOfPerson();
        p2.descriptionOfPerson();

        h.descriptionOfHouse();
    }
}
