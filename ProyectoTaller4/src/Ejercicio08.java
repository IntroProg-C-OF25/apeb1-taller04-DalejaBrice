import java.util.Scanner;
public class Ejercicio08 {
    public static void main(String[] args) {
        double netflix, youtubePremium, dropbox, spotify, pagoTotal;
        int edad;
        Scanner servicios = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        edad = servicios.nextInt();
        System.out.print("Ingrese el pago mensual de Netflix: ");
        netflix = servicios.nextDouble();
        System.out.print("Ingrese el pago mensual de Youtube Premium: ");
        youtubePremium = servicios.nextDouble();
        System.out.print("Ingrese el pago mensual de Dropbox: ");
        dropbox = servicios.nextDouble();
        System.out.print("Ingrese el pago mensual de Spotify: ");
        spotify = servicios.nextDouble();
        pagoTotal = netflix + youtubePremium + dropbox + spotify;
        if (edad < 30) { 
            pagoTotal *= 0.8;
        }
        System.out.println("El total a pagar mensualmente es: " + pagoTotal);
    }
}

