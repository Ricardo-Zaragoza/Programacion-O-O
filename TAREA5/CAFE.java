package TAREA5;

import java.util.Scanner;

public class CAFE {
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public CAFE() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public void Cafe_americano() {
        if (this.agua >= 180 && this.cafe >= 15 && this.vasos > 0) {
            this.agua -= 180; // es lo mismo que -=180;
            this.cafe -= 15;
            this.vasos--;

            System.out.println("se ha servido un CAFE AMERICANO");
        } else {
            System.out.println("no se ha podido hacer un cafe por falta de suministros");
        }
    }

    // -------------------------------------------------------------------------------------
    public void Cafe_expreso() {
        if (this.agua >= 120 && this.cafe >= 14 && this.vasos > 0) {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos--;

            System.out.println("se ha servido un CAFE EXPRESO");
        } else {
            System.out.println("no se ha podido hacer un cafe por falta de suministros");
        }
    }

    // ---------------------------------------------------------------------------------------
    public void Cafe_capuchino() {
        if (this.agua >= 100 && this.cafe >= 14 && this.crema >= 70 && this.vasos > 0) {
            this.agua -= 100;
            this.cafe -= 14;
            this.crema -= 70;
            this.vasos--;

            System.out.println("se ha servido un CAFE CAPUCHINO");
        } else {
            System.out.println("no se ha podido hacer un cafe por falta de suministros");
        }
    }

    public void Estado_Suministros() {
        System.out.println("Suministro de agua: " + this.agua);
        System.out.println("Suministro de cafe: " + this.cafe);
        System.out.println("suministro de crema: " + this.crema);
        System.out.println("suministro de vasos: " + this.vasos);
    }

    public boolean Cafess() {
        return this.vasos > 0 && this.agua >= 100 && this.cafe >= 14 && this.crema >= 70;
    }

    // --------------------------------------------------------------------------------
    public void Hacer_cafe() {
        CAFE cafe = new CAFE();
        Scanner lector = new Scanner(System.in);
        System.out.println("BIENVENIDO A LA CAFETERIA");
        System.out.println("La maquina tiene los siguientes suministros");
        cafe.Estado_Suministros();
        while (cafe.Cafess()) {
            System.out.println("Seleccione el tipo de cafe que va a pedir");
            System.out.println("1.- AMERRICANO");
            System.out.println("2.- EXPRESO");
            System.out.println("3.- CAPUCHINO");
            int cafeS = lector.nextInt();
            switch (cafeS) {

                case 1:
                    cafe.Cafe_americano();
                    break;
                case 2:
                    cafe.Cafe_expreso();
                    break;
                case 3:
                    cafe.Cafe_capuchino();

                default:
                    System.out.println("ingrese una opcion valida");
            }

            cafe.Estado_Suministros();
            System.out.println();
        }
        System.out.println("La máquina ya no puede servir más café.");
        cafe.Estado_Suministros();
    }
}
