package contact;

// This class stores contact information and validates the data
// based on the project requirements.

public class Contact {

    // The contact ID cannot be changed after the contact is created.
    private final String contactId;

    // Contact information that can be updated after validation.
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    public Contact(String contactId, String firstName, String lastName,
                   String phone, String address) {

        // Validate the contact ID.
        if (contactId == null || contactId.length() > 10) {
            throw new IllegalArgumentException("Invalid contact ID");
        }

        // Validate the first name.
        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        // Validate the last name.
        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        // Phone number must be exactly 10 digits.
        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        // Address cannot be null or longer than 30 characters.
        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.address = address;
    }

    // Return the contact ID.
    public String getContactId() {
        return contactId;
    }

    // Return the first name.
    public String getFirstName() {
        return firstName;
    }

    // Update the first name after validation.
    public void setFirstName(String firstName) {

        if (firstName == null || firstName.length() > 10) {
            throw new IllegalArgumentException("Invalid first name");
        }

        this.firstName = firstName;
    }

    // Return the last name.
    public String getLastName() {
        return lastName;
    }

    // Update the last name after validation.
    public void setLastName(String lastName) {

        if (lastName == null || lastName.length() > 10) {
            throw new IllegalArgumentException("Invalid last name");
        }

        this.lastName = lastName;
    }

    // Return the phone number.
    public String getPhone() {
        return phone;
    }

    // Update the phone number after validation.
    public void setPhone(String phone) {

        if (phone == null || phone.length() != 10 || !phone.matches("\\d+")) {
            throw new IllegalArgumentException("Invalid phone number");
        }

        this.phone = phone;
    }

    // Return the address.
    public String getAddress() {
        return address;
    }

    // Update the address after validation.
    public void setAddress(String address) {

        if (address == null || address.length() > 30) {
            throw new IllegalArgumentException("Invalid address");
        }

        this.address = address;
    }
}