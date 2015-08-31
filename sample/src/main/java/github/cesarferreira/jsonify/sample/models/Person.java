package github.cesarferreira.jsonify.sample.models;

import com.google.gson.annotations.SerializedName;


    /**
     * Created with cesarferreira/j2j
     */
    public static class Location {

        private String street;
        private String city;
        private String state;
        private String zip;

        public Location(String city, String state) {
            this.city = city;
            this.state = state;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

    }

    /**
     * Created with cesarferreira/j2j
     */
    public  class Person {

        private Long id;
        @SerializedName("full_name")
        private String fullName;
        @SerializedName("family_name")
        private String familyName;
        private String password;
        private String status;
        private String gender;
        private Contact contact;
        private Location location;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public String getFamilyName() {
            return familyName;
        }

        public void setFamilyName(String familyName) {
            this.familyName = familyName;
        }

        public String getPassword() {
            return password;
        }

        public void setPassword(String password) {
            this.password = password;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public Contact getContact() {
            return contact;
        }

        public void setContact(Contact contact) {
            this.contact = contact;
        }

        public Location getLocation() {
            return location;
        }

        public void setLocation(Location location) {
            this.location = location;
        }

    }

    /**
     * Created with cesarferreira/j2j
     */
    public static class Contact {

        public EmailAddress emailAddress;
        public String phoneNumber;

        public Contact(EmailAddress emailAddress, String phoneNumber) {
            this.emailAddress = emailAddress;
            this.phoneNumber = phoneNumber;
        }

    }

    public static class EmailAddress {
        public String email;

        public EmailAddress(String email) {
            this.email = email;
        }
    }
}
