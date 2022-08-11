package UtmeTest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtmeDrill {

@Test
    public void fourCopies(){
    Drill utme = new Drill();
    assertEquals(8000,utme.pricePerCopy(4));
   }

@Test
    public void fiveCopies() {
    Drill utme = new Drill();
    assertEquals(10800, utme.pricePerCopy(6));
}

 @Test
    public void tenCopies() {
    Drill utme = new Drill();
    assertEquals(22400, utme.pricePerCopy(14));
 }
 @Test
    public void thirtycopies(){
    Drill utme = new Drill();
    assertEquals(52500,utme.pricePerCopy(35));
 }
 @Test
    public void fiftyCopies(){
    Drill utme = new Drill();
    assertEquals(91000,utme.pricePerCopy(70));
 }
    @Test
    public void hundredCopies(){
        Drill utme = new Drill();
        assertEquals(216000,utme.pricePerCopy(180));
    }
    @Test
    public void twoHundredCopies(){
        Drill utme = new Drill();
        assertEquals(220000,utme.pricePerCopy(200));
    }
    @Test
    public void fiveHundredCopies(){
        Drill utme = new Drill();
        assertEquals(500000,utme.pricePerCopy(500));
    }











}
