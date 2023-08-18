package 브루마블;

public class RandomGame {
    public static void main(String[] args) {
        int rand1, rand2;
        int cnt = 0; // 몇번안에 타룿ㄹ 했는지 숫자 세기
        while (true) {
            cnt ++;
            rand1 = (int) ((Math.random() * 6) + 1); //
            rand2 = (int) ((Math.random() * 6) + 1);
            if((rand1 + rand2) == 12) {
                System.out.printf("%d번 만에 탈출함. \n", cnt);
                break;
            } else {
                System.out.println("주사위의 합이 " + (rand1 + rand2) + "이다.");
            }
        }
    }
}
