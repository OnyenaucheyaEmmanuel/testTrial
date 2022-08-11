package tddclass;

import fuelStation.Fuelstation;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FuelstationTest {

        @Test
        @DisplayName("Discount on fuel price")
        public void oilGas(){
             Fuelstation fuelstation = new Fuelstation(2);
            fuelstation.calcDiscount();
            assertEquals(392.0, fuelstation.getDiscountPrice());
        }

    }


