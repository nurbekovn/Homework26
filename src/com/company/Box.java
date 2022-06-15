package com.company;

import lombok.AllArgsConstructor;
import lombok.Data;

//  Ичинде Box деген объектти кайтарган статический generic метод болсун.
@Data
@AllArgsConstructor

public class Box<T> {
    private T object;

    public static <T> T genericMethod (T object) {
        return object;
    }

    @Override
    public String toString() {
        return "Box{ " +
                "object=" + object +
                '}';
    }
}
