package ie.gmit;
//Evan Garvey
//G00322695
//In class exam (The Employee Class). Testing if there is incorrect data being inputted.
//09/03/20

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class EmployeeTest {

    @BeforeEach
    void setup() {
        Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
    }

    @Test
    void testConstructorNoTitle() {
        // Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
        assertThrows(IllegalArgumentException.class, () -> new Employee("", "Evan Garvey", "12345678", "0123456789", "Full-Time", "23"));
    }

    @Test
    void testConstructorNoName() {
        // Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
        assertThrows(IllegalArgumentException.class, () -> new Employee("MR", "", "12345678", "0123456789", "Full-Time", "23"));
    }

    @Test
    void testConstructorNoPPS() {
        // Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
        assertThrows(IllegalArgumentException.class, () -> new Employee("MR", "Evan Garvey", "", "0123456789", "Full-Time", "23"));
    }
    @Test
    void testConstructorNoPhone() {
        // Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
        assertThrows(IllegalArgumentException.class, () -> new Employee("MR", "Evan Garvey", "12345678", "", "Full-Time", "23"));
    }
    @Test
    void testConstructorNoEmployType() {
        // Employee myEmployee = new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", "23");
        assertThrows(IllegalArgumentException.class, () -> new Employee("MR", "Evan Garvey", "12345678", "0123456789", "", "23"));
    }
    @Test
    void testConstructorNoAge() {
        assertThrows(IllegalArgumentException.class, () -> new Employee("MR", "Evan Garvey", "12345678", "0123456789", "Full-time", ""));
    }
}



