package by.patsei.builder;

public class Demo {
    public static void main(String[] args) {
        Person myPerson = new Person.Builder()
                .withName("Anna")
                .withSurname("Ivanova")
                .withAge(22)
                .withHeight(165)
                .withWeight(70)
                .build();
    }
}
