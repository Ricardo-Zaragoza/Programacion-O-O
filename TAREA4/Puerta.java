package TAREA4;

import java.util.Scanner;

public class Puerta {
    private double ancho;
    private double alto;
    private String color;
    private boolean cerrada;
    private String material;

    public Puerta() {
    }

    public Puerta(double ancho, double alto, String color, boolean cerrada, String material) {
        this.ancho = ancho;
        this.alto = alto;
        this.color = color;
        this.cerrada = cerrada;
        this.material = material;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isCerrada() {
        return cerrada;
    }

    public void setCerrada(boolean cerrada) {
        this.cerrada = cerrada;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Puerta{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                ", color='" + color + '\'' +
                ", cerrada=" + cerrada +
                ", material='" + material + '\'' +
                '}';
    }

    public boolean llave() {
        int key;
        int llave = (int) (Math.random() * (2 - 1)) + 1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese cuál llave quiere probar? 1 / 2");
        key = lector.nextInt();
        System.out.println(llave);
        while (key != llave) {
            System.out.println("La llave es incorrecta, pruebe otra.");
            System.out.println("Ingrese cuál llave quiere probar? 1 / 2");
            key = lector.nextInt();
        }
        System.out.println("Llave correcta, la puerta se está abriendo.");
        return true;
    }

    public String color() {
        System.out.println("ingrese el color al que quiere pintar la puerta");
        return color;
    }

    public boolean seguro() {
        boolean candado = false;
        int probabilidad = 50;
        if ((int) Math.random() <= 50) {
            System.out.println("se le  ha puesto el seguro a la puerta ");
            candado = true;
        } else {
            System.out.println("la puerta no tiene seguro, es problable que alguien se pueda meter a robar");
        }
        return candado;
    }
}
