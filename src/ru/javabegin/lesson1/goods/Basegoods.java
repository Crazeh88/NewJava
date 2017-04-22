package ru.javabegin.lesson1.goods;

import ru.javabegin.lesson1.Interfaces.DepartmentInterface;
import ru.javabegin.lesson1.Interfaces.GoodsInterface;
import ru.javabegin.lesson1.department.Basedepartment;

public class Basegoods implements GoodsInterface{

    private double price;
    private boolean hasGuarantee;
    private String name;
    private DepartmentInterface department;
    private String Company;

    @Override
    public double getPrice() {return price;}

    public void setPrice(double price) {this.price = price;}
    @Override
    public boolean hasGuarantee() {return hasGuarantee;}

    public void setHasGuarantee(boolean hasGuarantee) {this.hasGuarantee = hasGuarantee;}

    @Override
    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    @Override
    public DepartmentInterface getDepartment() {return department;}

    public void setDepartment(DepartmentInterface department) {this.department = department;}

    @Override
    public String getCompany() {return Company;}

    public void setCompany(String company) {Company = company;}
}
