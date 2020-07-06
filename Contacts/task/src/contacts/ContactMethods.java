package contacts;

import java.util.Scanner;

public class ContactMethods {

    private Scanner scanner;
    private String name;
    private String surname;
    private String number;

    public void enterTheNameOfThePerson(){
        scanner = new Scanner(System.in);
        System.out.println("Enter the name of the person: \n");
        name = scanner.next();
        System.out.println("Enter the surname of the person: \n");
        surname = scanner.next();
        System.out.println("Enter the number: \n");
        number = scanner.next();
        System.out.println("\n A record created!");
        System.out.println("A Phone Book with a single record created!");
    }
}
