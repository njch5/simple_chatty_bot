import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int val;
        int count = 0;
        do {
            val = scan.nextInt();
            count++;
        } while (val != 0);
        System.out.println(count - 1);
    }
}