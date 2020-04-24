import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int inputNum = scan.nextInt();
        int count = 0; //Idea is to create a counter, and to increment it each time of printing

        for (int i = 0; i <= inputNum; i++) { //Loops inputNum times
            for (int j = 0; j < i; j++) { //Loops i times
                if (count < inputNum) {
                    System.out.print(" "+i+" ");
                    count++; //Prints 1 one time, 2 two times, etc. stops if reached inputNum number
                }
            }
        }
    }
}