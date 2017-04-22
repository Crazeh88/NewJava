package ru.javabegin.lesson1.bank;

import ru.javabegin.lesson1.Interfaces.BankInterface;

public class BaseBank implements BankInterface{
    private String name;
    private String creditDescription;

    public void checkInfo(){

    }

    public void giveCredit(){

    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getCreditDescription() {
        return creditDescription;
    }
}
