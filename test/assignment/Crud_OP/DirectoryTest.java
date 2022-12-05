package assignment.Crud_OP;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DirectoryTest {
    Directory directory;

    @BeforeEach
    void setUp() {
        directory = new Directory();
    }
    @Test
    void directoryExist() {
        assertNotNull(directory);
    }
    @Test
    void contactExistsInDirectory() {
        Contact contact = new Contact("Dean", "Michael", "08095729090");
        directory.addContact(contact);
        assertEquals(1, directory.contactSize());
    }
    @Test
    void addressExistInDirectory() {
        Address address = new Address();
        Contact contact = new Contact("Dean", "Michael", address, "08095729090", "@email");
        directory.addContact(contact);
        assertNotNull(directory.getContactById(1).getAddress());
    }
}