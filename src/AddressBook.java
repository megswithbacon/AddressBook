import java.util.ArrayList;

public class AddressBook {
    // ArrayList of Entries used to store and manipulate AddressBook
    ArrayList<Entry> addressBook = new ArrayList<>();

    // ENUM used for query searches
    public enum SearchType {
        FIRST_NAME,
        LAST_NAME,
        PHONE_NUMBER,
        EMAIL
    }

    // checks for unique email and created new Entry with user input
    public void addEntry(Entry entry) {
        // check for a unique email
        ArrayList<Entry> emailMatches = searchForEmail(entry.getEmail());
        if (emailMatches.isEmpty()) {
            try {
                addressBook.add(entry);
            } catch (NullPointerException e) {
                System.out.println("Your address book is empty");
            }
        } else {
            System.out.println("This email address is already in the Address Book-- \n Please use a unique email!");
        }
    }

    // Searches for existing email in AddressBook and assignes to new ArrayList
    // if no matches-- output to user // otherwise, search through existing AddressBook and remove matches in list
    public void removeEntry(String email) {
        ArrayList<Entry> matches = searchForEmail(email);
        if (matches.isEmpty()) {
            System.out.println("This Entry does not exist in the Address Book");
        } else {
            for (Entry match : matches) {
                addressBook.remove(match);
                System.out.println("Your Entry containing " + email + " has been removed from your Address Book!");
                break;
            }
        }
    }

    // allows for single FirstName search
    public ArrayList<Entry> searchForFirstName(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getFirstName().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    // allows for single LastName search
    public ArrayList<Entry> searchForLastName(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getLastName().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    // allows for single PhoneNumber search
    public ArrayList<Entry> searchForPhoneNumber(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getPhoneNumber().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }

    // allows for single Email search
    public ArrayList<Entry> searchForEmail(String searchQuery) {
        ArrayList<Entry> matchList = new ArrayList<>();
        for (Entry entry : addressBook) {
            if (entry.getEmail().contains(searchQuery)) {
                matchList.add(entry);
            }
        }
        return matchList;
    }
    // search function that will search for userInput by Type (FirstName, LastName, PhoneNumber, Email)
    public ArrayList<Entry> searchForEntry(String searchQuery, SearchType searchType) {
        ArrayList<Entry> matchList = new ArrayList<>();
        switch (searchType) {
            case FIRST_NAME -> {
                matchList = searchForFirstName(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case LAST_NAME -> {
                matchList = searchForLastName(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case PHONE_NUMBER -> {
                matchList = searchForPhoneNumber(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            case EMAIL -> {
                matchList = searchForEmail(searchQuery);
                if (matchList.isEmpty()) {
                    System.out.println("There is no entry matching your search");
                }
            }
            default -> System.out.println("Please choose one of the criteria to search with");
        }
        return matchList;
    }

    // System Out ArrayList of matches after search
    public void printMatches(ArrayList<Entry> matchList) {
        for (Entry entry : matchList) {
            System.out.println(entry.toString());
        }
    }

    // Print Address Book to Console
    public void printAddressBook() {
        if (addressBook.isEmpty()) {
            System.out.println("You have no entries in your Address Book!");
        } else {
            System.out.println("**** CURRENT ADDRESS BOOK: ****");
            for (Entry entry : addressBook) {
                System.out.println(entry.toString());
            }
        }
    }

    // Delete all items in Address Book ArrayList
    public void deleteAddressBook() {
        if (addressBook.isEmpty()) {
            System.out.println("The Address Book is already empty");
        } else {
            addressBook.clear();
        }
    }
}