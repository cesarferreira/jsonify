# jsonify
Aren't you tired of using breakpoints and expanding all the properties to see a complete object?

<p align="center">
<img src="https://raw.githubusercontent.com/cesarferreira/jsonify/master/extras/screenshot.png" width="100%" />
</p>


## Usage

Turn this:
```java
Person person = new Person();
person.setFullName("César Ferreira");
person.setGender("male");
person.setPassword("yoloswag69");
Contact contact = new Contact(new EmailAddress("yolo@gmail.com");
person.setContact(contact, "919191919191"));
person.setLocation(new Location("Lisbon", "Texas"));
```

into this:
```json
{
  "contact": {
    "emailAddress": {
      "email": "yolo@gmail.com"
    },
    "phoneNumber": "919191919191"
  },
  "full_name": "César Ferreira",
  "gender": "male",
  "location": {
    "city": "Lisbon",
    "state": "Texas"
  },
  "password": "yoloswag69"
}
```

With just this:
> JSONify.from(person)


## Install

Add the dependency in the form:
```groovy
dependencies {
  compile 'com.cesarferreira.jsonify:jsonify:0.1.0'
}
```



## Contributing

1. Fork it ( https://github.com/cesarferreira/jsonify/fork )
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Add some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create a new Pull Request
