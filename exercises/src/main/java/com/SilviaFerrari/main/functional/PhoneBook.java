package com.SilviaFerrari.main.functional;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class PhoneBook {
    private final List<Person> people;

    public PhoneBook(List<Person> people){
        this.people = people;
    }

    public Optional<Person> searchByLastname(String lastname){
        for(Person person : people){
            if(person.getLastname().equals(lastname)){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public Optional<Person> searchByNameAndLastname(String name, String lastname){
        for(Person person : people){
            if(person.getName().equals(name) && person.getLastname().equals(lastname)){
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public String getLastname() {
            return lastname;
        }

        public String getPhone() {
            return phone;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name) && Objects.equals(lastname, person.lastname) && Objects.equals(phone, person.phone);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, lastname, phone);
        }
    }
}
