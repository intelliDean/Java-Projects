package CHAPTER_7.SchoolAdmin;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SchoolAdminTest {
private int[][] scores = {{98, 79, 77,95, 84},{83, 89, 74, 91, 90}};
private SchoolAdmin admin;

@BeforeEach
    void setUp(){
    admin = new SchoolAdmin(scores);
}
 @Test
 void getScore() {
     for (int i = 0; i < admin.getNativeScores().length; i++) {
         admin.calculateAverage();
     }
 }
}