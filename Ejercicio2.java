import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num= sc.nextInt();
        System.out.println("Dime otro numero");
        int num1= sc.nextInt();
        if (num==num1){
            System.out.println(num+" y "+num1+" son iguales");
        } else if (num>num1) {
            System.out.println("El numero mayor es "+num);
        } else if (num1>num) {
            System.out.println("El numero mayor es "+num1);
        }
    }
}
