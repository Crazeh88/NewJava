package ru.javabegin.lesson1;

import ru.javabegin.lesson1.Interfaces.DepartmentInterface;
import ru.javabegin.lesson1.Interfaces.VisitorInterface;
import ru.javabegin.lesson1.clients.Basevisitor;
import ru.javabegin.lesson1.department.Basedepartment;
import ru.javabegin.lesson1.service.Administator;

import java.util.ArrayList;

public class Salesroom {

   private ArrayList<DepartmentInterface> basedepartmentList;
   private String name;
   private ArrayList<VisitorInterface> visitorList;
   private Administator administator;
}
