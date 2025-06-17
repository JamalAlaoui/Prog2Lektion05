package opgave01;

public class Person {
    private String firstName;
    private String middleName;
    private String surname;

    public Person(String firstName, String middleName, String surname) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.surname = surname;
    }

    public String printName(NameFormatter formatter) {

        String formattednavn = formatter.format(firstName, middleName, surname);
        System.out.println(formattednavn);
        return formattednavn;
    }


    }
