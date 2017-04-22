package ru.javabegin.lesson1.Interfaces;

public interface GoodsInterface {

    double getPrice();

    boolean hasGuarantee();

    String getCompany();

    String getName();

    DepartmentInterface getDepartment();
}
