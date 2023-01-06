import java.util.Scanner;

public class Main {

    static String[] guests = new String[10];
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        populateGuests();

        do {
            printMenu();
            int option = in.nextInt();
            System.out.println();

            if (option == 1) {
                displayGuests();
            } else if (option == 2) {
                addGuest();
            }
            else if (option == 3) {
                removeGuest();
            } else if (option == 4) {
                break;
            }
        } while (true);

        System.out.print("Exiting...");
    }

    static void populateGuests() {
        guests[0] = "Ian";
        guests[1] = "David";
        guests[2] = "Jane";
        guests[3] = "Mark";
        guests[4] = "Sarah";
    }

    static void printMenu() {
        System.out.println("\nMenu:\n----------------------\n");
        System.out.println("1 - Display all guests");
        System.out.println("2 - Add guest");
        System.out.println("3 - Remove guest");
        System.out.println("4 - Exit");
        System.out.println("Option: ");
    }

    static void displayGuests() {
        System.out.println("\nGuests:\n----------------------\n");
        Boolean isEmpty = true;
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                System.out.println((i + 1) + ". " + guests[i]);
                isEmpty = false;
            }
        }

        if (isEmpty) {
            System.out.println("The guest list is empty.");
        }
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
            if (guests[i] == null) {
                System.out.println("Guest name: ");
                guests[i] = in.next();
                break;
            }
        }
    }

    static void removeGuest() {
        System.out.println("Guest name: ");
        String name = in.next();

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null && guests[i].equals(name)) {
                guests[i] = null;
                break;
            }
        }

        String [] temp = new String[guests.length];
        int counter = 0;

        for (int i = 0; i < guests.length; i++) {
            if (guests[i] != null) {
                temp[counter] = guests[i];
                counter++;
            }
        }
        guests = temp;
    }
}
