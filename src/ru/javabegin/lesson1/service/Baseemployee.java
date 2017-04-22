package ru.javabegin.lesson1.service;

import ru.javabegin.lesson1.Interfaces.DepartmentInterface;
import ru.javabegin.lesson1.Interfaces.EmployeeInterface;
import ru.javabegin.lesson1.department.Basedepartment;

public class Baseemployee implements EmployeeInterface{

    private String name;
    private DepartmentInterface department;
    private boolean free;

    @Override
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public DepartmentInterface getDepartmnet() {return department;}

    public void setDepartment(DepartmentInterface department) {this.department = department;}

    @Override
    public boolean isFree() {return free;}

    public void setFree(boolean free) {this.free = free;}

}
