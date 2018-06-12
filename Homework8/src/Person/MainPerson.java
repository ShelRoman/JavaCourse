package Person;

import java.util.HashMap;

public class MainPerson {

    public static void main(String[] args) {
        Person john = new Person();
        Person bob = new Person("Bob","Smith","bob_smith@epam.com");
        Passport john_pass = new Passport();
        Passport bob_pass = new Passport("BB", 2222, bob.getName(), bob.getSurname());
        HashMap<Passport, Person> map = new HashMap<Passport, Person>();
        map.put(john_pass, john);
        map.put(bob_pass, bob);
        Passport pass = new Passport("BB", 2222, bob.getName(), bob.getSurname());
        System.out.println(map.get(pass));
    }
}
