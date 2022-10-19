package Carrera;
import java.util.Scanner;

public class Carrera {
    private static int numeroCaballos;
    private static manejadorHilo hilos[];

    public static void lanzador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de caballos");
        numeroCaballos = sc.nextInt();
        System.out.println("El numero de caballos es: " + numeroCaballos);
        

        for(int i = 0; i < numeroCaballos; i++) {
            hilos[i] = new manejadorHilo(i);
            hilos[i].start();
        }
        System.out.println("Carrera lista para comenzar, da el pistoletazo de salida con enter");
        sc.nextLine();
        sc.nextLine();
        for(int i = 0; i < numeroCaballos; i++) {
            hilos[i].correr();
        }
        for(int i = 0; i < numeroCaballos; i++) {
            try {
                hilos[i].join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        

    }

}
