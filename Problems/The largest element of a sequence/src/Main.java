import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);
        int max = 0;

        while (true) {
            int inputNum = scanner.nextInt();

            if (inputNum == 0) {
                break;
            }

            if (inputNum > max) {
                max = inputNum;
            }
        }

        System.out.println(max);

    }
}