package com.jonnyfluckey.simpleconsoleapp;

public class Person {
    int age;
    String name;
    String favoriteColor;

    Person() {
        age = 0;
        name = "";
        favoriteColor = "";
    }

    public void addAge(int age) {
        this.age = age;
    }

    public void addName(String name) {
        this.name = name;
    }

    public void addFavoriteColor(String favoriteColor){
        this.favoriteColor = favoriteColor;
    }
}
