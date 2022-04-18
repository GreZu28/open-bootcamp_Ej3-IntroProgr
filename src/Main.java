public class Main {

    public static void main (String[] args) {
        suma3(1,2,3);
        Coche miCoche = new Coche();
        miCoche.añadirPuerta();
        System.out.println(miCoche.numPuertas);
    }
    public static int suma3(int a, int b, int c) {
        return a + b + c;
    }
}

class Coche {
    public int numPuertas = 4;

    public int añadirPuerta() {
        return this.numPuertas++;
    }
}