/*package assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class DiceGameTest {
    @Test
    public void setNameTest(){
        DiceGame craps = new DiceGame();
        String John = new String();
        craps.setName(John);
        String name = craps.getName();
        assertEquals(John, craps.getName());
    }
    @Test
    public void setAgeTest() {
        DiceGame craps = new DiceGame();
        craps.setAge(25);
        assertEquals(25, craps.getAge());
    }
    @Test
    public void setMinimumAgeTest(){
        // Setting minimum age to 18
        DiceGame craps = new DiceGame();
        craps.setAge(14);
        assertEquals(0, craps.getAge());
        craps.setAge(18);
        assertEquals(18, craps.getAge());
    }
    @Test
    public void depositMoneyTest(){
        DiceGame craps = new DiceGame();
        craps.deposit(1000);
        assertEquals(1000, craps.getBalance());
        craps.deposit(500);
        assertEquals(1500, craps.getBalance());
    }
    @Test
    public void minimumDepositAmountTest() {
        // setting minimum deposit-able amount to 200
        DiceGame craps = new DiceGame();
        craps.deposit(100);
        assertEquals(0, craps.getBalance());
        craps.deposit(200);
        assertEquals(200, craps.getBalance());
    }
    @Test
    public void withdrawMoneyTest(){
        DiceGame craps = new DiceGame();
        craps.deposit(2000);
        assertEquals(2000, craps.getBalance());
        craps.withdraw(1500);
        assertEquals(500, craps.getBalance());
        // Minimum Balance to make withdrawal is 1000
        craps.withdraw(300);
        assertEquals(500, craps.getBalance());
    }

    @Test
    public void minimumBalanceAfterWithdrawalTest(){
        // Setting minimum balance after withdrawal to 200
        DiceGame craps = new DiceGame();
        craps.deposit(1000);
        assertEquals(1000, craps.getBalance());
        craps.withdraw(1000);
        assertEquals(1000, craps.getBalance());
        craps.withdraw(800);
        assertEquals(200, craps.getBalance());
    }
}*/