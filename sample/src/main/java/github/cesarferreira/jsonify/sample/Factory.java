package github.cesarferreira.jsonify.sample;


import github.cesarferreira.jsonify.sample.models.Person;

public class Factory {

    public static Person createDummyPerson() {
        Person person = new Person();
        person.setFullName("César Ferreira");
        person.setGender("male");
        person.setPassword("yoloswag69");
        person.setContact(new Person.Contact(new Person.EmailAddress("yolo@gmail.com"), "919191919191"));
        person.setLocation(new Person.Location("Lisbon", "Texas"));
        return person;
    }
}
