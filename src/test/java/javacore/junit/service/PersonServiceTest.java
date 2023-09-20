package javacore.junit.service;

import javacore.junit.dominio.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PersonServiceTest {

    private Person adult;
    private Person notAdult;
    private PersonService personService;

    @BeforeEach
    public void setUp(){
        adult = new Person(18);
        notAdult = new Person(15);
        personService = new PersonService();
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult() {
        Assertions.assertFalse(personService.isAdult(notAdult));
    }

    @Test
    @DisplayName("A person should be not adult when age is greater or equals than 18")
    void isAdult_ReturnTrue_WhenAgeIsGreaterOrEqualsThan18() {
        Assertions.assertFalse(personService.isAdult(adult));
    }

    @Test
    @DisplayName("A person should be not adult when age is lower than 18")
    void isAdult_ShouldThrowException_WhenPersonIsNull() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> personService.isAdult(null), "Person can't be null");
    }

//    @Test
//    @DisplayName("A person should be not adult when age is lower than 18")
//    void filterRemovingNotAdult() {
//       Person person1 = new Person(17);
//       Person person2 = new Person(17);
//       Person person3 = new Person(17);
//        List<Person> personList = List.of(person1, person2, person3);
//        Assertions.assertEquals(2, personService.filterRemovingNotAdult(personList));
//    }
}