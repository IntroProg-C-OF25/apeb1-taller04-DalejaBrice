
import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] args) {
        double ladoCuadrado, hRectang, aTri, aCua, aRec, aTotal;
        Scanner cama = new Scanner(System.in);
        System.out.print("Ingrese un lado del cuadrado: ");
        ladoCuadrado = cama.nextDouble();
        System.out.print("Ingrese la altura del rectangulo: ");
        hRectang = cama.nextDouble();
        aTri = ((ladoCuadrado * hRectang) / 2) * 3;
        aCua = (ladoCuadrado * ladoCuadrado);
        aRec = (ladoCuadrado * hRectang);
        aTotal = (aTri + aCua + aRec);
        System.out.println("El area total de la figura es = " + aTotal);
    }
}
