import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        int a = Integer.MAX_VALUE;
        if((x> -15 && x<=12) || (x>14 && x<17) || (x>= 19 && x<=a) ){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}