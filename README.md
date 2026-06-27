# CS-320 Portfolio Artifact

## Project Overview

This repository contains artifacts from my Software Test, Automation, and Quality Assurance course at Southern New Hampshire University. The project demonstrates object-oriented design, unit testing with JUnit 5, and the use of automated testing to validate software requirements.

### Repository Contents

- `Contact.java` - Contact data model with input validation
- `ContactService.java` - Service class for managing contacts
- `ContactTest.java` - Unit tests for the Contact class
- `ContactServiceTest.java` - Unit tests for the ContactService class
- `SNHU CS-320 - Module 7 - Project Two - Summary and Reflection.pdf` - Reflection on software testing techniques and project outcomes

## Reflection

### How can I ensure that my code, program, or software is functional and secure?

I begin by translating each software requirement into code and then verifying those requirements with automated unit tests. Throughout this project I used JUnit to test valid inputs, invalid inputs, boundary conditions, and expected exceptions. Running the test suite after every change helped confirm that existing functionality continued to work while new changes were introduced. Security also starts with validation. Every class validates incoming data before it is stored, reducing the chance that invalid or unexpected values enter the application.

### How do I interpret user needs and incorporate them into a program?

I start by identifying what the user or customer actually requires instead of immediately writing code. Each requirement becomes a design decision or validation rule. For example, contact IDs have length limits, phone numbers must contain exactly ten digits, and required fields cannot be null. After implementing those requirements, I create tests that verify each one behaves as expected. This helps ensure the final program matches the customer's expectations instead of assumptions made during development.

### How do I approach designing software?

I prefer to build software one component at a time. I begin with the project requirements, divide the application into smaller classes with clear responsibilities, and implement the simplest solution that satisfies the requirements. As each component is completed, I write automated tests before moving to the next feature. This approach makes debugging easier, supports future maintenance, and provides confidence that changes do not unintentionally introduce new defects. This course reinforced that designing software is not just about writing code, but also about creating reliable tests that continue to verify the software throughout its development.
