package com.company;

public class Person {
    protected String name;
    protected String surname;
    protected Integer age;
    protected String city;

    public Person(String name, String surname, Integer age, String city) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Integer getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public boolean hasAddress() {
        return !(this.city.isEmpty() || this.city == null);
    }

    public void setAddress(String city) {
        this.city = city;
    }

    public boolean hasAge() {
        return !(this.age <= 0 || this.age == null);
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        PersonBuilder res = new PersonBuilder();
        res.setSurname(this.surname).setAddress(this.city).setAge(1);
        return res;
    }


    @Override
    public String toString() {
        return ('[' + name + " " +
                surname + " " +
                age + " " +
                city + ']');
    }

}
