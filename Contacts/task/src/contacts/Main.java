package contacts;

import java.util.Scanner;

public class Main {

    private Scanner scanner;
    private String name;
    private String surname;
    private String number;

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
        }

    }

    private void add() {
    }

    private void list() {

    }

    private void exit() {

    }
    private void remove() {

    }
    private void count() {

    }
    private void edit() {

    }


    public static void main(String[] args) {
        Main main = new Main();
        main.actionSelector();
    }
}
