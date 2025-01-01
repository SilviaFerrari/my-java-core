package com.SilviaFerrari.main.oop.phonebook;

import java.util.Arrays;

public class PhoneBookArray implements PhoneBook{
    final Person[] phoneBook;

    public PhoneBookArray() {
        this.phoneBook = new Person[MAX_PERSONS];
    }

    @Override
    public boolean addPerson(Person p) {
        for(Person person : phoneBook) {
            if(person != null && person.equals(p)) {
                return false;
            }
        }
        for(int i = 0; i < MAX_PERSONS; i++) {
            if(phoneBook[i] == null) {
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for(int i = 0; i < MAX_PERSONS; i++) {
            if(phoneBook[i] != null && phoneBook[i].equals(p)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        Person[] found = new Person[MAX_PERSONS];
        int index = 0;
        for(Person person : phoneBook) {
            if(person != null && person.getLastname().equals(lastname)) {
                found[index++] = person;
            }
        }
        return Arrays.copyOf(found, index);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        Person[] found = new Person[MAX_PERSONS];
        int index = 0;
        for(Person person : phoneBook) {
            if(person != null && person.getLastname().equals(lastname) && person.getName().equals(name)) {
                found[index++] = person;
            }
        }
        return Arrays.copyOf(found, index);
    }
}
