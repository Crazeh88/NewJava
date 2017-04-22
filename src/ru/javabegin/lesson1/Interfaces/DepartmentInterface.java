package ru.javabegin.lesson1.Interfaces;

import java.util.ArrayList;

public interface DepartmentInterface {
    String getName();

    ArrayList<EmployeeInterface> getEmployeeList();

    ArrayList<GoodsInterface> getGoodsList();
}


