package 자동차만들기실습보완;

abstract class AbstractCar {
    protected String name;

    public AbstractCar(String name) {
        this.name = name;
    }

    public abstract void activateSpecialFeature();
    public abstract int calculateTotalCost(int distance);
    public abstract int calculateRefuelCount(int distance);
    public abstract int calculateTravelTime(int distance);

    public String getName() {
        return name;
    }


}
class SportsCar extends AbstractCar {
    private static final int FUEL_COST_PER_LITER = 2000;
    private static final int FUEL_EFFICIENCY = 8;
    private static final int MAX_SPEED = 250;
    private static final int TANK_SIZE = 30;
    private static final int SEATS = 2;
    private boolean turboActivated = false;

    public SportsCar(String name) {
        super(name);
    }

    @Override
    public void activateSpecialFeature() {
        turboActivated = true;
    }

    @Override
    public int calculateTravelTime(int distance) {
        int speed = turboActivated ? (int)(MAX_SPEED * 1.2) : MAX_SPEED;
        return (distance * 60) / speed;  // 분 단위 반환
    }

    @Override
    public int calculateTotalCost(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY; // 필요한 연료 계산
        return fuelNeeded * FUEL_COST_PER_LITER; // 필요한 연료에 따른 총 비용 계산
    }

    @Override
    public int calculateRefuelCount(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY; // 필요한 연료 계산
        return (int) Math.ceil((double) fuelNeeded / TANK_SIZE); // 연료탱크 크기로 나누어 주유 횟수 계산
    }
}

class Sedan extends AbstractCar {
    private static final int FUEL_COST_PER_LITER = 2000;
    private static final int FUEL_EFFICIENCY = 12; // 연비: 12km
    private static final int MAX_SPEED = 200;      // 속도: 200km
    private static final int TANK_SIZE = 45;       // 연료탱크 크기: 45 리터
    private static final int SEATS = 4;            // 좌석수: 4
    private boolean trunkToSeatActivated = false;  // 트렁크 -> 좌석 변환 기능 활성화 여부

    public Sedan(String name) {
        super(name);
    }

    @Override
    public void activateSpecialFeature() {
        trunkToSeatActivated = true;
    }

    @Override
    public int calculateTravelTime(int distance) {
        return (distance * 60) / MAX_SPEED;  // 분 단위 반환
    }

    @Override
    public int calculateTotalCost(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY;
        return fuelNeeded * FUEL_COST_PER_LITER;
    }

    @Override
    public int calculateRefuelCount(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY;
        int totalTankCapacity = TANK_SIZE + (trunkToSeatActivated ? 1 : 0); // 부가 기능 활성화 시 1리터 추가
        return (int) Math.ceil((double) fuelNeeded / totalTankCapacity);
    }
}

class Bus extends AbstractCar {
    private static final int FUEL_COST_PER_LITER = 2000;
    private static final int FUEL_EFFICIENCY = 5;   // 연비: 5km
    private static final int MAX_SPEED = 150;       // 속도: 150km
    private static final int TANK_SIZE = 100;       // 연료탱크 크기: 100 리터
    private static final int SEATS = 20;            // 좌석수: 20
    private boolean auxiliaryTankActivated = false; // 보조 연료탱크 활성화 여부

    public Bus(String name) {
        super(name);
    }

    @Override
    public void activateSpecialFeature() {
        auxiliaryTankActivated = true;
    }

    @Override
    public int calculateTravelTime(int distance) {
        return (distance * 60) / MAX_SPEED;  // 분 단위 반환
    }

    @Override
    public int calculateTotalCost(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY;
        return fuelNeeded * FUEL_COST_PER_LITER;
    }

    @Override
    public int calculateRefuelCount(int distance) {
        int fuelNeeded = distance / FUEL_EFFICIENCY;
        int totalTankCapacity = TANK_SIZE + (auxiliaryTankActivated ? 30 : 0); // 부가 기능 활성화 시 30리터 추가
        return (int) Math.ceil((double) fuelNeeded / totalTankCapacity);
    }
}



