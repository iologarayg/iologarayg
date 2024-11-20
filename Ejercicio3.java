import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime un numero");
        int num= sc.nextInt();
        System.out.println("Dime a que numero quieres elevarlo");
        int num2=sc.nextInt();
        int contador=1;
        int resultado=num;
        while (contador<num2){
            resultado = resultado*num;
            contador++;
        }
        System.out.println(resultado);
    }
}
