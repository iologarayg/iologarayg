import java.util.Scanner;

public class Ejercicio13 {
    public static void fibonacci(int MAX) {
        int firstNumber = 0;
        int secondNumber = 1;
        int fibonacci = '\0';

        System.out.print(firstNumber + " ");
        System.out.print(secondNumber + " ");

        for (int i = 2; i < MAX; i++) {

            fibonacci = firstNumber + secondNumber;
            System.out.print(fibonacci + " ");

            firstNumber = secondNumber;
            secondNumber = fibonacci;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dime un numero");
        int MAX= sc.nextInt();
        fibonacci(MAX);

    }
}
