package person;

public class main {
    public static void main(String[] args) {
        Person person = new Person();

        person.setAge(10);
        person.setName("Duvan");
        System.out.println(person.getName());
        System.out.println(person.getAge());

    }
}
