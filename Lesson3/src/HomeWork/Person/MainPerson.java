package HomeWork.Person;

public class MainPerson {

    public static void main(String[] args) {
        Person john = new Person();
        Person bob = new Person("Bob","Smith","bob_smith@epam.com");
        System.out.println(john);
        System.out.println(bob);
    }
}
