package com.company;

public class PersonBuilder {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String city;

    public PersonBuilder() {
    }


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(Integer age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.city = address;
        return this;
    }

    public Person build() throws Exception {
        if (name==null) {
            throw new IllegalStateException("Name can not be empty!");
        }
        if (surname==null) {
            throw new IllegalStateException("Surname can not be empty!");
        }
        if (age == null) {
            throw new IllegalStateException("Age can not be empty!");
        }
        if (age <= 0 || age > 150) {
            throw new IllegalArgumentException("Age is incorrect!");
        }
        return new Person(name, surname, age, city);
    }

}
