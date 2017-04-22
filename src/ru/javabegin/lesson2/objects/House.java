package ru.javabegin.lesson2.objects;

import java.util.ArrayList;



public class House {

    private String adress = "n/a";
    private ArrayList<Person> listOfResidents = new ArrayList<>();

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void settlePerson(Person p){
        if(listOfResidents.contains(p)){
            System.out.println("This person lives here already!!!");
        }else {
            listOfResidents.add(p);
            p.setAdress(this.adress);
        }

    }
    public void evictPerson(Person p){
            listOfResidents.remove(p);
            p.setAdress("n/a");
        }

    public void descriptionOfHouse(){
        System.out.println("-------------------");
        System.out.println("# Adress of this house is: " + this.adress);
        System.out.println("# List of residents: ");

        if(listOfResidents.isEmpty()){
            System.out.println("List is epmty!!!");
        }else {
            for (int i = 0; i < listOfResidents.size(); i++) {
                Person p = listOfResidents.get(i);
                System.out.println("# -" + p.getName());
            }
        }
    }
}

