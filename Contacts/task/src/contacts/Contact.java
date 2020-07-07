package contacts;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {

    private String name;
    private String surname;
    private String phoneNumber;



    public Contact(String name, String surname, String number){
    this.name = name;
    this.surname = surname;
    this.phoneNumber = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setNumber(String number) {

            this.phoneNumber = number;

        System.out.println("Incorrect format");
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getNumber() {
        return phoneNumber;
    }

}
