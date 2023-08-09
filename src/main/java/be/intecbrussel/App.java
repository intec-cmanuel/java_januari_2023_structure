package be.intecbrussel;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        mainLoop : while (true) {


            Scanner scanner = new Scanner(System.in);

            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            int mainMenuChoice = scanner.nextInt();

            Object user = null;
            switch (mainMenuChoice) {
                case 1 -> user = register();
                case 2 -> user = login();
                case 3 -> { break mainLoop; }
            }

            if (user == null) {
                break mainLoop;
            }

            libraryMenu(user);
        }
    }

    private static Object register() {
        return null;
    }

    private static Object login() {
        return null;
    }

    private static void libraryMenu(Object user) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello " + user);
        System.out.println("1. Add book");
        System.out.println("2. Exit");
        int libraryChoice = scanner.nextInt();

        if (libraryChoice != 1) {
            return;
        }

        // rest van de code

    }
}
