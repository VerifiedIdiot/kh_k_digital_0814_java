package 슈퍼메소드;

import 매개변수의다형성1.Product;

// super : 부모의 필드나 메소드를 접근할 때 사용
// super() : 부모의 생성자를 호출
public class SuperMethod {
    public static void main(String[] args) {
        Child child = new Child();
       // child.childMethod();
        child.display();
    }
}


class Parent {
    int x = 10;
    int a;
    int d;
    Parent() {a = 10;}
    Parent(int n) {a = n;}
}


//class Child extends Parent {
//    int x = 20;
//    void childMethod() {
//        System.out.println("x : " + x); // 자식 필드 접근
//        System.out.println("x : " + this.x); // 원래 this는 default로 붙어 있음 , 매개변수로 인해서 구분이안될때 사용
//        System.out.println("x : " + super.x); // 부모의 필드 접근
//        }
//
//
//    }


class Child extends Parent {
        int b;

        Child() {
            super(100);
            b = 20;
        }
        void display() {
            System.out.println(a);
            System.out.println(b);

        }


      }
