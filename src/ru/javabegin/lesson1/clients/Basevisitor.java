package ru.javabegin.lesson1.clients;

import ru.javabegin.lesson1.Interfaces.VisitorInterface;

public class Basevisitor implements VisitorInterface{
    private String name;

    public void buy(){

    }

    public void returnGoods(){

    }

    @Override
    public String getName() {
        return name;
    }
}
