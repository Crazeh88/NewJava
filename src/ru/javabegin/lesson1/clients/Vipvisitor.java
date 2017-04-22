package ru.javabegin.lesson1.clients;

public class Vipvisitor extends Basevisitor{
    private float discount;

    @Override
    public void buy() {
        if(!checkDiscount()) { //Если метод возвращает true выполнеяется else, иначе дефолтный buy()
            super.buy();
        }else{//покупка со скидкой

        }
    }
    private boolean checkDiscount(){
        return discount>0;
    }
}
