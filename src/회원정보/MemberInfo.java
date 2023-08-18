package 회원정보;
// 이름 : 문자열
// 나이 : 정수, 나이는 1 ~ 199를 정상 입력으로 간주하고 이외의 값이 오면 재 입력 요구
// 성별 : 문자 'M'과 'F' 입력 받고 출력은 "남성"과 "여성"으로 출력
// 직업 : 정수로 입력 (1. 학생, 2. 회사원, 3.주부, 4. 무직)
// 결과는 한번에 출력

import java.util.Scanner;

public class MemberInfo {
    String name; // 인스턴스 필드
    int age;
    char gender;
    int jobs;
    Scanner sc = new Scanner(System.in);

    public void setName() {
        System.out.print("이름을 입력 하세요 : ");
        name = sc.nextLine();

    }

    public void setAge() {
        while (true) {
            System.out.print("나이를 입력 하세요 : ");
            age = sc.nextInt();
            if(age > 0 && age < 200)
                break;
                //return; 리턴은 호출한 위치로 리턴값을 가지고 돌아감
            System.out.println("나이를 잘못 입력함");
        }
    }

    public void setGender() {
        while (true) {
            System.out.print("성별을 입력하세요 : ");

            gender = sc.next().charAt(0); // 문자열에서 맨 앞[0] 문자 추출
            switch (gender) {
                case 'M' :
                case 'm' :
                case 'F' :
                case 'f' :

                    break;

                default:
                    System.out.println("성별을 잘 못 입력 하셨습니다.");
                    continue;
            }
                break;
        }
    }
    public void setJobs() {
        while (true) {
            System.out.print("직업을 입력하세요 : ");

            jobs = sc.nextInt();

            if (jobs > 0 && jobs < 5)
                break;
            System.out.print("직업을 다시 입력하세요");
        }
    }
    public  int getGenderType() {
    if(gender == 'M' || gender == 'm')
        return 1;
        else
            return 2;
    }

    public void getInfo() {
        String[] str_gender = {"", "남성" , "여성"};
        String[] str_jobs = {"", "학생" , "회사원" , "주부" , "무직"};

        System.out.println("=".repeat(5) + "회원 정보" + "=".repeat(5));
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
        System.out.println("성별 : " + str_gender[getGenderType()]);
        System.out.println("직업 : " + str_jobs[jobs]);
        System.out.println();
    }
}
