package Carrera;

public class resultado {

    float[] tiempos;

    public resultado(int numeroCaballos) {
        tiempos = new float[numeroCaballos];
    }
    void resultadoCarrera() {
        for (int i = 0; i < tiempos.length; i++) {
            System.out.println("El caballo " + i + " ha tardado " + tiempos[i] + " segundos");
        }
    }
    
}
