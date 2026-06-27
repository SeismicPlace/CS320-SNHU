package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import contact.Contact;
import contact.ContactService;

// Test the ContactService class and verify all requirements.

public class ContactServiceTest {

    private ContactService service;

    // Create a fresh contact service before each test.
    @BeforeEach
    void setUp() {
        service = new ContactService();
    }

    // Helper method to create a valid contact for service tests.
    private Contact createContact() {
        return new Contact(
                "12345",
                "Marlin",
                "Coral",
                "9876543210",
                "42 Wallaby Way Sydney");
    }

    // Add a contact and verify it was stored correctly in the service.
    @Test
    void testAddContact() {

        Contact contact = createContact();

        service.addContact(contact);

        assertEquals(contact, service.getContact("12345"));
    }

    // Verify that a null contact cannot be added.
    @Test
    void testAddNullContact() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(null);
        });
    }

    // Verify that the service throws an exception when a duplicate ID is added.
    @Test
    void testDuplicateContactId() {

        Contact contact1 = createContact();

        Contact contact2 = new Contact(
                "12345",
                "Dory",
                "Blue",
                "1112223333",
                "Great Barrier Reef");

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    // Delete a contact and verify it no longer exists in the service.
    @Test
    void testDeleteContact() {

        Contact contact = createContact();

        service.addContact(contact);
        service.deleteContact("12345");

        assertThrows(IllegalArgumentException.class, () -> {
            service.getContact("12345");
        });
    }

    // Verify that deleting a nonexistent contact throws an exception.
    @Test
    void testDeleteContactThatDoesNotExist() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.deleteContact("12345");
        });
    }

    // Update the first name and verify the new value was saved correctly.
    @Test
    void testUpdateFirstName() {

        Contact contact = createContact();

        service.addContact(contact);
        service.updateFirstName("12345", "Nemo");

        assertEquals("Nemo", service.getContact("12345").getFirstName());
    }

    // Verify that updating the first name for a missing contact throws an exception.
    @Test
    void testUpdateFirstNameForMissingContact() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("12345", "Nemo");
        });
    }

    // Update the last name and verify the contact stores the new value.
    @Test
    void testUpdateLastName() {

        Contact contact = createContact();

        service.addContact(contact);
        service.updateLastName("12345", "Reef");

        assertEquals("Reef", service.getContact("12345").getLastName());
    }

    // Verify that updating the last name for a missing contact throws an exception.
    @Test
    void testUpdateLastNameForMissingContact() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateLastName("12345", "Reef");
        });
    }

    // Change the phone number and confirm the updated value is returned.
    @Test
    void testUpdatePhone() {

        Contact contact = createContact();

        service.addContact(contact);
        service.updatePhone("12345", "2223334444");

        assertEquals("2223334444", service.getContact("12345").getPhone());
    }

    // Verify that updating the phone number for a missing contact throws an exception.
    @Test
    void testUpdatePhoneForMissingContact() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.updatePhone("12345", "2223334444");
        });
    }

    // Change the address for an existing contact and confirm the update worked.
    @Test
    void testUpdateAddress() {

        Contact contact = createContact();

        service.addContact(contact);
        service.updateAddress("12345", "Sydney Harbor");

        assertEquals("Sydney Harbor", service.getContact("12345").getAddress());
    }

    // Verify that updating the address for a missing contact throws an exception.
    @Test
    void testUpdateAddressForMissingContact() {

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateAddress("12345", "Sydney Harbor");
        });
    }
}