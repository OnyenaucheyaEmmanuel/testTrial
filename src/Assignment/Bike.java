package Assignment;

public class Bike {


    private boolean isOn;
    private boolean isOff;
    private int gear;

    private int speed;

    public Bike() {
    }



    public boolean switchOn() {
        isOn = true;
        return isOn;
    }

    public boolean switchOff() {
        isOn = false;
        return isOn;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int accelerateBike() {
        if (gear == 1)
            speed = speed + 1;
        if (gear == 2)
            speed = speed + 3;
        if (gear == 3)
            speed = speed + 4;
        return speed;

    }

    public int deccelerateBike() {
        if (gear == 1)
            speed = speed - 1;
        if (gear == 2)
            speed = speed - 2;
        if (gear == 3)
            speed = speed - 3;
        if (gear == 4)
            speed = speed - 4;
        return speed;
    }


    public float checkGearChange() {
        if (speed >= 0 && speed <= 20)
            this.gear = 1;
        if (speed >= 21 && speed <= 30)
            this.gear = 2;
        if (speed >= 31 && speed <= 40)
            this.gear = 3;
        if (speed >= 41)
            this.gear = 4;
        return gear;
    }

}
