import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scan = new Scanner(System.in);

        long a = scan.nextInt();
        long b = scan.nextInt();

        long product = 1;

        for (long i = a; i < b; i++) {
            product *= i;
        }
        System.out.println(product);
    }
}