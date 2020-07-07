package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public ArrayList<Contact> contacts = new ArrayList<Contact>();
    Contact contact;

    private Scanner scanner;

    public void actionSelector() {
        System.out.println("Enter Action (add, remove, edit, count, list, exit):");
        scanner = new Scanner(System.in);
        String operation = scanner.next();
        switch (operation){
            case "add":
                add();
                System.out.println("add method starting");
                actionSelector();
                break;
            case "remove":
                remove();
                System.out.println("remove method starting");
                actionSelector();
                break;
            case "edit":
                edit();
                System.out.println("edit method starting");
                actionSelector();
                break;
            case "count":
                count();
                System.out.println("count method starting");
                actionSelector();
                break;
            case "list":
                list();
                System.out.println("list method starting");
                actionSelector();
                break;
            case "exit":
                System.out.println("Exit operation");
                break;
            default:
                System.out.println("wrong message");
                actionSelector();
        }

    }

    private void add() {
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the surnam: ");
        String surname = scanner.next();
        System.out.println("Enter the number");
        String number = scanner.next();
        contacts.add(new Contact(name,surname,number));
        System.out.println("Record is added");
    }

    private void list() {
        for (Contact contact : contacts) {
            System.out.println(contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
        }

    }

    private void remove() {


    }
    private void count() {
        System.out.println("The phone Book has " + contacts.size() + " records");
    }
    private void edit() {

    }


    public static void main(String[] args) {
        Main main = new Main();
        main.actionSelector();
    }
}
