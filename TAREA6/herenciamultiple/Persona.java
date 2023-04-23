package TAREA6.herenciamultiple;

public class Persona {
    private String nombre;
    private int edad;

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
    }
    public void caminar(){
        System.out.println("Caminando");
    }
    public void dormir(){
        System.out.println("Durmiendo");
    }
}
