import java.util.Scanner;

public class Ejercicio14 {
    static void suma(int num){
        if (num>0){

        }
        int resto=num%100;
        int resto1=num/100;
        // Bien System.out.println(resto1);
        int resto2=resto1%10;
        //Bien System.out.println(resto2);
        int resto3=num/10;
        System.out.println(resto3);
        System.out.println(resto+resto1+resto2+resto3);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Dime un numero");
        int num=sc.nextInt();
        suma(num);
    }
}
