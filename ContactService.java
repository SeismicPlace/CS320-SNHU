package contact;

import java.util.HashMap;
import java.util.Map;

// This class manages contacts in memory.
// Contacts can be added, deleted, and updated using a contact ID.

public class ContactService {

    // Store contacts using the contact ID as the key.
    private final Map<String, Contact> contacts = new HashMap<>();

    // Add a new contact if the ID does not already exist.
    public void addContact(Contact contact) {

        // Prevent null contacts from being added.
        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        // Prevent duplicate contact IDs.
        if (contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Contact ID already exists");
        }

        contacts.put(contact.getContactId(), contact);
    }

    // Delete a contact using the contact ID.
    public void deleteContact(String contactId) {

        // Verify the contact exists before deleting.
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contacts.remove(contactId);
    }

    // Update the first name and save the new value.
    public void updateFirstName(String contactId, String firstName) {

        Contact contact = contacts.get(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setFirstName(firstName);
    }

    // Update the last name and save the new value.
    public void updateLastName(String contactId, String lastName) {

        Contact contact = contacts.get(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setLastName(lastName);
    }

    // Update the phone number and save the new value.
    public void updatePhone(String contactId, String phone) {

        Contact contact = contacts.get(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setPhone(phone);
    }

    // Update the address and save the new value.
    public void updateAddress(String contactId, String address) {

        Contact contact = contacts.get(contactId);

        if (contact == null) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        contact.setAddress(address);
    }

    // Return a contact using the contact ID.
    // This method is mainly used for testing.
    public Contact getContact(String contactId) {

        // Verify the contact exists before returning it.
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact ID not found");
        }

        return contacts.get(contactId);
    }
}