package Carrera;
import java.util.Random;

public class manejadorHilo extends Thread{
    private int numeroHilo;
    private final int meta = 100;
    private int tiempo = 0;


    public manejadorHilo(int numeroHilo) {
        this.numeroHilo = numeroHilo;
    }

    public void run() {
        Random r = new Random();
        int distancia = 0;
        tiempo = 0;
        int temp = 0;
        while (distancia < meta) {
            distancia += 1;
            //System.out.println("El caballo " + numeroHilo + " ha recorrido " + distancia + " metros");
            try {
                temp = r.nextInt((41) + 10);

                Thread.sleep(temp);//duerme entre 10 y 50 milisegundos
                tiempo += temp;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("El caballo " + numeroHilo + " ha llegado a la meta en " + tiempo + " milisegundos");
    }
    public int getTiempo() {
        return tiempo;
    }
}