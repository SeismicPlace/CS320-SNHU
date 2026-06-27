package contactTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import contact.Contact;

// Test the Contact class and verify all requirements.

public class ContactTest {

    // Create a valid contact and verify all values were saved correctly.
    @Test
    void testValidContact() {

        Contact contact = new Contact(
                "12345",
                "Marlin",
                "Coral",
                "9876543210",
                "42 Wallaby Way Sydney");

        assertEquals("12345", contact.getContactId());
        assertEquals("Marlin", contact.getFirstName());
        assertEquals("Coral", contact.getLastName());
        assertEquals("9876543210", contact.getPhone());
        assertEquals("42 Wallaby Way Sydney", contact.getAddress());
    }

    // Verify that the contact ID cannot be null.
    @Test
    void testContactIdIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that the contact ID cannot be longer than 10 characters.
    @Test
    void testContactIdTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345678901", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that a contact ID of exactly 10 characters is accepted.
    @Test
    void testContactIdExactlyTenCharacters() {

        Contact contact =
                new Contact("1234567890", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertEquals("1234567890", contact.getContactId());
    }

    // Verify that the first name cannot be null.
    @Test
    void testFirstNameIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", null, "Coral", "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that the first name cannot be longer than 10 characters.
    @Test
    void testFirstNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Barracudaaa", "Coral", "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that a first name of exactly 10 characters is accepted.
    @Test
    void testFirstNameExactlyTenCharacters() {

        Contact contact =
                new Contact("12345", "1234567890", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertEquals("1234567890", contact.getFirstName());
    }

    // Verify that the last name cannot be null.
    @Test
    void testLastNameIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", null, "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that the last name cannot be longer than 10 characters.
    @Test
    void testLastNameTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", "Barracudaaa", "9876543210", "42 Wallaby Way Sydney");
        });
    }

    // Verify that a last name of exactly 10 characters is accepted.
    @Test
    void testLastNameExactlyTenCharacters() {

        Contact contact =
                new Contact("12345", "Marlin", "1234567890", "9876543210", "42 Wallaby Way Sydney");

        assertEquals("1234567890", contact.getLastName());
    }

    // Verify that the phone number cannot be null.
    @Test
    void testPhoneIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", "Coral", null, "42 Wallaby Way Sydney");
        });
    }

    // Verify that the phone number must be exactly 10 digits.
    @Test
    void testPhoneInvalidLength() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", "Coral", "12345", "42 Wallaby Way Sydney");
        });
    }

    // Verify that the phone number must contain only digits.
    @Test
    void testPhoneMustOnlyContainDigits() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", "Coral", "12345abcde", "42 Wallaby Way Sydney");
        });
    }

    // Verify that a phone number of exactly 10 digits is accepted.
    @Test
    void testPhoneExactlyTenDigits() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertEquals("9876543210", contact.getPhone());
    }

    // Verify that the address cannot be null.
    @Test
    void testAddressIsNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("12345", "Marlin", "Coral", "9876543210", null);
        });
    }

    // Verify that the address cannot be longer than 30 characters.
    @Test
    void testAddressTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345",
                    "Marlin",
                    "Coral",
                    "9876543210",
                    "P Sherman 42 Wallaby Way Sydney");
        });
    }

    // Verify that an address of exactly 30 characters is accepted.
    @Test
    void testAddressExactlyThirtyCharacters() {

        String address = "123456789012345678901234567890";

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", address);

        assertEquals(address, contact.getAddress());
    }

    // Verify that the first name cannot be updated to null.
    @Test
    void testSetFirstNameCannotBeNull() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName(null);
        });
    }

    // Verify that the first name cannot be updated to more than 10 characters.
    @Test
    void testSetFirstNameCannotBeTooLong() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setFirstName("Barracudaaa");
        });
    }

    // Verify that the last name cannot be updated to null.
    @Test
    void testSetLastNameCannotBeNull() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName(null);
        });
    }

    // Verify that the last name cannot be updated to more than 10 characters.
    @Test
    void testSetLastNameCannotBeTooLong() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setLastName("Barracudaaa");
        });
    }

    // Verify that the phone number cannot be updated to null.
    @Test
    void testSetPhoneCannotBeNull() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone(null);
        });
    }

    // Verify that the phone number cannot be updated to an invalid length.
    @Test
    void testSetPhoneCannotHaveInvalidLength() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("12345");
        });
    }

    // Verify that the phone number cannot be updated with non-digit characters.
    @Test
    void testSetPhoneMustOnlyContainDigits() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setPhone("12345abcde");
        });
    }

    // Verify that the address cannot be updated to null.
    @Test
    void testSetAddressCannotBeNull() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress(null);
        });
    }

    // Verify that the address cannot be updated to more than 30 characters.
    @Test
    void testSetAddressCannotBeTooLong() {

        Contact contact =
                new Contact("12345", "Marlin", "Coral", "9876543210", "42 Wallaby Way Sydney");

        assertThrows(IllegalArgumentException.class, () -> {
            contact.setAddress("P Sherman 42 Wallaby Way Sydney");
        });
    }
}