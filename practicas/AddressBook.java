import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    // Agregar contacto
    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("A contact with this email already exists.");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contact added successfully.");
        }
    }

    // Ver todos los contactos
    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("The address book is empty.");
            return;
        }
        for (Contact contact : contacts.values()) {
            System.out.println(contact.print());
        }
    }

    // Buscar contacto por email
    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email).print());
        } else {
            System.out.println("Contact not found.");
        }
    }

    // Borrar contacto por email
    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contact deleted.");
        } else {
            System.out.println("No contact found with the provided email.");
        }
    }

    // Guardar contactos en un archivo
    public void storeContacts() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("contacts.ser"))) {
            out.writeObject(contacts);
            System.out.println("Contacts saved successfully.");
        } catch (IOException e) {
            System.out.println("Error saving contacts: " + e.getMessage());
        }
    }

    // Cargar contactos desde un archivo
    public void loadContacts() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("contacts.ser"))) {
            contacts = (HashMap<String, Contact>) in.readObject();
            System.out.println("Contacts loaded successfully.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading contacts: " + e.getMessage());
        }
    }
}
