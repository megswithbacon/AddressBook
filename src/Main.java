import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    private static final AddressBook myBook = new AddressBook();
    private static final Scanner input = new Scanner(System.in);
    private static boolean addEntry = false;
    private static boolean removeEntry = false;
    private static boolean searchEntry = false;
    private static boolean printAddressBook = false;
    private static boolean deleteAddressBook = false;
    private static boolean quitTime = false;


    private static void addEntry(){
        System.out.println("1) Add Entry -- Please provide the following information: ");
        System.out.println("First Name: ");
        String firstName = input.nextLine();
        System.out.println("Last Name: ");
        String lastName = input.nextLine();
        System.out.println("Phone Number: ");
        String phoneNumber = input.nextLine();
        System.out.println("Email: ");
        String email = input.nextLine();

        Entry newEntry = Entry.createNewEntry(firstName, lastName, phoneNumber, email);

        try{
            myBook.addEntry(newEntry);
            System.out.println("The following Entry has been added to the AddressBook: ");
            System.out.println(newEntry.toString());
        } catch(InputMismatchException e){
            System.out.println("Entry not added: " + e.getMessage());
        }
    }

    private static void removeEntry(){


    }

    private static void searchForEntry(){

    }

    private static void printAddressBook(){

    }

    private static void deleteAddressBook(){

    }

    private static void startProgram(){
        System.out.println("""
                ----------------
                | ADDRESS BOOK |
                ----------------
                1) Add an entry

                2) Remove an entry

                3) Search for a specific entry

                4) Print Address Book

                5) Delete Book

                6) Quit

                 \s
                Please choose what you'd like to do with the database:""");
    }

    private static void processMainMenuInput(String input) {
           switch (input) {
                case "1" -> addEntry = true;
                case "2" -> removeEntry = true;
                case "3" -> searchEntry = true;
                case "4" -> printAddressBook = true;
                case "5" -> deleteAddressBook = true;
                case "6" -> quitTime = true;
                default -> System.out.println("************ PLEASE ENTER A VALID OPTION: ************ \n");
            }
    }


    private static void quitProgram(){
        quitTime = true;
    }

    public static void main(String[] args) {
    do {
        startProgram();
        String mainMenuInput = input.nextLine();

        processMainMenuInput(mainMenuInput);
        if (addEntry) {
            addEntry();
        } else if (removeEntry) {

        } else if (searchEntry) {

        } else if (printAddressBook) {

        } else if (deleteAddressBook) {

        } else if (quitTime) {

        }
    } while(!quitTime);







        /*myBook.addEntry(Entry.createNewEntry("Megan", "Lowe", "5555555", "email@email.com"));
        myBook.printAddressBook();
        myBook.addEntry(Entry.createNewEntry("Laura", "Wallace", "1234567", "email@email.one.com"));
        myBook.printAddressBook();
        myBook.removeEntry("email@email.one.com");
        myBook.printAddressBook();
        myBook.printMatches(myBook.searchForEntry("00", AddressBook.SearchType.PHONE_NUMBER));
    */}
}
