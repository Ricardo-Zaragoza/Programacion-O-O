public class DRIVERPuerta {
    public static void main(String[] args) {
        Puerta puerta = new Puerta(50, 70, "azul", true, "madera");
        System.out.println(puerta.seguro());
        System.out.println(puerta.llave());
        System.out.println(puerta.color());
        System.out.println(puerta);
    }
}
