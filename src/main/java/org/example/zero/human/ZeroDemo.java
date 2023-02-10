package org.example.zero.human;

import java.time.LocalDate;

public class ZeroDemo {
    public static void main(String[] args) {
        Person person=new Person();
        person.setName("Mirsad");
        person.setSurname("Skandro");
        person.setBirthday(LocalDate.of(1981,12,7));
        System.out.println(person.getAge());

        Person alden =new Student();
        alden.setName("Alden");
        alden.setSurname("Efendic");
        alden.setBirthday(LocalDate.of(2000,1,1));
        System.out.println(alden.getName()+" ima godina "+alden.getAge()+".");
    }
}
