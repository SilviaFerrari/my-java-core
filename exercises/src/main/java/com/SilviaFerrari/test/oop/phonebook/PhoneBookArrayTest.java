package com.SilviaFerrari.test.oop.phonebook;

import com.SilviaFerrari.main.oop.phonebook.Person;
import com.SilviaFerrari.main.oop.phonebook.PhoneBookArray;
import org.junit.jupiter.api.BeforeEach;

class PhoneBookArrayTest extends PhoneBookTestBase {
    @BeforeEach
    void setUp() {
        pb = new PhoneBookArray();
        pb.addPerson(new Person("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Person("Marco", "Rizzo", "45243"));
        pb.addPerson(new Person("Luisa", "Poppi", "24564"));
    }
}