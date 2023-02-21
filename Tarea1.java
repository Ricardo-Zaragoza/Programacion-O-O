import java.util.Scanner;

public class Tarea1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escribe tu nombre, profesion y pais de origen: ");
        String entrada = teclado.nextLine();
        System.out.println("entrada: " + entrada.toUpperCase());
        String mayus = entrada.toUpperCase();
        String[] datos = mayus.split(" ");
        System.out.println("Nombre: " + datos[0]);
        System.out.println("Profesion: " + datos[1]);
        System.out.println("Pais: " + datos[2]);
    }
}
