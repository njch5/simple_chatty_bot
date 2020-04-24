import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        boolean ordered = true;

        int num = scanner.nextInt();
        int prevNum = num;
        int flag = num;
        num = scanner.nextInt();
        if (num < prevNum) {
            while (num != 0) {
                if (num <= prevNum && num <= flag) {
                    flag = prevNum;
                    prevNum = num;
                } else {
                    ordered = false;
                }
                num = scanner.nextInt();
            }
        } else {
            while (num != 0) {
                if (num >= prevNum && num >= flag) {
                    flag = prevNum;
                    prevNum = num;
                } else {
                    ordered = false;
                }
                num = scanner.nextInt();
            }
        }
        System.out.println(ordered);
    }
}