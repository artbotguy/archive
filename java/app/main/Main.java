package app.main;

import java.util.ArrayList;
import java.util.HashMap;

import InheritanceInterfaces.Student;
import InheritanceInterfaces.SuperCounter;
import InheritanceInterfaces.Counter;

import InheritanceInterfaces.Person;
import InheritanceInterfaces.Teacher;
import InheritanceInterfaces.Interfaces.Book;
import InheritanceInterfaces.Interfaces.Box;
import InheritanceInterfaces.Interfaces.CD;

public class Main {

    public static void main(String args[]) {

        Box box = new Box(10.0);

        box.add(new Book("Fyodor Dostoevsky", "Crime and Punishment", 9));
        box.add(new Book("Robert Martin", "Clean Code", 1));
        box.add(new Book("Kent Beck", "Test Driven Development", 0.7));

        box.add(new CD("Pink Floyd", "Dark Side of the Moon", 1973));
        box.add(new CD("Wigwam", "Nuclear Nightclub", 1975));
        box.add(new CD("Rendezvous Park", "Closer to Being Here", 2012));

        System.out.println(box);
    }

}