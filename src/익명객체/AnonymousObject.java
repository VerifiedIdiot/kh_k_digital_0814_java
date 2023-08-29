package 익명객체;

public class AnonymousObject {
    public static void main(String[] args) {
        // 필요한 코드를 여기에 추가하세요.
    }
}

class Parent {
    String name = "Parent Class";

    void methodParent() {
        System.out.println("Parent method : " + this.name);
    }
}

class A {
    Parent field = new Parent() { // 익명의 자식 클래스 생성
        int childField;

        void methodChild() {
            // 자식 클래스에 특화된 메서드를 여기에 구현하세요.
        }

        @Override
        void methodParent() {
            // Parent 클래스의 methodParent를 오버라이드하려면 여기에 구현하세요.
        }
    };
}