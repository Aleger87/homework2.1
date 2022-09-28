public class Main {
    public static void main(String[] args) {
    Person person = new Person();
    person.name = "Lyapis";
    person.surname = "Trubetskoy";
    changeValue(person);
    System.out.println(person.toString());
    }

    private static void changeValue(Person person) {
        //person = new Person();
        person.name = "Ilya";
        person.surname = "Lagutenko";

    }
}

class Person {
    String name;
    String surname;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}