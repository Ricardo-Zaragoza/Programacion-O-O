public class DRIVERPerro {
    public static void main(String[] args) {
        Perro Perrito = new Perro("chihuahua", "toby", (byte) 20, "negro", 56);
        System.out.println(Perrito.comer());
        System.out.println(Perrito.vivir());
        System.out.println(Perrito.jugar());
        System.out.println(Perrito);

    }
}
