package com.SilviaFerrari.main.oop.phonebook;

import java.util.ArrayList;

public class PhoneBookList implements PhoneBook {

    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        this.phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
        if(!phoneBook.contains(p) && phoneBook.size() < MAX_PERSONS) {
            phoneBook.add(p);
            return true;
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> found = new ArrayList<>();
        for(Person person : phoneBook) {
            if(person.getLastname().equals(lastname)) {
                found.add(person);
            }
        }
        return found.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> found = new ArrayList<>();
        for(Person person : phoneBook) {
            if(person.getLastname().equals(lastname) && person.getName().equals(name)) {
                found.add(person);
            }
        }
        return found.toArray(new Person[]{});
    }
}