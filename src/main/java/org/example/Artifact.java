package org.example;

public class Artifact {
    int item;
    String culture;
    int age;

    public Artifact(int item) {
        this.item = item;
    }

    public Artifact(int item, String culture) {
        this.item = item;
        this.culture = culture;
    }

    public Artifact(int item, String culture, int age) {
        this.item = item;
        this.culture = culture;
        this.age = age;
    }
}
