import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        System.out.print(inputNum + " ");

        while (inputNum != 1) {
            if (inputNum % 2 == 0) {
                inputNum = inputNum / 2;
                System.out.print(inputNum + " ");
            } else {
                inputNum = (inputNum * 3) + 1;
                System.out.print(inputNum + " ");
            }
        }
    }
}