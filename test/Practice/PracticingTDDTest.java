//package Practice;
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//class PracticingTDDTest {
//    PracticingTDD tdd;
//
//    @BeforeEach
//    void beforeAllTest() {
//        tdd = new PracticingTDD();
//    }
//    @Test
//    void toSaveName() {
//        tdd.setName("Dean");
//        assertEquals("Dean", tdd.getName());
//    }
//    @Test
//    void toSaveAge() {
//        tdd.setAge(23);
//        assertEquals(23, tdd.getAge());
//    }
//    @Test
//    void toTestThatEveryObjectInstantiatedHasUniqueNumber() {
//        assertEquals(1, tdd.getStudentID());
//    }
//    @Test
//    void toInitialiseWithConstruction() {
//        tdd = new PracticingTDD();
//        assertEquals("Michael Dean", tdd.getName());
//        assertEquals(20, tdd.getAge());
//    }
//    @Test
//    void toChangeName() {
//        tdd.setName("Sule");
//        assertEquals("Sule", tdd.getName());
//    }
//    @Test
//    void toResetAge() {
//        tdd.setAge(12);
//        assertEquals(12, tdd.getAge());
//    }
//    @Test
//    void toTetThatObjectExist() {
//        assertNotNull(tdd = new PracticingTDD());
//    }
//    @Test
//    void toAddPhoneNumber() {
//        tdd.setPhoneNumber("08095729090");
//        assertEquals("08095729090", tdd.getPhoneNumber());
//    }
//    @Test
//    void toAddAgeArrays() {
//        tdd.addAgeArrays(new int[]{1,2,3,4,5});
//    }
//
//
//
//}