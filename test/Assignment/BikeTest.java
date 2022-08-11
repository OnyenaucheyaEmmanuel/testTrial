package Assignment;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    @Test
    void switchOn() {
        //given that
        Bike bajaj = new Bike();
        //when
        boolean switchOn = bajaj.switchOn();
        //check
        assertTrue(switchOn);
    }


    @Test
    void switchOff() {
        //given that
        Bike bajaj = new Bike();
        //when
        boolean switchOff = bajaj.switchOff();
        //check

        assertFalse(switchOff);

    }


    @Test
    @DisplayName("accelerationBike")
    void accelerationBike(){
        //given
        Bike bajaj = new Bike();
        bajaj.setGear(1);
        bajaj.setSpeed(12);
        //when
      int BikeAcceleration = bajaj.accelerateBike();
      //check
        assertEquals( 13, BikeAcceleration);
    }

   @Test
   @DisplayName("deccelarateBike")
    void deccelerateBike(){
           //given
           Bike bajaj = new Bike();
           bajaj.setGear(2);
           bajaj.setSpeed(32);
           //when
           int BikeAcceleration = bajaj.deccelerateBike();
           //check
           assertEquals( 30, BikeAcceleration);

   }

   @Test
   @DisplayName("autochangeGear")
   void autochangeGear (){
        //given
        Bike bajaj = new Bike();
        bajaj.setSpeed(38);
        bajaj.setGear(3);
        bajaj.accelerateBike();


        //when
       //bajaj.checkGearChange()
       //check
       assertEquals(4,bajaj.checkGearChange());
   }




}
