import java.util.Scanner;
public class Ejercicio05 {
    public static void main(String[] args) {
        double costoCPU, costoTeclado, costoPantalla, costoComputadora;
        Scanner mu = new Scanner(System.in);
        
        System.out.print("Ingrese el costo del CPU: ");     
        costoCPU = mu.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        costoTeclado = mu.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        costoPantalla = mu.nextDouble();
        costoComputadora = (costoCPU + costoPantalla+ costoTeclado);
        System.out.println("El costo de la computadora es = " + costoComputadora);
    }
}
