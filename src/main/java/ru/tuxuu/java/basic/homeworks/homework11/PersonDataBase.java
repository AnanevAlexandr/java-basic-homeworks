package ru.tuxuu.java.basic.homeworks.homework11;

import java.util.HashMap;
import java.util.Map;

public class PersonDataBase {
    private Map<Long, Person> personMap;

    public PersonDataBase() {
        this.personMap = new HashMap<>();
    }

    @Override
    public String toString() {
        return personMap.toString();
    }

    public Person findById(Long id) {
        return personMap.get(id);
    }

    public Person add(Person person) {
        return personMap.put(person.getId(), person);
    }

    public boolean isManager(Person person) {
        if (person.getPosition() == Position.MANAGER ||
                person.getPosition() == Position.DIRECTOR ||
                person.getPosition() == Position.BRANCH_DIRECTOR ||
                person.getPosition() == Position.SENIOR_MANAGER) {
            return true;
        }
        return false;
    }

    public boolean isEmployee(Long id) {
        Person person = personMap.get(id);
        return !isManager(person);
    }
}

