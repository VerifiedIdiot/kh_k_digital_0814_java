package 열거타입2;

enum DevType {
    MOBILE ,FRONTEND ,BACKEND ,DBA, BIGDATA
}

enum Career {
    JUNIOR, SENIOR
}

enum Gender {
    MALE, FEMALE
}
public class Developer {
    private String name;
    private DevType type; // 개발 분야
    private Career career;
    private Gender gender;

    public Developer(String name, DevType type, Career career, Gender gender) {
        this.name = name;
        this.type = type;
        this.career = career;
        this.gender = gender;
    }
        public void devInfo() {
            System.out.println("이름 : " + name);
            System.out.println("업무 : " + type);
            System.out.println("경력 : " + career);
            System.out.println("성별 : " + gender);
        }


    }


