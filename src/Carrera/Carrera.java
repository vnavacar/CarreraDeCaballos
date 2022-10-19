package Carrera;
import java.util.Scanner;

public class Carrera {
    private static int numeroCaballos;

    public static void lanzador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de caballos");
        numeroCaballos = sc.nextInt();
        System.out.println("El numero de caballos es: " + numeroCaballos);
    }

}
