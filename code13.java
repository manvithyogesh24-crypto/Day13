import java.util.*;

public class code13 {

    private HashMap<String, String> phoneBook = new HashMap<>();

    // Add Contact
    public void addContact(String name, String phoneNumber) {
        phoneBook.put(name, phoneNumber);
        System.out.println("Contact added successfully.");
    }

    // Search Contact
    public void searchContact(String name) {
        if (phoneBook.containsKey(name)) {
            System.out.println("Phone Number of " + name + ": " + phoneBook.get(name));
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Delete Contact
    public void deleteContact(String name) {
        if (phoneBook.containsKey(name)) {
            phoneBook.remove(name);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Display All Contacts
    public void displayAll() {
        if (phoneBook.isEmpty()) {
            System.out.println("Phone book is empty.");
        } else {
            for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
                System.out.println(entry.getKey() + " -> " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {

        code13 pb = new code13();

        pb.addContact("Ravi", "9876543210");
        pb.addContact("Anu", "9123456780");

        pb.displayAll();

        pb.searchContact("Ravi");

        pb.deleteContact("Anu");

        pb.displayAll();
    }
}
