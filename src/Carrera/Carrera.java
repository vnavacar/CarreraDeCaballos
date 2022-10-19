package Carrera;
import java.util.Scanner;

public class Carrera {
    private static int numeroCaballos;
    private static manejadorHilo hilos[];
    private static int tiempos[];
    private static int ganador = 0;

    public static void lanzador() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de caballos");
        numeroCaballos = sc.nextInt();
        System.out.println("El numero de caballos es: " + numeroCaballos);
        
        hilos = new manejadorHilo[numeroCaballos];

        for(int i = 0; i < numeroCaballos; i++) {
            hilos[i] = new manejadorHilo(i);
            hilos[i].start();
        }
        System.out.println("Carrera lista para comenzar, da el pistoletazo de salida con ENTER");
        sc.nextLine();
        sc.nextLine();
        sc.close();
        for(int i = 0; i < numeroCaballos; i++) {
            //hilos[i].start();
            //hilos[i].run();
        }
        for(int i = 0; i < numeroCaballos; i++) {
            
            try {
                while(hilos[i].isAlive()){
                    Thread.sleep(100);
                }
                hilos[i].join();
                //tiempos[i]=hilos[i].getTiempo();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        /* 
        for (int i = 0; i < numeroCaballos; i++) {
            System.out.println("El caballo " + i + " ha llegado en " + tiempos[i] + " milisegundos");
            if(tiempos[i]<tiempos[ganador]) {
                ganador = i;
            }
        }
        System.out.println("El ganador fue el caballo " + ganador); */
        



    }

}
