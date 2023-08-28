package 자동차만들기실습;

public class SportsCar extends CarTypes {
    boolean isTurboOn;
    int distance;
    double requiredFuel;

    public SportsCar(String name) {
        super(name, 250, 8, 30, 2);
    }

    @Override
    public void activateSpecialFeature() {
        if (!isTurboOn) {
            isTurboOn = true;
            this.speed *= 1.2; // 속도를 1.2배로 증가

        }
    }

    public int calculateTotalCost(int distance) {
        requiredFuel = distance / this.efficiency;
        int cost = (int) (requiredFuel * 2000);

        return cost;
    }

    public int calculateRefuelCount(int distance) {
        requiredFuel = distance / this.efficiency;
        int refuelCount = (int) Math.ceil(requiredFuel / this.fuelTankSize);

        return refuelCount;
    }

    public String calculateTravelTime(int distance) {
        int totalTime = (int) (distance / this.speed * 60); // 분으로 변환
        int hours = totalTime / 60;
        int minutes = totalTime % 60;
        String time = hours + "시간 " + minutes + "분";
        return time;
    }
}
