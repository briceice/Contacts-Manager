import util.Input;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class ContactsApplication {
    public static void main(String[] args) {
        // read contacts
        readContacts();
        // display menu
        displayMenu();
        // draw contacts
        // add contact
        // search contacts
        // delete contacts
        // write contacts
        // exit
    }
    static Input input = new Input();
    static String directory = "src/data";
    static String filename = "contacts.txt";
    static Path dataDirectory = Paths.get(directory);
    static Path dataFile = Paths.get(directory, filename);
    static ArrayList<Contact> contacts = new ArrayList<>();

    private static void displayMenu(){
        int userInput = input.getInt("1. View contacts.\n" +
                "2. Add a new contact.\n" +
                "3. Search a contact by name.\n" +
                "4. Delete an existing contact.\n" +
                "5. Exit.\n" +
                "Enter an option (1, 2, 3, 4 or 5): ", 1, 5);
        if (userInput == 1){
            drawContacts();
            displayMenu();
        } else if (userInput == 2){
            addContact();
            displayMenu();
        } else if (userInput == 3){
            searchContacts();
            displayMenu();
        } else if (userInput == 4){
            deleteContact();
            displayMenu();
        } else if (userInput == 5){
            writeContacts();
            exitContacts();
        }
    }
    private static void drawContacts(){
        System.out.println("Name  |  Phone Number\n" +
                "---------------------");
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }
    private static void addContact(){
        String contactName = input.getString("Enter contact name: ");
        int contactNumber = input.getInt("Enter contact number: ");
        Contact contact = new Contact(contactName, contactNumber);
        contacts.add(contact);
    }
    private static void searchContacts(){
        String userInput = input.getString("Enter contact to search: ");
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(userInput)) {
                System.out.println(contact);
                return;
            }
        }
        System.out.println("Sorry, contact not found.");
    }
    private static void deleteContact(){
        String userInput = input.getString("Enter contact to delete: ");
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(userInput)) {
                contacts.remove(contact);
                System.out.println("Contact deleted");
                return;
            }
        }
        System.out.println("Sorry, contact not found.");
    }
    private static void exitContacts(){
        System.out.println("Goodbye, and have a wonderful day!");
    }
    private static void readContacts(){

    }
    private static void writeContacts(){

    }
}