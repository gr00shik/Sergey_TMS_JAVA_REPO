import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("PLEASE USER ENTER THE FIRST NUMBER: ");
        int number1 = scanner.nextInt();
        System.out.println("PLEASE USER ENTER THE SECOND NUMBER: ");
        int number2 = scanner.nextInt();

        int sum = 0;
        int count = 0;

        while (number1 <= number2) {
            sum += number1;
            System.out.println("Sum: "  +   sum);
            count++;
            System.out.println("Count: " + count);
            number1++;
        }

        System.out.println(sum/count);

    }

}
