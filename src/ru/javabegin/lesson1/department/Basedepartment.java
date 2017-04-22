package ru.javabegin.lesson1.department;

import ru.javabegin.lesson1.Interfaces.DepartmentInterface;
import ru.javabegin.lesson1.Interfaces.EmployeeInterface;
import ru.javabegin.lesson1.Interfaces.GoodsInterface;
import ru.javabegin.lesson1.goods.Basegoods;
import ru.javabegin.lesson1.service.Baseemployee;

import java.util.ArrayList;

public class Basedepartment implements DepartmentInterface{

    private String name;
    private ArrayList<EmployeeInterface> employeeList;
    private ArrayList<GoodsInterface> goodsList;

    public String getName(){
    return name;
    }

    @Override
    public ArrayList<EmployeeInterface> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<EmployeeInterface> employeeList){
        this.employeeList = employeeList;
    }

    @Override
    public ArrayList<GoodsInterface> getGoodsList() {
        return goodsList;
    }{
        this.goodsList = goodsList;
    }

    public void getGoodsList(ArrayList<GoodsInterface> goodsList){
        this.goodsList = goodsList;
    }

}
