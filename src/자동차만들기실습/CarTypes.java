package 자동차만들기실습;



public abstract class CarTypes {

     String name;
     int speed;
     int efficiency;
     int fuelTankSize;
     int seatCount;

    public CarTypes(String name, int speed, int efficiency, int fuelTankSize, int seatCount) {
        this.name = name;
        this.speed = speed;
        this.efficiency = efficiency;
        this.fuelTankSize = fuelTankSize;
        this.seatCount = seatCount;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    public int getFuelEfficiency() {
        return efficiency;
    }

    public void setFuelEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }


    public int getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(int fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }


    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }


    public abstract void activateSpecialFeature();

}


