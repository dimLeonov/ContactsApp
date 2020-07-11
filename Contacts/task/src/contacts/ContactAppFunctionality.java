package contacts;

import java.util.ArrayList;
import java.util.Scanner;

public class ContactAppFunctionality {
    public ArrayList<Contact> contacts = new ArrayList<Contact>(); //Хранилище
    final int i = 1; //статическая переменая для нумерования

    private Scanner scanner = new Scanner(System.in); //Сканнер для инпутов

    public void actionSelector() { //Выбор действия
        System.out.println("Enter Action (add, remove, edit, count, list, exit):");
        ;
        String operation = scanner.next();
        switch (operation){
            case "add":
                add();
                actionSelector();
                break;
            case "remove":
                remove();
                actionSelector();
                break;
            case "edit":
                edit();
                actionSelector();
                break;
            case "count":
                count();
                actionSelector();
                break;
            case "list":
                list();
                actionSelector();
                break;
            case "exit":
                break;
            default:
                System.out.println("wrong message");
                actionSelector();
        }

    }

    private void add() { //добавления нового контакта в хранилище
        System.out.println("Enter the name: ");
        String name = scanner.next();
        System.out.println("Enter the surnam: ");
        String surname = scanner.next();
        System.out.println("Enter the number");

        String number = scanner.next();

        contacts.add(new Contact(name,surname,number));
        System.out.println("The record added");
    }

    private void list() { // Вывод списка контактов
        for (Contact contact : contacts) {
            System.out.println((contacts.indexOf(contact) + i) + ". " + contact.getName() + " " + contact.getSurname() + " " + contact.getNumber());
        }

    }

    private void remove() { //удаленние юзера из списка
        if (contacts.size() == 0){
            System.out.println("No records to remove!");
            actionSelector();
        }
        list();
        System.out.println("Select a record: " );
        int record = scanner.nextInt();
        record -= 1;
        if (contacts.get(record) != null) {
            contacts.remove(record);
            System.out.println("Contact deleted");
        } else {
            System.out.println("Record is not exist");
            actionSelector();
        }


    }

    private void count() {//колличество контактов
        System.out.println("The phone Book has " + contacts.size() + " records.");
    }
    private void edit() {//редакторивонние юзера
        if (contacts.size() == 0){
            System.out.println("No records to edit!");
            actionSelector();
        }
        list();
        System.out.println("Select a record: " );
        int record = scanner.nextInt();
        record -= 1;

        if (contacts.get(record) != null) {
            System.out.println("Select a field (name, surname, number): >");
            String operation = scanner.next();
            switch (operation){
                case "name":
                    System.out.println("Enter name: ");
                    contacts.get(record).setName(scanner.next());
                    System.out.println("The record updated!");
                    actionSelector();
                    break;
                case "surname":
                    System.out.println("Enter Surname: ");
                    contacts.get(record).setSurname(scanner.next());
                    System.out.println("The record updated!");
                    actionSelector();
                    break;
                case "number":
                    System.out.println("Enter number: ");
                    contacts.get(record).setNumber(scanner.next());
                    System.out.println("The record updated!");
                    actionSelector();
                    break;
                default:
                    actionSelector();
            }
            System.out.println("Contact deleted");
        } else {
            System.out.println("Record is not exist");
            actionSelector();
        }







    }
}

