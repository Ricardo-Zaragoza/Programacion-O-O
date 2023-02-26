import java.util.Scanner;

public class Tarea2 {
    public static void main(String[] args) {
        boolean resultado = false;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un texto: ");
        String input = teclado.nextLine();
        System.out.println("tecleaste: " + input);
        for (int i = 0; i < input.length() - 1; i++) {
            if ((int) input.charAt(i + 1) - (int) input.charAt(i) == 1) {
                resultado = true;
                break;
            }
        }
        System.out.print("la cadena es " + resultado);
    }
}