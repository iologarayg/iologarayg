import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dime un numero ");
        int num= sc.nextInt();
        int contador=0;
        while (contador<=10){
            //int result=contador*num;
            System.out.println(num+"x"+contador+"="+(num*contador));
            contador++;
        }
    }
}
