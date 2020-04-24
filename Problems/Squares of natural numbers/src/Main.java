import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        int i = 1;

        while (i * i <= userInput) {
            String formatted = String.format("%d", i * i);
            System.out.println(formatted);
            i ++;
        }
    }
}