package com.company;
//      Box деген generic класс тузунуз.
//      Ичинде Box деген объектти кайтарган статический generic метод болсун.

public class Main {

    public static void main(String[] args) {
        Box<String> box = new Box<>("You","Me");
        Box<Integer> box2 = new Box<>(2,3);

        Box.genericMethod(box,box2);

    }
}
