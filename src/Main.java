import java.util.Scanner;

public class Main {
    private static final AddressBook myBook = new AddressBook();
    private static boolean quitTime = false;
    private static final


    private static void addEntry(String firstName, String lastName, String phoneNumber, String email){
        System.out.println("First Name: ");
        firstName = input;
        System.out.println("Last Name: ");
        lastName = input.nextLine();
        System.out.println("Phone Number: ");
        phoneNumber= input.nextLine();
        System.out.println("Email: ");
        email = input.nextLine();
        Entry newEntry = Entry.createNewEntry(firstName, lastName,phoneNumber, email);
        myBook.addEntry(newEntry);
        System.out.println("Your entry has been added to the Address Book!");
    }

    private static String getInput(){

    }

    private static void removeEntry(){


    }

    private static void searchForEntry(){

    }

    private static void printAddressBook(){

    }

    private static void deleteAddressBook(){

    }

    private static void startProgram(String input){
        System.out.println("1) Add an entry\n" +
                "\n" +
                "2) Remove an entry\n" +
                "\n" +
                "3) Search for a specific entry\n" +
                "\n" +
                "4) Print Address Book\n" +
                "\n" +
                "5) Delete Book\n" +
                "\n" +
                "6) Quit\n" +
                "\n" +
                "  \n" +
                "Please choose what you'd like to do with the database:");

        if(validInputCheck(input)) {
            switch (input) {
                case "1" -> {
                    addEntry(input);
                }
                case "2" -> {
                    removeEntry();
                }
                case "3" -> {
                    searchForEntry();
                }
                case "4" -> {
                    printAddressBook();
                }
                case "5" -> {
                    deleteAddressBook();
                }
                case "6" -> {
                    quitProgram();
                }
                default -> {
                    System.out.println("isValid Check is broken prolly");
                }
            }
        } else {
            System.out.println("Please enter a Valid option");
        }
    }

    private static void quitProgram(){
        quitTime = false;
    }

    private static boolean validInputCheck(String input){
        boolean isValid = false;
        if(input.contains("1") || input.contains("2") || input.contains("3") || input.contains("4") || input.contains("5") || input.contains("6")){
            isValid = true;
        }
        return isValid;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();
        do {
            startProgram(userInput);
        } while (quitTime);




        /*myBook.addEntry(Entry.createNewEntry("Megan", "Lowe", "5555555", "email@email.com"));
        myBook.printAddressBook();
        myBook.addEntry(Entry.createNewEntry("Laura", "Wallace", "1234567", "email@email.one.com"));
        myBook.printAddressBook();
        myBook.removeEntry("email@email.one.com");
        myBook.printAddressBook();
        myBook.printMatches(myBook.searchForEntry("00", AddressBook.SearchType.PHONE_NUMBER));
    */}
}
