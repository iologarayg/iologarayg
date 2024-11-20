import java.util.Scanner;

public class Ejercicio_1 {
    public static void main(String[] args) {
        System.out.println(signo(-7.8));
    }
    public static int signo(double num){
        if (num > 0){
            return 1;
        } else if (num < 0) {
            return -1;
        }else {
            return 0;
        }
    }
}
