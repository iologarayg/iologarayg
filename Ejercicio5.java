import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dime un numero ");
        int num= sc.nextInt();
        System.out.print("Dime una letra ");
        String letra=sc.next();
        for (int i = num; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print(letra);
            }
            System.out.println();
        }
    }
}
