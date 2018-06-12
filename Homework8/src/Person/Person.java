package Person;

public class Person {
    private String name;
    private String surname;
    private String email;
//    private Passport passport;


    Person() {
        this.name = "John";
        this.surname = "Doe";
        this.email = "john_doe@epam.com";
    }

    Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

//    public void setPassport(Passport passport) {
//        this.passport = passport;
//    }
//
//    public Passport getPassport() {
//        return this.passport;
//    }

    @Override
    public String toString() {
        return ("Name - " + this.name + '\n') +
                ("Surname - " + this.surname + '\n') +
                ("Email - " + this.email + '\n');
    }

}
