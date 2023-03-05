public class Perro {
    private String raza;
    private String color;
    private byte edad;
    private String nombre;
    private float tamaño;

    public Perro() {
    }

    public Perro(String raza, String nombre, byte edad, String color, float tamaño) {
        this.raza = raza;
        this.nombre = nombre;
        this.edad = edad;
        this.color = color;
        this.tamaño = tamaño;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public byte getEdad() {
        return edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getTamaño() {
        return tamaño;
    }

    public void setTamaño(float tamaño) {
        this.tamaño = tamaño;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "raza='" + raza + '\'' +
                ", color=" + color +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", tamaño=" + tamaño +
                '}';
    }

    public boolean comer() {
        System.out.println(nombre + " esta comiendo");
        boolean resultado = true;
        return resultado;
    }

    public int vivir() {
        int resultado = (int) Math.random();
        if (resultado > 50) {
            System.out.println(nombre + " esta vivo");
        } else {
            System.out.println(nombre + " esta muerto");
        }
        return resultado;
    }

    public boolean jugar() {
        boolean juego = false;
        boolean comer = comer();
        int vivir = vivir();
        if (comer = true && vivir > 50) {
            System.out.println(nombre + " esta jugando");
            juego = true;
        } else {
            System.out.println(nombre + " no puede jugar porque esta muerto");
        }
        return juego;
    }
}
