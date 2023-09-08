package 두수비교하기;


import java.util.Scanner;

public class TwoDifferentNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] inputs = sc.nextLine().split(",");
        int A = Integer.parseInt(inputs[0]);
        int B = Integer.parseInt(inputs[1]);

        if (A > B) {
            System.out.println(">");
        } else if (A < B) {
            System.out.println("<");
        } else {
            System.out.println("==");
        }

    }
}
