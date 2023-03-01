import java.util.Scanner;

public class Tarea3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce los datos: ");
        String datos = teclado.nextLine();

        System.out.println(datos);

        if (datos.length() == 9) {
            System.out.println("-----");
            System.out.println("|" + datos.charAt(0) + datos.charAt(1) + datos.charAt(2) + "|");
            System.out.println("|" + datos.charAt(3) + datos.charAt(4) + datos.charAt(5) + "|");
            System.out.println("|" + datos.charAt(6) + datos.charAt(7) + datos.charAt(8) + "|");
            System.out.println("-----");
        } else {
            System.out.println(" la cadena debe ser de 9 caracteres");
        }
    }
}