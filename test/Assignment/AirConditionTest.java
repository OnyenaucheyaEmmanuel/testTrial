/*package Assignment;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirConditionTest {

    @Test
    void turnOn(){
        AirCondition sonny = new AirCondition();
        sonny.turnOn(true);
        assertTrue(sonny.getIsOn());
    }
    @Test
    void turnOff() {
        AirCondition sonny = new AirCondition();
        sonny.turnOff(true);
        assertTrue(sonny.getIsOff());
    }

    @Test
    void increaseTemperature() {
        AirCondition sonny = new AirCondition();
         sonny.increaseTemperature(16);
        assertEquals(17,sonny.getTemperature());
    }
    @Test
        void decreaseTemperature() {
            //given that
            AirCondition sonny = new AirCondition();
            sonny.setTemperature(18);
            //when
            int answer = sonny.decreaseTemperature();
            //check that
            assertEquals(19, answer);
        }

    @Test
      void increaseTemperaturebelow16(){
        //given that
        AirCondition sonny = new AirCondition();
        sonny.setTemperature(15);
        //when
        int answer = sonny.decreaseTemperature();
        // check that
        assertEquals(16, answer);
    }
    @Test
    void decreaseTemperatureAbove30() {
        //given that
        AirCondition sonny = new AirCondition();
        sonny.setTemperature(32);
        //when
        int answer = sonny.decreaseTemperature();
        // check that
        assertEquals(30, answer);
    }

}
*/