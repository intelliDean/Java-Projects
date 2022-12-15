package truecaller_project.services;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import truecaller_project.data.models.Phonebook;
import truecaller_project.dtos.request.PhonebookRequest;

import static org.junit.jupiter.api.Assertions.*;

class PhonebookServicesImplTest {
    PhonebookServices phonebookServices;
    @BeforeEach
    void setUp() {
        phonebookServices = new PhonebookServicesImpl();
    }
    @Test
    void registerPhonebook() {
        PhonebookRequest phonebookRequest = new PhonebookRequest();
        phonebookRequest.setOwnersName("Dean");
        phonebookRequest.setOwnersPhoneNumber("1234");
        phonebookServices.register(phonebookRequest);


    }

}