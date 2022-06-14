package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;

//  Ичинде Box деген объектти кайтарган статический generic метод болсун.
@Data
@AllArgsConstructor

public class Box<T> {
    private T var;
    private T var2;

    public static  <T> void genericMethod(T var, T var2) {
        System.out.println(var);
        System.out.println(var2);

    }

    @Override
    public String toString() {
        return "Box " +
                " var is " + var +
                ", var2 is " + var2 +".";

    }
}
