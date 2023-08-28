package 다운캐스팅;

import java.util.ArrayList;
import java.util.List;

//상위클래스형으로 변환 되었던 하위 클래스를 다시 원래 자료형으로 변환하는 것을 다운캐스팅이라고 함.
public class DownCasting {
    List<Animal> animalList = new ArrayList<>();
    public static void main(String[] args) {
        DownCasting downCasting = new DownCasting();
    }
    public void addAnimal() {
        animalList.add(new Animal());
        animalList.add(new Tiger());
        animalList.add(new Eagle());
        animalList.add(new Humanz());
        for (Animal animal : animalList){
            animal.move();
        }
    }
    public void testCasting() {
        for (int i = 0; i < animalList.size(); i++) {
            Animal animal = animalList.get(i);
            if(animal instanceof Humanz ) { // Human형으로 다운캐스팅 되는지 확인
                Humanz h = (Humanz) animal;
                h.interesting(); // 원래 자신의 클래스에 대한 참조 변수 이기 때문에 접근 가능 함
            } else if(animal instanceof Tiger) {
                Tiger t = (Tiger) animal;
                t.hunting();
            } else if(animal instanceof Eagle) {
                Eagle e = (Eagle) animal;
                e.flying();
            } else {
                System.out.println("이런걸 누가써");

            }
        }
    }
}
