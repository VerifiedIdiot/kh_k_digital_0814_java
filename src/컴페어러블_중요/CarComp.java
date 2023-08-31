package 컴페어러블_중요;

public class CarComp implements Comparable<CarComp> {
    public String modelName;
    public int modelYear;
    public String color;

    public CarComp(String modelName, int modelYear, String color) {
        this.modelName = modelName;
        this.modelYear = modelYear;
        this.color = color;
    }

    @Override
    // 반환값이 1 이면 정렬하는 조건
    // 반환값이 -1 이면 정렬하지않아도됨
    // 반환값이 0 이면 정렬 조건은 아니지만 set을 사용하는 경우 중복 제거 조건이 됨
    public int compareTo(CarComp o) {
        if (this.modelYear > o.modelYear) return 1; // 연식으로 오름차순 정렬
        else {
            if (this.modelYear == o.modelYear) {
                return this.modelName.compareTo(o.modelName); // 사전 순 정렬
            }
        }
        return -1;
    }
}
