import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int numInput = scanner.nextInt();

        boolean result = numInput < 10;
        System.out.println(result);
    }
}