import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scan = new Scanner(System.in);

        int numInput = scan.nextInt();
        int shipped = 0;
        int rejects = 0;
        int fixed = 0;

        for (int i = 0; i <= numInput; i++) {

            boolean userInput = scan.hasNextInt();

            if(userInput) {
                int otherInput = scan.nextInt();

                if (otherInput == 0) {
                    shipped++;
                } else if (otherInput == -1) {
                    rejects++;
                } else {
                    fixed++;
                }
            }
        }

        System.out.print(shipped + " " + fixed + " " + rejects);
    }
}