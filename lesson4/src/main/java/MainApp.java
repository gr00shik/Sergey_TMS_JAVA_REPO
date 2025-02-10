import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please user enter the first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Please user enter the second number: ");
        int number2 = scanner.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = number1; i <= number2; i++) {

            sum = sum + i;
            System.out.println("Sum: "  +   sum);
            count++;
            System.out.println("Count: " + count);

        }

        System.out.println(sum/count);


    }

}
