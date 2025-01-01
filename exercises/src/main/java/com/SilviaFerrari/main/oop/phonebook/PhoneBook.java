package com.SilviaFerrari.main.oop.phonebook;

public interface PhoneBook {
    static final int MAX_PERSONS = 256;

    boolean addPerson(Person p);

    boolean removePerson(Person p);

    Person[] searchByLastname(String lastname);

    Person[] searchByNameAndLastname(String name, String lastname);
}
