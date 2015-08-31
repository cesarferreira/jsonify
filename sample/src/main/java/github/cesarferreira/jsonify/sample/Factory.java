package github.cesarferreira.jsonify.sample;


import github.cesarferreira.jsonify.sample.models.Contact;
import github.cesarferreira.jsonify.sample.models.EmailAddress;
import github.cesarferreira.jsonify.sample.models.Location;
import github.cesarferreira.jsonify.sample.models.Person;

public class Factory {

    public static Person createDummyPerson() {
        Person person = new Person();
        person.setFullName("César Ferreira");
        person.setGender("male");
        person.setPassword("yoloswag69");
        person.setContact(new Contact(new EmailAddress("yolo@gmail.com"), "919191919191"));
        person.setLocation(new Location("Lisbon", "Texas"));
        return person;
    }
}
