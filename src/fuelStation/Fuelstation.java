package fuelStation;

public class Fuelstation{
        private static int litrePresent;
        private static int finalPrice = 200;
        private static int amount;
        private static double discountPrice;


        public Fuelstation(int litre){
            this.litrePresent = litre;
        }

        public static void calcDiscount() {
            amount = finalPrice * litrePresent;
            discountPrice = amount - (amount * 0.02);
        }

        public static double getDiscountPrice(){
            return discountPrice;
        }
    }


