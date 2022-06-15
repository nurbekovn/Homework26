package com.company;
//      Box деген generic класс тузунуз.
//      Ичинде Box деген объектти кайтарган статический generic метод болсун.

public class Main {

    public static void main(String[] args) {
        Box<String> box = new Box<>("Nurbekov project");
        System.out.println(Box.genericMethod(box));
    }
}
