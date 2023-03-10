package org.example;

public class Main {
    public static void main(String[] args) {

        Artifact vase = new Artifact(212121);
        Artifact spoon = new Artifact(212122, "Acteki");
        Artifact sculpture = new Artifact(212123, "Acteki", 11);
        System.out.println("Ваза номер " + vase.item);
        System.out.println("Ложка номер " + spoon.item + " Культура " + spoon.culture);
        System.out.println("Скульптура номер " + sculpture.item + " Культура " + sculpture.culture + " Эпоха " + sculpture.age);
    }
}
//https://javarush.com/groups/posts/1949-znakomstvo-s-klassami-napisanie-sobstvennihkh-klassov-konstruktorih