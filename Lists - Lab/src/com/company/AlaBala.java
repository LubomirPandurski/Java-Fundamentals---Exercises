package com.company;


public class AlaBala {
    static class Student{
        int ID;
        String name;
        int age;

        Student(String name, int ID, int age){
            this.name = name;
            this.ID = ID;
            this.age = age;
        }
        String getInfo(){
            return  "ID:" + this.ID + " " + "age" + this.age + " " + "name" + this.name;
        }
    }
    public static void main(String[] args) {
        Student a = new Student("Lubo", 303030,30);

        System.out.println(a.getInfo());

        Student b = new Student("Penchp", 898076, 29);

        System.out.println(b.getInfo());


    }
}
