package org.example;

public class Tester {
    String name;
    String surname;
    int expirienceInYears;
    String englishLevel;
    float salary;

    public Tester(String name, String surname, int expirienceInYears, String englishLevel, float salary){
        this(name, surname);
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = expirienceInYears;
        this.englishLevel = englishLevel;
        this.salary = salary;
    }
    public Tester(String name, String surname){
        this();
        this.name = name;
        this.surname = surname;
        this.expirienceInYears = 3;
        this.englishLevel = "C1";
        this.salary = 3000;
    }
    public Tester(){
        this.name = "Maxim";
        this.surname = "Maditskiy";

        this.expirienceInYears = 3;
        this.englishLevel = "C1";
        this.salary = 3000;
    }

    public void getFullName(){
        System.out.println(name + " " + surname);
    }
    public void getFullName(String name){
        System.out.println(name + " " + surname);
    }
    public void getFullName(String name, String surname){
        System.out.println(name + " " + surname);
    }

    static void print(){
        System.out.println("Hello");
    }
}
