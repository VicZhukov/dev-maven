package ua.vic.goit;

import com.google.gson.Gson;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Vic","Zhukov");

        String s = new Gson().toJson(person);
        System.out.println(s);
    }
}