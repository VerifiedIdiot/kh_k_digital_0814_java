package 자동차만들기실습;

public class Bus extends CarTypes {
    boolean isTankExpended;
    double requiredFuel;
    int distance;
    public Bus(String name) {
        super(name, 150, 5, 100, 20);

    }

    @Override
    public void activateSpecialFeature() {
        if(!isTankExpended) {
            isTankExpended = true;
            this.fuelTankSize += 30;
            System.out.println("연료탱크의 사이즈가 증가했습니다.");

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


